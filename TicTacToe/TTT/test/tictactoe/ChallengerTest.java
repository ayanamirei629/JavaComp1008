/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yingge Hu
 */
public class ChallengerTest {
    
    Challenger validChallenger;
    public ChallengerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        validChallenger = new Challenger("Craig", "Hu", "male", 5);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFirstName method, of class Challenger.
     */
    @Test
    public void testGetFirstName() {
        String expResult = "Craig";
        String result = validChallenger.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstName method, of class Challenger.
     */
    @Test
    public void testSetFirstNameCat1(){
        try{
            String result = "Cat1";
            validChallenger.setFirstName(result);
            fail("Cat1 should throw an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.err.println("Invalid first name: "+e.getMessage());
        }
    }
    /**
     * Test of setFirstName method, of class Challenger.
     */
    @Test
    public void testSetFirstNameCat() {
        String expResult = "Cat";
        validChallenger.setFirstName("Cat");
        assertEquals(expResult, validChallenger.getFirstName());
    }
    
    /**
     * Test of setFirstName method, of class Challenger.
     */
    @Test
    public void testSetFirstNameLowKeyCat() {
        try{
            String result = "cat";
            validChallenger.setFirstName(result);
            fail("cat should throw an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.err.println("Invalid first name: "+e.getMessage());
        }
    }

    /**
     * Test of getLastName method, of class Challenger.
     */
    @Test
    public void testGetLastName() {
        String expResult = "Hu";
        String result = validChallenger.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastName method, of class Challenger.
     */
    @Test
    public void testSetLastName() {
        String expResult = "Dog";
        validChallenger.setFirstName("Dog");
        assertEquals(expResult, validChallenger.getFirstName());
    }
    
    /**
     * Test of setLastName method, of class Challenger.
     */
    @Test
    public void testSetLastNameLowKeyDog(){
        try{
            String result = "dog";
            validChallenger.setFirstName(result);
            fail("dog should throw an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.err.println("Invalid first name: "+ e.getMessage());
        }
    }
    
    /**
     * Test of setLastName method, of class Challenger.
     */
    @Test
    public void testSetLastNameDog1(){
        try{
            String result = "Dog1";
            validChallenger.setFirstName(result);
            fail("Dog1 should throw an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.err.println("Invalid first name: "+ e.getMessage());
        }
    }

    /**
     * Test of getGender method, of class Challenger.
     */
    @Test
    public void testGetGender() {
        String expResult = "male";
        String result = validChallenger.getGender();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGender method, of class Challenger.
     */
    @Test
    public void testSetGenderMale() {
        String expResult = "male";
        validChallenger.setGender("male");
        assertEquals(expResult, validChallenger.getGender());
    }

    /**
     * Test of setGender method, of class Challenger.
     */
    @Test
    public void testSetGenderFemale() {
        String expResult = "female";
        validChallenger.setGender("female");
        assertEquals(expResult, validChallenger.getGender());
    }
    
    /**
     * Test of setGender method, of class Challenger.
     */
    @Test
    public void testSetGenderMALE() {
        try{
            String result = "MALE";
            validChallenger.setFirstName(result);
            fail("MALE should throw an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.err.println("Invalid gender: "+ e.getMessage());
        }
    }
    
    /**
     * Test of getAge method, of class Challenger.
     */
    @Test
    public void testGetAge() {
        int expResult = 5;
        int result = validChallenger.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAge method, of class Challenger.
     */
    @Test
    public void testSetAge() {
        int expResult = 25;
        validChallenger.setAge(25);
        assertEquals(expResult, validChallenger.getAge());
    }

    /**
     * Test of setAge method, of class Challenger.
     */
    @Test
    public void testSetAgeNegative() {
        try{
            int result = -2;
            validChallenger.setAge(result);
            fail("-2 should throw an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.err.println("Invalid age: "+ e.getMessage());
        }
    }
    
    /**
     * Test of setAge method, of class Challenger.
     */
    @Test
    public void testSetAgeOver90() {
        try{
            int result = 91;
            validChallenger.setAge(result);
            fail("91 should throw an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.err.println("Invalid age: "+ e.getMessage());
        }
    }
    /**
     * Test of getScore method, of class Challenger.
     */
    @Test
    public void testGetScore() {
        int expResult = 0;
        int result = validChallenger.getScore();
        assertEquals(expResult, result);
    }

    /**
     * Test of updateScore method, of class Challenger.
     */
    @Test
    public void testUpdateScoreAutoWin() {
        try{
            String result = "AutoWin";
            validChallenger.updateScore(result);
            fail("auto win should throw an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.err.println("Invalid result: "+ e.getMessage());
        }
    }
    
    /**
     * Test of updateScore method, of class Challenger.
     */
    @Test
    public void testUpdateScoreWin() {
        int expResult = 1;
        validChallenger.updateScore("win");
        assertEquals(expResult, validChallenger.getScore());
    }
    
    /**
     * Test of updateScore method, of class Challenger.
     */
    @Test
    public void testUpdateScoreLose() {
        int expResult = -1;
        validChallenger.updateScore("lose");
        assertEquals(expResult, validChallenger.getScore());
    }
    
    /**
     * Test of updateScore method, of class Challenger.
     */
    @Test
    public void testUpdateScoreDraw() {
        int expResult = 0;
        validChallenger.updateScore("draw");
        assertEquals(expResult, validChallenger.getScore());
    }
}
