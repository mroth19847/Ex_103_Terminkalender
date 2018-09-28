
import java.util.ArrayList;
import javax.swing.AbstractListModel;


public class AppointmentModel extends AbstractListModel{

    private ArrayList<Appointment> app = new ArrayList<>();
    @Override
    public int getSize() {
        return app.size();
    }

    @Override
    public Object getElementAt(int index) {
        return app.get(index);
    }
    
    public void add(Appointment a){
        app.add(a);
        fireIntervalAdded(this, app.size()-1, app.size()-1);
    }
    
    public void delete(Appointment a){
        app.remove(a);
        fireContentsChanged(this, 0, app.size()-1);
    }
    
    public void load(){
        
    }
    
    public void save(){
        
    }
    
}
