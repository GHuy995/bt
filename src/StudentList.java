import java.util.ArrayList;
public class StudentList {
    private ArrayList<Student> studentList = new ArrayList<>();
    
    public void addStudent(Student student){
        studentList.add(student);
    }
    public void deteleStudentById(String id){
        studentList.removeIf(student -> student.getId().equals(id));
    }
    public Student findStudent(String id){
        for (Student student : studentList){
            if(student.getId().equals(id)){
                return student;
            }
        }
        return null;
    }
    public void displayAllStudent(){
       for (Student student : studentList){
           student.displayInfo();
           System.out.println("Hien thi tat ca sinh vien");
       }
    }
    public Student findTopStudent(){
        if (studentList.isEmpty()){
        return null;
    }
    Student topStudent = studentList.get(0);
        for (Student student : studentList){
            if (student.getGpa()> topStudent.getGpa()){
                topStudent = student;
            }
        }
        return topStudent;
    }
}
        