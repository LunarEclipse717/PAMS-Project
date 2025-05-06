import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

public class AppointmentBSTTest {

    // Test to check if an appointment is successfully inserted into the BST
    @Test
    public void testInsertAppointment() {
        AppointmentBST bst = new AppointmentBST();
        PatientAppointment appt = new PatientAppointment("Alice", LocalTime.of(9, 0));
        bst.addAppointment(appt);

        // Check if the root is not null after insertion
        assertNotNull(bst.getRoot());
        // Check if the appointment's name and time are correctly set
        assertEquals("Alice", bst.getRoot().appointment.getName());
        assertEquals(LocalTime.of(9, 0), bst.getRoot().appointment.getTime());
    }

    // Test to check that duplicate appointment times are not inserted
    @Test
    public void testDuplicateTimeIsNotInserted() {
        AppointmentBST bst = new AppointmentBST();

        // Insert first appointment
        bst.addAppointment(new PatientAppointment("Alice", LocalTime.of(9, 0)));
        // Try to insert another appointment with the same time (duplicate)
        bst.addAppointment(new PatientAppointment("Bob", LocalTime.of(9, 0))); // Duplicate time

        // Check that there is no right child for the root if time is duplicate
        assertNull(bst.getRoot().right);
    }
}
