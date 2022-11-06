package se.Lexicon;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class ToDoItemTest {

    private ToDoItem testItem;
    private Person person = new Person(12345, "Liljana", "Ristevska","li.ristevska@gmail.com");

    @Before
    public void beforeTest(){


        testItem = new ToDoItem(1, " ---Buy fruit---", " Go to the store ", LocalDate.parse(" 2022-11-20"), false, person);
        System.out.println("--------test-----------");

    }

   @Test
    public void testGetters(){
        assertEquals(1, testItem.getId());
        assertEquals("---Buy fruit---", testItem.getTitle());
        assertEquals("Go to the store", testItem.getTaskDescription());
        assertEquals(LocalDate.parse("2022-11-20"), testItem.getDeadLine());
        assertFalse(testItem.isOverDue());
   }


   @Test
    public void testSetters(){
        testItem.setId(12345);
        testItem.setTitle("---Buy fruit---");
        testItem.setTaskDescription("Go to the store");
        testItem.setDeadLine(LocalDate.parse(" 2022-11-20 "));
        testItem.setDone

   }

}


