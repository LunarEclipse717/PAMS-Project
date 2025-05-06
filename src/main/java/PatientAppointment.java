import java.time.LocalTime;

public class PatientAppointment {

    private String name;
    private LocalTime time;

    public PatientAppointment(String name, LocalTime time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public LocalTime getTime() {
        return time;
    }
}
