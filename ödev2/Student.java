public abstract class Student {
    private String registrationNumber;
    private String name;
    
    public Student(String registrationNumber, String name) {
        this.registrationNumber = registrationNumber;
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    
    public String getName() {
        return name;
    }
}
