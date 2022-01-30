package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    public void NewHeroObjectsGetsCorrectlyCreated_true() {
        Hero hero = new Hero("spider","67", "rocket", "light");
        assertEquals(true, hero instanceof Hero);
    }

    @Test
    void heroInstantiatesWithContent_true() {
        Hero hero = new Hero("spider","67", "rocket", "light");
        assertEquals("spider", hero.getName());
    }

    @Test
    void AllHerosAreCorrectlyReturned_true() {
        Hero hero = new Hero("spider","67", "rocket", "light");
        assertEquals(2, Hero.getAllInstances().size());
    }

    @Test
    void AllHeroContainsAllHero_true() {
        Hero hero = new Hero("spider","67", "rocket", "light");
        Hero hero2 = new Hero("spider","67", "rocket", "light");
        assertEquals(true, Hero.getAllInstances().contains(hero));
        assertEquals(true, Hero.getAllInstances().contains(hero));
    }


    public Hero setupNewHero(){

        return new Hero("spider","67", "rocket", "light");
    }

    @Test
    void getId_instantiateWithAndId_1() throws Exception{
//        We are clearing all the hero and removing all the ids that might been created using this method
        Hero.clearAllPost();
        Hero hero = new Hero("spider","67", "rocket", "light");
        assertEquals(1, hero.getId());

    }


}