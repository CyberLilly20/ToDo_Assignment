package se.lexicon;


import se.lexicon.dao.*;
import se.lexicon.model.*;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        AppUserDao appUserDao = new AppUserDaoCollection(); // container or storage for all accounts
        PersonDao personDao = new PersonDaoCollection();
        ToDoItemDao toDoItemDao = new ToDoItemDaoCollection();
        ToDoItemTaskDao toDoItemTaskDao = new ToDoItemTaskCollection();

        AppUser insertedLiljana = appUserDao.persist(new AppUser("Lile", "lile1234", AppRole.ROLE_APP_ADMIN)); // team leader
        AppUser insertedHusband = appUserDao.persist(new AppUser("Koki", "koki...", AppRole.ROLE_APP_USER)); // dev 1
        //AppUser createdAppUser1 = appUserDao.persist(insertedLiljana);
        //AppUser husband = new AppUser("Koki", "koki...", AppRole.ROLE_APP_USER);


        Person registeredLiljanaPerson = personDao.persist(new Person("Liljana", "Ristevska", "li.ristevska@gimail.com", insertedLiljana));
        Person registeredPerson2 = personDao.persist(new Person("Koki", "Ristevski", "Koki.ristevska@gimail.com", insertedHusband));
        System.out.println(personDao.findAll());
        System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤ ToDo Task ¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");


        ToDoItem item1 = new ToDoItem(1, " Go to the store!", " Buy fruit ", LocalDate.parse("2022-11-20"), false, registeredLiljanaPerson);
        ToDoItem createdItem1 = toDoItemDao.persist(item1);

        System.out.println(item1.toString());

        System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤ Date ¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");

        boolean overDue = item1.isOverDue(item1);
        System.out.println(item1.getTitle() + " Is overdue: " + overDue);

        System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤ Task ToDo¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");

        ToDoItemTask task1 = new ToDoItemTask(10, item1, registeredPerson2);
        ToDoItemTask createdTask1 = toDoItemTaskDao.persist(task1);
        System.out.println(task1.toString());

        System.out.println("Hashcode = " + item1.hashCode());




    }
}







