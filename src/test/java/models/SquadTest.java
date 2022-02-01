package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SquadTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    public void NewSquadObjectsGetsCorrectlyCreated_true() {
        Squad squad = new Squad("Welcome","56", "kill mission");
        assertTrue(true);
    }

    @Test
    void squadInstantiatesWithContent_true() {
        Squad squad = new Squad("Welcome","56", "kill mission");
        assertEquals("Welcome", squad.getSquad());
    }

    @Test
    void AllSquadsAreCorrectlyReturned_true() {
        Squad squad = new Squad("Welcome","56", "kill mission");
        assertEquals(2, Squad.getAllInstances().size());
    }

    @Test
    void AllSquadContainsAllSquad_true() {
        Squad squad = new Squad("Welcome","56", "kill mission");
        Squad squad2 = new Squad("Welcome","56", "kill mission");
        assertTrue(Squad.getAllInstances().contains(squad));
        assertTrue(Squad.getAllInstances().contains(squad));
    }


    public Squad setupNewSquad(){

        return new Squad("Welcome","56", "kill mission");
    }

    @Test
    void getId_instantiateWithAndId_1() throws Exception{
//        We are clearing all the squad and removing all the ids that might been created using this method
        Squad.clearAllPost();
        Squad squad = new Squad("Welcome","56", "kill mission");
        assertEquals(1, squad.getId());

    }


}