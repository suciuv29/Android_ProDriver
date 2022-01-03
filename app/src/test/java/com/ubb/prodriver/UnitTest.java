package com.ubb.prodriver;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import com.ubb.prodriver.data.Attempt;
import com.ubb.prodriver.data.User;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UnitTest {
    @Test
    public void createUser_isCorrect() {
        User user1 = new User("username1", "email1@yahoo.com", "password1");
        assertEquals("username1", user1.getUsername());
        assertEquals("email1@yahoo.com", user1.getEmail());
        assertEquals("password1", user1.getPassword());
    }

    @Test
    public void updatePasswordUser_isCorrect() {
        User user1 = new User("username1", "email1@yahoo.com", "password1");
        user1.setPassword("new_password");

        assertEquals("username1", user1.getUsername());
        assertEquals("email1@yahoo.com", user1.getEmail());
        assertEquals("new_password", user1.getPassword());
    }

    @Test
    public void createAttempt_isCorrect() {
        Attempt attempt1 = new Attempt(120, "Categoria A", 10, 4, 20, "email1@yahoo.com");

        assertEquals(10, attempt1.getCorrect());
        assertEquals("email1@yahoo.com", attempt1.getEmail());
        assertEquals(120, attempt1.getCreatedTime());
        assertEquals(20, attempt1.getEarned());
        assertEquals(4, attempt1.getIncorrect());
        assertEquals("Categoria A", attempt1.getSubject());
    }

    @Test
    public void updateOverallAttempt_isCorrect() {
        Attempt attempt1 = new Attempt(120, "Categoria A", 10, 4, 20, "email1@yahoo.com");
        attempt1.setOverallPoints(100);

        assertEquals(10, attempt1.getCorrect());
        assertEquals("email1@yahoo.com", attempt1.getEmail());
        assertEquals(120, attempt1.getCreatedTime());
        assertEquals(20, attempt1.getEarned());
        assertEquals(4, attempt1.getIncorrect());
        assertEquals("Categoria A", attempt1.getSubject());

        assertEquals(100, attempt1.getOverallPoints());
    }
}