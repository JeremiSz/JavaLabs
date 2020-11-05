package labSheet10.exercise1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TemporaryLecturer extends Lecturer{
    private int hoursWorked;

    public TemporaryLecturer(){
        this("non","non",new GregorianCalendar(),"non",new String[]{"non"},new GregorianCalendar(),0);
    }
    public TemporaryLecturer(String name, String address, GregorianCalendar dateOfBirth,String staffID,String[] coursesTaught,GregorianCalendar dateOfAppointment, int hoursWorked){
        super(name, address, dateOfBirth, staffID, coursesTaught, dateOfAppointment);
        setHoursWorked(hoursWorked);
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public String getStatus() {
        return "Contracted temporary lecturer on part-time hours";
    }

    @Override
    public int getPointOnScale() {
        Calendar current = GregorianCalendar.getInstance();
        int timeElapsed = getDateOfAppointment().get(Calendar.YEAR) - current.get(Calendar.YEAR);
        if(timeElapsed >= 3){
            if(getHoursWorked() >1500) return 4;
            else if(getHoursWorked() >1000) return (int)Math.floor((getHoursWorked()*1.33)/700);
        }
        return timeElapsed;
    }

    @Override
    public String toString() {
        return "TemporaryLecturer{" +
                "hoursWorked=" + getHoursWorked() +
                '}';
    }
}
