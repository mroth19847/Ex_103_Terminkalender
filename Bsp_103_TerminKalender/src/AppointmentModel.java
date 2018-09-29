
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
    
    public void loadData(File f) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        try {
            Object o;
            while ((o = ois.readObject()) != null) {
                app.add((Appointment) o);
            }
        } catch (EOFException eofExc) {}
        ois.close();
    }
    
    public void saveData(File f) throws Exception{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        for (Appointment s : app) {
            oos.writeObject(s);
        }
        oos.flush();
        oos.close();
    }
    
}
