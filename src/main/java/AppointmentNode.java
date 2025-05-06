public class AppointmentNode {
    public PatientAppointment appointment;
    public AppointmentNode left;
    public AppointmentNode right;

    public AppointmentNode(PatientAppointment appointment) {
        this.appointment = appointment;
        this.left = null;
        this.right = null;
    }
}
