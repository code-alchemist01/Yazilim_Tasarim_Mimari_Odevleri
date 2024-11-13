public class PHDThesis {
    private String thesisCode;
    private String thesisTopic;
    private String thesisArea;
    
    public PHDThesis(String thesisCode, String thesisTopic, String thesisArea) {
        this.thesisCode = thesisCode;
        this.thesisTopic = thesisTopic;
        this.thesisArea = thesisArea;
    }
    
    public String getThesisCode() {
        return thesisCode;
    }
    
    public String getThesisTopic() {
        return thesisTopic;
    }
    
    public String getThesisArea() {
        return thesisArea;
    }
}
