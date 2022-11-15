package se.lexicon;


import se.lexicon.dao.AppUserDao;
import se.lexicon.dao.AppUserDaoCollection;
import se.lexicon.model.*;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        AppUserDao appUserDao = new AppUserDaoCollection();


        AppUser insertedLiljana = appUserDao.persist(new AppUser("Lile", "lile1234", AppRole.ROLE_APP_ADMIN));

        AppUser husband = new AppUser("Koki", "koki...", AppRole.ROLE_APP_USER);
        Person liljana = new Person(12345, "Liljana", "Ristevska", "li.ristevska@gimail.com", insertedLiljana);
        System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤ ToDo Task ¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");
        // System.out.println(husband.getSummary());
        System.out.println(liljana);


        ToDoItem item1 = new ToDoItem(1, " Go to the store!", " Buy fruit ", LocalDate.parse("2022-11-20"), false, liljana);
        System.out.println(item1.toString());

        System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤ Date ¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");

        boolean overDue = item1.isOverDue(item1);
        System.out.println(item1.getTitle() + " Is overdue: " + overDue);

        System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤ Task ToDo¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");

        ToDoItemTask task1 = new ToDoItemTask(10, item1, liljana);
        System.out.println(task1.toString());

        System.out.println("Hashcode = " + item1.hashCode());

        //System.out.println("Is the task assigned: " + toDoItem.isOverDue() + " and is assigned to: " + task1.getAssignee());
        ///System.out.println("Task Information " + task1.toString());
        //System.out.println("Is overdue: " + toDoItem.isOverDue());
        /// System.out.println(toDoItem.getSummary());


        // System.out.println(liljana.getSummary(liljana));


    }
}







