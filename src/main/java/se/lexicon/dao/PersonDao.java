package se.lexicon.dao;

import se.lexicon.model.Person;

import java.util.Collection;
import java.util.List;

public interface PersonDao {

    Person persist(Person person);

    Person findById(int id);

    Person findByEmail(String email);

    Collection<Person> findAll();

    void remove(int id);


}
