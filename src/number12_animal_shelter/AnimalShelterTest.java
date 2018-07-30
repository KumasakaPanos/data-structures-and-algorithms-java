package number12_animal_shelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalShelterTest {

    @Test
    void inputDog() {
        AnimalShelter testShelter= new AnimalShelter(0);
        testShelter.input(1);
        assertEquals(testShelter.storage.head.Type,1);
    }

    @Test
    void inputCat() {
        AnimalShelter testShelter= new AnimalShelter(1);
        testShelter.input(0);
        assertEquals(testShelter.storage.head.Type,0);
    }

    @Test
    void inputNull() {
        AnimalShelter testShelter= new AnimalShelter(0);
        testShelter.input(2);
        assertEquals(testShelter.storage.head.Type,0);
    }

    @Test
    void adoptEither() {
        AnimalShelter testShelter = new AnimalShelter(0);
        testShelter.input(1);
        testShelter.input(1);
        assertEquals(0,testShelter.adopt().Type);
    }

    @Test
    void adoptCat() {
        AnimalShelter testShelter = new AnimalShelter(1);
        testShelter.input(0);
        assertEquals(0,testShelter.adopt(0).Type);
    }

    @Test
    void adoptDog() {
        AnimalShelter testShelter = new AnimalShelter(0);
        testShelter.input(1);
        testShelter.input(0);
        assertEquals(1,testShelter.adopt(1).Type);
    }
}