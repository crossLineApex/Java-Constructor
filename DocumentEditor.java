import java.util.Stack;

public class DocumentEditor {

    private Document document;
    private Stack<Document> undoStack = new Stack<>();
    private Stack<Document> redoStack = new Stack<>();

    public DocumentEditor(String content){
        this.document = new Document(content);
    }

    public void edit(String newContent){
        undoStack.push(new Document(document));
        document.setContent(newContent);
        redoStack.empty(); // clear redo history on new edit
    }

    public void undo(){

        if(!undoStack.isEmpty()){
            redoStack.push(new Document(document));
            document = undoStack.pop();
        }else{
            System.err.println("no undo action can be perfomred");
        }

    }

    public void redo(){

        if(!redoStack.isEmpty()){
            undoStack.push(new Document(document));
            document = redoStack.pop();
        }else{
            System.err.println("no redo action can be performed");
        }

    }

    public void printDocument(){
        System.out.println(document); // tries to convert object to string which is overridden
    }
    
}
