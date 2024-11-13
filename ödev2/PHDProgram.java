import java.util.ArrayList;
import java.util.List;

public class PHDProgram {
    private String deptCode;
    private List<Student> students;
    private List<PHDCourse> courses;
    private List<PHDThesis> theses;
    private FullTimeStudent fullTimeStudent;
    private PartTimeStudent partTimeStudent;
    
    public PHDProgram(String deptCode) {
        this.deptCode = deptCode;
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.theses = new ArrayList<>();
    }
    
    public void addStudent(Student student) {
        students.add(student);
        if (student instanceof FullTimeStudent) {
            ((FullTimeStudent) student).setPhdProgram(this);
        } else if (student instanceof PartTimeStudent) {
            ((PartTimeStudent) student).setPhdProgram(this);
        }
    }
    
    public void registerCourse(Student student, PHDCourse course) {
        if (students.contains(student)) {
            courses.add(course);
            System.out.println(student.getName() + " başarıyla " + course.getCourseName() + " dersine kaydoldu.");
        } else {
            System.out.println("Öğrenci bu programa kayıtlı değil!");
        }
    }
    
    public void registerThesis(Student student, PHDThesis thesis) {
        if (students.contains(student)) {
            theses.add(thesis);
            System.out.println(student.getName() + " başarıyla " + thesis.getThesisTopic() + " tezine kaydoldu.");
        } else {
            System.out.println("Öğrenci bu programa kayıtlı değil!");
        }
    }
    
    public String getDeptCode() {
        return deptCode;
    }
    
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }
    
    public FullTimeStudent getFullTimeStudent() {
        return fullTimeStudent;
    }
    
    public void setFullTimeStudent(FullTimeStudent fullTimeStudent) {
        this.fullTimeStudent = fullTimeStudent;
    }
    public PartTimeStudent getPartTimeStudent() {
        return partTimeStudent;
    }
    
    public void setPartTimeStudent(PartTimeStudent partTimeStudent) {
        this.partTimeStudent = partTimeStudent;
    }
    
    public Student findStudent(String registrationNumber) {
        for (Student student : students) {
            if (student.getRegistrationNumber().equals(registrationNumber)) {
                return student;
            }
        }
        return null;
    }
    
    public void displayStudents() {
        for (Student student : students) {
            System.out.println("- " + (student instanceof FullTimeStudent ? "Tam Zamanlı: " : "Yarı Zamanlı: ") 
                              + student.getName() + " (" + student.getRegistrationNumber() + ")");
        }
    }
}
