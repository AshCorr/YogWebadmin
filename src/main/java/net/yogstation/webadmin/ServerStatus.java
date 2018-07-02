package net.yogstation.webadmin;

public class ServerStatus {
    public int players;
    public boolean serverStatus;

    public ServerStatus(int players, boolean serverStatus) {
        this.players = players;
        this.serverStatus = serverStatus;
    }

    public int getPlayers() {
        return players;
    }

    public boolean getServerStatus() {
        return serverStatus;
    }
}
