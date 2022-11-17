package se.lexicon.dao;

import se.lexicon.model.AppUser;
import se.lexicon.model.Person;

import java.util.Collection;
import java.util.List;

public interface AppUserDao {

    AppUser persist(AppUser appUser);

    AppUser findByUsername(String username);

    Collection<AppUser> findAll();

    void remove(int id);

}
