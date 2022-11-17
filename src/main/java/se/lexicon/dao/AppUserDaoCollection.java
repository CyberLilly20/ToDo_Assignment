package se.lexicon.dao;

import se.lexicon.model.AppUser;
import se.lexicon.model.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AppUserDaoCollection implements AppUserDao {

    private List<AppUser> userStorage;

    public AppUserDaoCollection() {
        userStorage = new ArrayList<>();
    }

    @Override
    public AppUser persist(AppUser appUser) {
        if (appUser == null) throw new IllegalArgumentException("AppUser was null");
        AppUser create = findByUsername(appUser.getUsername());
        if (create != null) throw new IllegalArgumentException("You cannot use that username");
        // todo: add appUser into the collection then return it
        userStorage.add(appUser);
        return appUser;
    }

    @Override
    public AppUser findByUsername(String username) {
        if (username == null) throw new IllegalArgumentException("Username was null");
        for (AppUser appUser : userStorage)
            if (appUser.getUsername().equalsIgnoreCase(username)) return appUser;
        return null;
    }

    @Override
    public Collection<AppUser> findAll() {
        return new ArrayList<>(userStorage);
    }

    @Override
    public void remove(int id) {


    }


}
