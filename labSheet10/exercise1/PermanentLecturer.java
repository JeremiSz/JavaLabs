package labSheet10.exercise1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PermanentLecturer extends Lecturer{
    private String pensionEntitlements;
    private String status;


    public PermanentLecturer(){
        this("non","non",new GregorianCalendar(),"non",new String[]{"non"},new GregorianCalendar(),"non","non");
    }

    public PermanentLecturer(String name, String address, GregorianCalendar dateOfBirth,String staffID,String[] coursesTaught,GregorianCalendar dateOfAppointment,String pensionEntitlements,String status){
        super(name,address,dateOfBirth,staffID,coursesTaught,dateOfAppointment);
        this.setPensionEntitlements(pensionEntitlements);
        this.setStatus(status);
    }

    public void setPensionEntitlements(String pensionEntitlements) {
        this.pensionEntitlements = pensionEntitlements;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPensionEntitlements() {
        return this.pensionEntitlements;
    }

    @Override
    public String getStatus() {
        return this.status;
    }

    @Override
    public int getPointOnScale() {
        Calendar current = GregorianCalendar.getInstance();
        int timeElapsed = getDateOfAppointment().get(Calendar.YEAR) - current.get(Calendar.YEAR);
        return (timeElapsed < 20)? timeElapsed:20;
    }

    @Override
    public String toString() {
        return "PermanentLecturer{" +
                "pensionEntitlements='" + getPensionEntitlements() + '\'' +
                ", status='" + getStatus() + '\'' +
                '}';
    }
}
