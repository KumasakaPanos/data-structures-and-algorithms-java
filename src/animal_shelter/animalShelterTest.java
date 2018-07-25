package animal_shelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class animalShelterTest {

    @Test
    void inputDog() {
        animalShelter testShelter= new animalShelter(0);
        testShelter.input(1);
        assertEquals(testShelter.storage.head.Type,1);
    }

    @Test
    void inputCat() {
        animalShelter testShelter= new animalShelter(1);
        testShelter.input(0);
        assertEquals(testShelter.storage.head.Type,0);
    }

    @Test
    void inputNull() {
        animalShelter testShelter= new animalShelter(0);
        testShelter.input(2);
        assertEquals(testShelter.storage.head.Type,0);
    }

    @Test
    void adoptEither() {
        animalShelter testShelter = new animalShelter(0);
        testShelter.input(1);
        testShelter.input(1);
        assertEquals(0,testShelter.adopt().Type);
    }

    @Test
    void adoptCat() {
        animalShelter testShelter = new animalShelter(1);
        testShelter.input(0);
        assertEquals(0,testShelter.adopt(0).Type);
    }

    @Test
    void adoptDog() {
        animalShelter testShelter = new animalShelter(0);
        testShelter.input(1);
        testShelter.input(0);
        assertEquals(1,testShelter.adopt(1).Type);
    }
}