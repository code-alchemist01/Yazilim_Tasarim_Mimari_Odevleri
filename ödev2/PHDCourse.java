public class PHDCourse {
    private String courseCode;
    private String courseName;
    private String department;
    
    public PHDCourse(String courseCode, String courseName, String department) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.department = department;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public String getCourseCode() {
        return courseCode;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
}
