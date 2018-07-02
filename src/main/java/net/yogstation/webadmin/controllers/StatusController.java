package net.yogstation.webadmin.controllers;

import io.github.spair.byond.message.ByondClient;
import io.github.spair.byond.message.ByondMessage;
import io.github.spair.byond.message.ByondResponse;
import net.yogstation.webadmin.Constants;

import net.yogstation.webadmin.ServerStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller    // This means that this class is a Controller
//@RequestMapping(path="/" + Constants.API_VERSION) // This means URL's start with /demo (after Application path)
public class StatusController {
    @GetMapping(path="/status")
    public @ResponseBody ServerStatus getAllUsers() {
        ByondMessage message = new ByondMessage(Constants.BYOND_SERVER, Constants.BYOND_PORT, "ping");
        ByondResponse response = ByondClient.sendMessage(message);

        ServerStatus serverStatus = new ServerStatus((int) Float.parseFloat(response.getResponse().toString()), true);
        // This returns a JSON or XML with the users
        return serverStatus;
    }
}