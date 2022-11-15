package se.lexicon.dao;

import se.lexicon.model.AppUser;

import java.util.ArrayList;
import java.util.List;

public class AppUserDaoCollection implements AppUserDao {

    private List<AppUser> userStorage = new ArrayList<>();


    @Override
    public AppUser persist(AppUser appUser) {
        // todo: add appUser into the collection then return it
        userStorage.add(appUser);
        return appUser;
    }


}
