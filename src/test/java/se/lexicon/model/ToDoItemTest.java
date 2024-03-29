package se.lexicon.model;

import org.junit.Before;
import org.junit.Test;
import se.lexicon.model.AppRole;
import se.lexicon.model.AppUser;
import se.lexicon.model.Person;
import se.lexicon.model.ToDoItem;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class ToDoItemTest {

    private ToDoItem testItem;

    AppUser liljana1 = new AppUser("Lile", "lile1234", AppRole.ROLE_APP_ADMIN);
    private Person person = new Person(12345, "Liljana", "Ristevska", "li.ristevska@gmail.com", liljana1 );

    @Before
    public void beforeTest() {


        testItem = new ToDoItem(1, "Go to the store", "Buy fruit", LocalDate.parse("2022-11-20"), false, person);
        System.out.println("--------test-----------");

    }

    @Test
    public void testGetters() {
        assertEquals(1, testItem.getId());
        assertEquals("Go to the store", testItem.getTitle());
        assertEquals("Buy fruit ", testItem.getTaskDescription());
        assertEquals(LocalDate.parse("2022-11-20"), testItem.getDeadLine());
        // assertFalse(.isOverDue());
    }


    @Test
    public void testSetters() {
        testItem.setId(12345);
        testItem.setTitle("Go to the store" );
        testItem.setTaskDescription("Buy frui t" );
        // testItem.setDeadLine(LocalDate.parse(" 2022-11-20 "));
        //testItem.setDone

    }

}


