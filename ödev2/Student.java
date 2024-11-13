public abstract class Student {
    private String registrationNumber;
    private String name;
    private PHDProgram phdProgram;
    
    public Student(String registrationNumber, String name) {
        this.registrationNumber = registrationNumber;
        this.name = name;
    }
    
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public PHDProgram getPhdProgram() {
        return phdProgram;
    }
    
    public void setPhdProgram(PHDProgram phdProgram) {
        this.phdProgram = phdProgram;
    }
}
