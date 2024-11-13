public class FullTimeStudent extends Student {
    private PHDProgram phdProgram;
    
    public FullTimeStudent(String registrationNumber, String name) {
        super(registrationNumber, name);
    }
    
    public void setPhdProgram(PHDProgram phdProgram) {
        this.phdProgram = phdProgram;
    }
    
    public PHDProgram getPhdProgram() {
        return phdProgram;
    }
}
