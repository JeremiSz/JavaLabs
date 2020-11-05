package labSheet10.exercise1;

import java.util.Arrays;
import java.util.GregorianCalendar;

public abstract class Lecturer implements Person{

    private String name;
    private String address;
    private GregorianCalendar dateOfBirth;
    private String staffID;
    private String[] coursesTaught;
    private GregorianCalendar dateOfAppointment;

    public Lecturer(String name,String address,GregorianCalendar dateOfBirth,String staffID,String[] coursesTaught,GregorianCalendar dateOfAppointment){
        this.setName(name);
        this.setAddress(address);
        this.setDateOfBirth(dateOfBirth);
        this.setStaffID(staffID);
        this.setCoursesTaught(coursesTaught);
        this.setDateOfAppointment(dateOfAppointment);
    }

    public GregorianCalendar getDateOfAppointment() {
        return dateOfAppointment;
    }

    public String getStaffID() {
        return staffID;
    }

    public String[] getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(String[] coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public void setDateOfAppointment(GregorianCalendar dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", dateOfBirth=" + getDateOfBirth() +
                ", staffID='" + getStaffID() + '\'' +
                ", coursesTaught=" + Arrays.toString(getCoursesTaught()) +
                ", dateOfAppointment=" + getDateOfAppointment() +
                '}';
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public GregorianCalendar getDateOfBirth() {
        return this.dateOfBirth;
    }

    @Override
    public void setName(String nm) {
        this.name = nm;
    }

    @Override
    public void setAddress(String addr) {
        this.address = addr;
    }

    @Override
    public void setDateOfBirth(GregorianCalendar dob) {
this.dateOfBirth = dob;
    }

    public abstract String getStatus();
    public abstract int getPointOnScale();
}
