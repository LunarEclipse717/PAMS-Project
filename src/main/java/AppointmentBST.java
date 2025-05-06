import java.time.LocalTime;

public class AppointmentBST {

    public AppointmentNode root;

    public void addAppointment(PatientAppointment appointment) {
        root = insertRec(root, appointment);
    }

    public AppointmentNode insertRec(AppointmentNode root, PatientAppointment appointment) {
        if (root == null) {
            return new AppointmentNode(appointment);
        }

        LocalTime newTime = appointment.getTime();
        LocalTime existingTime = root.appointment.getTime();

        if (newTime.equals(existingTime)) {
            System.out.println("Duplicate appointment time not allowed.");
            return root;
        } else if (newTime.isBefore(existingTime)) {
            root.left = insertRec(root.left, appointment);
        } else {
            root.right = insertRec(root.right, appointment);
        }

        return root;
    }

    public void inOrderTraversal(AppointmentNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.appointment.getTime() + " - " + node.appointment.getName());
            inOrderTraversal(node.right);
        }
    }

    public AppointmentNode getRoot() {
        return root;
    }
}
