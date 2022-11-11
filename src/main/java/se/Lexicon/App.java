package se.Lexicon;


import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;

public class App {
    public static <TodoItem> void main(String[] args) {

        //Person husband = new Person(678910, "Konstantin", "Ristevski", "ko.ristevski@gmail.com");
        Person liljana = new Person(12345, "Liljana", "Ristevska", "li.ristevska@gimail.com");
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







