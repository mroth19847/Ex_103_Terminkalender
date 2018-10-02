
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DayInCal {
    private LocalDate date;
    private int x;
    private int y;
    private boolean hasTermin = false;
    private String text = "";
    private LocalTime time;

    public DayInCal(LocalDate date, int x, int y) {
        this.date = date;
        this.x = x;
        this.y = y;
    }

    public String getText() {
        return text;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setHasTermin(boolean hasTermin) {
        this.hasTermin = hasTermin;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean hasTermin() {
        return hasTermin;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
     
        
    public Graphics2D draw(Graphics2D g){
        g.setColor(Color.WHITE);
        if(hasTermin){
            g.setColor(Color.GREEN);
        }
        g.fillRect(x, y, 100,100);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 100,100);
        g.setFont(new Font("Carstellar",Font.PLAIN, 12));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM");
        g.drawString(""+dtf.format(date), x+5, y-20);
        if(hasTermin){
            dtf = DateTimeFormatter.ofPattern("HH:mm");
            g.drawString(""+dtf.format(time), x+5, y-40);
            g.drawString(text, x, y-60);
        }
        return g;
    }
    
}
