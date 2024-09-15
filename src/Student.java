import java.util.Date;
public abstract class Student extends Person implements IPerson {
    private float gpa;
    private String major;

    public Student(float gpa, String major, String id, String fullName, Date dateOfBirth) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public void displayInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getFullName());
        System.out.println("Date of Birth: " + getDateOfBirth());                                    
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
    }
}






