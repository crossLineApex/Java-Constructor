public class Document {
    
    private String content;

    public Document(String content){
        this.content= content;
    }

    //copy constructor
    public Document(Document other) {
        this.content = other.content;
    }

    public String getContent(){
        return this.content;
    }

    public void setContent(String content){
        this.content = content;
    }

    // since every class inherits from Object Class by default
    @Override
    public String toString(){
        return "Document: " + content;
    }
}
