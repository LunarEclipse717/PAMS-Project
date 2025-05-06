import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        AppointmentBST bst = new AppointmentBST();

        bst.addAppointment(new PatientAppointment("Alice", LocalTime.of(9, 0)));
        bst.addAppointment(new PatientAppointment("Bob", LocalTime.of(10, 0)));
        bst.addAppointment(new PatientAppointment("Charlie", LocalTime.of(8, 30)));
        bst.addAppointment(new PatientAppointment("Diana", LocalTime.of(10, 30)));

        System.out.println("Appointments in order of time:");
        bst.inOrderTraversal(bst.getRoot());
    }
}
