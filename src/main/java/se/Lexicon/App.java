package se.Lexicon;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;

public class App {
    public static <TodoItem> void main(String[] args) {
        //Person husband = new Person(678910, "Konstantin", "Ristevski", "ko.ristevski@gmail.com");
        Person liljana = new Person(12345, "Liljana", "Ristevska", "li.ristevska@gimail.com");

        // System.out.println(husband.getSummary());
        System.out.println(liljana.getSummary());


        ToDoItem item1 = new ToDoItem(1, " ---Buy fruit---", " Go to the store ", LocalDate.parse(" 2022-11-20"), false, liljana);
        System.out.println(item1.getSummary());

        boolean overDue = item1.isOverDue(item1);
        System.out.println(item1.getTitle() + " " + overDue);

        //ToDoItemTask task1 = new ToDoItemTask(10, true, item1, liljana);
       // System.out.println(task1.getSummary(task1));


        ToDoItemTask task1 = new ToDoItemTask(10, true, item1.getTitle(), liljana);
        System.out.println(task1.getSummary(task1));

        //System.out.println("Is the task assigned: " + toDoItem.isOverDue() + " and is assigned to: " + task1.getAssignee());
        ///System.out.println("Task Information " + task1.toString());
        //System.out.println("Is overdue: " + toDoItem.isOverDue());
        /// System.out.println(toDoItem.getSummary());


       // System.out.println(liljana.getSummary(liljana));






    }
}







