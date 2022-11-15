package se.lexicon.model;

import org.junit.Before;
import org.junit.Test;
import se.lexicon.model.*;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class ToDoItemTaskTest {


    private ToDoItemTask testTask;

    AppUser liljana1 = new AppUser("Lile", "lile1234", AppRole.ROLE_APP_ADMIN);
    Person testPerson = new Person(12345, "Liljana", "Ristevska", "li.ristevska@gmail.com", liljana1);
    ToDoItem testItem = new ToDoItem(1, " Go to the store!", " Buy fruit ", LocalDate.parse("2022-11-20"), false, testPerson);
    @Before
    public void beforeTest() {


        testTask = new ToDoItemTask (10, testItem, testPerson);
        System.out.println("--------test-----------");

    }

    @Test
    public void testGetters() {
        assertEquals(10, testTask.getId());
        ToDoItem expectedTodoItem = new ToDoItem(1, " Go to the store!", " Buy fruit ", LocalDate.parse("2022-11-20"), false, testPerson);
        ToDoItem actualTodoItem = testTask.getTodoItem();
        assertEquals(expectedTodoItem.getTitle(), actualTodoItem.getTitle());
        assertEquals(expectedTodoItem.getId(), actualTodoItem.getId());
        assertEquals(expectedTodoItem.getDeadLine(), actualTodoItem.getDeadLine());

    }


    @Test
    public void testSetters() {

        testTask.setTodoItem(testItem );
        testTask.setAssignee(testPerson );


    }





}
