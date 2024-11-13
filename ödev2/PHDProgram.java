import java.util.List;
import java.util.ArrayList;

public class PHDProgram {
    private String deptCode;
    private List<Student> students;
    private List<PHDCourse> courses;
    private List<PHDThesis> theses;
    
    public PHDProgram(String deptCode) {
        this.deptCode = deptCode;
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.theses = new ArrayList<>();
    }
    
    public void addStudent(Student student) {
        students.add(student);
        student.setPhdProgram(this);
        System.out.println(student.getName() + " programına başarıyla eklendi.");
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
            if (student instanceof FullTimeStudent) {
                theses.add(thesis);
                ((FullTimeStudent) student).setThesis(thesis);
                System.out.println(student.getName() + " başarıyla " + thesis.getThesisTopic() + " tezine kaydoldu.");
            } else {
                System.out.println("Sadece tam zamanlı öğrenciler tez kaydı yapabilir!");
            }
        } else {
            System.out.println("Öğrenci bu programa kayıtlı değil!");
        }
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
        if (students.isEmpty()) {
            System.out.println("Kayıtlı öğrenci bulunmamaktadır.");
            return;
        }
        for (Student student : students) {
            System.out.println("- " + (student instanceof FullTimeStudent ? "Tam Zamanlı: " : "Yarı Zamanlı: ") 
                              + student.getName() + " (" + student.getRegistrationNumber() + ")");
        }
    }

    public void displayCourses() {
        if (courses.isEmpty()) {
            System.out.println("Kayıtlı ders bulunmamaktadır.");
            return;
        }
        for (PHDCourse course : courses) {
            System.out.println("- " + course.getCourseCode() + ": " + course.getCourseName());
        }
    }

    public void displayTheses() {
        if (theses.isEmpty()) {
            System.out.println("Kayıtlı tez bulunmamaktadır.");
            return;
        }
        for (PHDThesis thesis : theses) {
            System.out.println("- " + thesis.getThesisCode() + ": " + thesis.getThesisTopic());
        }
    }
    
    public String getDeptCode() {
        return deptCode;
    }
    
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }
    
    public List<Student> getStudents() {
        return students;
    }
    
    public List<PHDCourse> getCourses() {
        return courses;
    }
    
    public List<PHDThesis> getTheses() {
        return theses;
    }
}
