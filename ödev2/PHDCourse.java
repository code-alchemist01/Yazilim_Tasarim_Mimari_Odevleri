public class PHDCourse implements Course {
    private String courseCode;
    private String courseName;
    private String courseArea;
    private String courseInstructor;
    
    public PHDCourse(String courseCode, String courseName, String courseArea) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseArea = courseArea;
    }
    
    @Override
    public void setInstructorName(String instructorName) {
        this.courseInstructor = instructorName;
    }
    
    @Override
    public String getInstructorName() {
        return courseInstructor;
    }
    
    public String getCourseCode() {
        return courseCode;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public String getCourseArea() {
        return courseArea;
    }
}
