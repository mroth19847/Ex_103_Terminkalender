
import java.util.Comparator;

public class SortAppointments implements Comparator<Appointment>{

    @Override
    public int compare(Appointment o1, Appointment o2) {
        if(o1.getDate().isBefore(o2.getDate())) return -1;
        if(o1.getDate().isAfter(o2.getDate())) return 1;
        return 0;
    }
    
}
