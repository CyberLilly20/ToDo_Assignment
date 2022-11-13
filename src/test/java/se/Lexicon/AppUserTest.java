package se.Lexicon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppUserTest {

    private AppUser testAppUser;

    @Before
    public void beforeTest(){

        testAppUser=new AppUser("Lile", "lile1234", AppRole.ROLE_APP_ADMIN);
    }

    @Test
     public void testGetters(){
        assertEquals("Lile", testAppUser.getUsername());
        assertEquals("lile1234", testAppUser.getPassword());
        assertEquals(AppRole.ROLE_APP_ADMIN, testAppUser.getAppRole());
    }
    @Test
    public void testSetters(){
     testAppUser.setUsername("Lile");
     testAppUser.setPassword("lile1234");
     testAppUser.setAppRole(AppRole.ROLE_APP_ADMIN);

    }


}
