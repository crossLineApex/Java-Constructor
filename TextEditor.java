import java.util.Scanner;
public class TextEditor {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DocumentEditor editor = new DocumentEditor("Welcome to Text Editor");
        
        boolean exit = false;
        char userInput;

        System.err.println("Application running ...");
        System.err.println("Controls: ");
        System.err.println("Type text to edit the document");
        System.err.println("Press t to edit, Press u to undo, Press r to redo");
        System.err.println("Press x to close the application");
        
        while(!exit){

            System.out.println("enter ...");
            userInput = sc.next().charAt(0);
            sc.nextLine();

            switch (userInput) {
                case 't':
                    System.err.println("Enter text to edit");
                    String inp = sc.nextLine();
                    editor.edit(inp);
                    break;

                case 'u':
                    editor.undo();
                    break;
            
                case 'r':
                    editor.redo();
                    break;

                case 'x':
                    exit = true;
                    break;

                default:
                    System.err.println("Not a valid instruction, try again");
                break;
            }

            System.out.println("____ Text editor says ____");
            editor.printDocument();
        }

        if(exit){
            System.err.println("Program exit ...");
        }
    }
}
