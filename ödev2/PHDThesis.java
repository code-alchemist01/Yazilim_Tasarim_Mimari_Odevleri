public class PHDThesis {
    private String thesisCode;
    private String thesisTopic;
    private String department;
    
    public PHDThesis(String thesisCode, String thesisTopic, String department) {
        this.thesisCode = thesisCode;
        this.thesisTopic = thesisTopic;
        this.department = department;
    }
    
    public String getThesisCode() {
        return thesisCode;
    }
    
    public void setThesisCode(String thesisCode) {
        this.thesisCode = thesisCode;
    }
    
    public String getThesisTopic() {
        return thesisTopic;
    }
    
    public void setThesisTopic(String thesisTopic) {
        this.thesisTopic = thesisTopic;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
}
