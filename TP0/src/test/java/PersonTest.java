import org.example.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getFullNameShouldReturnCorrectFullName() {
        // Arrange
        Person person = new Person("seif eddine", "Bouacha", 22);

        // Act
        String fullName = person.getFullName();

        // Assert
        assertEquals("seif eddine Bouacha", fullName);
    }

    @Test
    void isAdultShouldReturnTrueForAdultPerson() {
        // Arrange
        Person adultPerson = new Person("seif", "eddine", 22);

        // Act
        boolean isAdult = adultPerson.isAdult();

        // Assert
        assertTrue(isAdult);
    }

    @Test
    void isAdultShouldReturnFalseForNonAdultPerson() {
        // Arrange
        Person nonAdultPerson = new Person("Bob", "Smith", 17);

        // Act
        boolean isAdult = nonAdultPerson.isAdult();

        // Assert
        assertFalse(isAdult);
    }
}