package se.lexicon.dao;

import se.lexicon.model.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PersonDaoCollection implements PersonDao {


    private List<Person> personList;

    public PersonDaoCollection() {
        this.personList = new ArrayList<>();
    }


    @Override
    public Person persist(Person person) {
        if (person == null) throw new IllegalArgumentException("Person is null");
        Person findId = findById(person.getId());
        for (Person per : personList) ;
        personList.add(person);

        return person;
    }

    @Override
    public Person findById(int id) {
        if (id == 0) throw new IllegalArgumentException("Id is null");
        for (Person person : personList) {
            if (person.getId() != 0 && person.getId() == id) return person;
        }
        return null;
    }

    @Override
    public Person findByEmail(String email) {
        if (email == null) throw new IllegalArgumentException("Email is null");
        for (Person person : personList) {
            if (person.getEmail().equalsIgnoreCase(email)) return person;
        }
        return null;
    }

    @Override
    public Collection<Person> findAll() {
        return new ArrayList<>(personList);
    }

    @Override
    public void remove(int id) {
        if (id == 0) throw new IllegalArgumentException("Person is not fond");
        Person findId = findById(id);
        if (findId == null) throw new IllegalArgumentException("Person is not fond to remove");
        personList.remove(id);

    }
}
