package UsingCalesthenics.Exercise13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ActualDate {
    private DateTimeFormatter dtf;

    public ActualDate() {
        this.dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    }

    public String DateFormated(){
        return "The actual date is: " + this.dtf.format(LocalDateTime.now());
    }
}
