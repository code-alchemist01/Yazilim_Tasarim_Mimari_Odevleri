public class FullTimeStudent extends Student {
    private PHDThesis thesis;
    
    public FullTimeStudent(String registrationNumber, String name) {
        super(registrationNumber, name);
    }
    
    public PHDThesis getThesis() {
        return thesis;
    }
    
    public void setThesis(PHDThesis thesis) {
        this.thesis = thesis;
    }
}
