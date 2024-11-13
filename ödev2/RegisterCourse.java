public class RegisterCourse {
    private PHDCourse course;
    private Student student;
    private PHDProgram program;
    
    public RegisterCourse(PHDCourse course, Student student, PHDProgram program) {
        this.course = course;
        this.student = student;
        this.program = program;
    }
    
    public PHDCourse getCourse() {
        return course;
    }
    
    public void setCourse(PHDCourse course) {
        this.course = course;
    }
    
    public Student getStudent() {
        return student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }
    
    public PHDProgram getProgram() {
        return program;
    }
    
    public void setProgram(PHDProgram program) {
        this.program = program;
    }
}
