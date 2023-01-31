public class ActiveAccount extends Account {
    private boolean active;
    private boolean online;

    public ActiveAccount() {
    }

    public ActiveAccount(boolean active, boolean online) {
        this.active = active;
        this.online = online;
    }

    public ActiveAccount(String id, String username, String password, boolean active, boolean online) {
        super(id, username, password);
        this.active = active;
        this.online = online;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }
}
