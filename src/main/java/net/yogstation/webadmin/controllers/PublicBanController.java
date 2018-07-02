package net.yogstation.webadmin.controllers;

import com.fasterxml.jackson.annotation.JsonView;
import net.yogstation.webadmin.Views;
import net.yogstation.webadmin.database.entities.BanEntity;
import net.yogstation.webadmin.database.repositories.BanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/public")
public class PublicBanController {
    @Autowired
    private BanRepository banRepository;

    @JsonView(Views.Public.class)
    @RequestMapping(path="/bans", method=RequestMethod.GET)
    public @ResponseBody
    Iterable<BanEntity> getBans (@RequestParam int page
            , @RequestParam(defaultValue = "50") int limit, @RequestParam(defaultValue = "all") String ckey) {

        if(ckey.equalsIgnoreCase("all")) {
            return banRepository.findAll(PageRequest.of(page, limit)).getContent();
        }
        else {
           return banRepository.findAllByCkey(ckey, PageRequest.of(page, limit));
        }
    }
}