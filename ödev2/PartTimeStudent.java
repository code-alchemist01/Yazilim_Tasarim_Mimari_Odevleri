public class PartTimeStudent extends Student {
    private PHDProgram phdProgram;
    
    public PartTimeStudent(String registrationNumber, String name) {
        super(registrationNumber, name);
    }
    
    public void setPhdProgram(PHDProgram phdProgram) {
        this.phdProgram = phdProgram;
    }
    
    public PHDProgram getPhdProgram() {
        return phdProgram;
    }
}
