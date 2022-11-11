package se.Lexicon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    private Person testPerson;
    //private Person testPerson2 = new Person();




    @Before
    public void beforeTest(){
        testPerson =new Person(12345, "Liljana", "Ristevska", "li.ristevska@gmail.com");
        System.out.println("----------------------Test------------------------");
    }

    @Test
    public void testGetters(){
        assertEquals(12345, testPerson.getId());
        assertEquals("Liljana", testPerson.getFirstName());
        assertEquals("Ristevska", testPerson.getLastName());
        assertEquals("li.ristevska@gmail.com", testPerson.getEmail());
    }

    @Test
    public void testSetters(){
        testPerson.setId(11);
        testPerson.setFirstName("Liljana");
        testPerson.setLastName("Ristevska");
        testPerson.setEmail("li.ristevska@gmail.com");

        assertEquals(11, testPerson.getId());
        assertEquals("Liljana", testPerson.getFirstName());
        assertEquals("Ristevska", testPerson.getLastName());
        assertEquals("li.ristevska@gmail.com", testPerson.getEmail());
    }

    @Test
    public void getSummaryTest(){
        assertEquals("ID:12345  Name:Liljana Ristevska email:li.ristevska@gmail.com", testPerson.getSummary());
    }

}
