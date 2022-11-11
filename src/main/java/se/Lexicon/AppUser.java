package se.Lexicon;

import java.util.Objects;

public class AppUser {

    private String username;
    private String password;
    private AppRole appRole;


    //constructors

    public AppUser(String username, String password, AppRole appRole) {
        this.username = username;
        this.password = password;
        this.appRole = appRole;
    }
    //methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AppUser)) return false;
        AppUser appUser = (AppUser) o;
        return getUsername().equals(appUser.getUsername()) && getAppRole().equals(appUser.getAppRole());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getAppRole());
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "username='" + username + '\'' +
                ", appRole=" + appRole +
                '}';
    }


//getters & setters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username == null) throw new IllegalArgumentException("The username cannot be null");
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null) throw new IllegalArgumentException("The password cannot be null");
        this.password = password;
    }

    public AppRole getAppRole() {
        return appRole;
    }

    public void setAppRole(AppRole appRole) {
        if (appRole == null) throw new IllegalArgumentException("The AppRole cannot be null");
        this.appRole = appRole;
    }
}
