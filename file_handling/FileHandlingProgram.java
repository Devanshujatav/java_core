import java.io.File;
import java.io.IOException;


public class FileHandlingProgram {

    public static File getFile(String fileName){
        return new File(fileName);
    }

    public static void createFile(File file){
        try{
            if (file.createNewFile()) {
                displaySuccessMessage();
            }else{
                displayFileExistsMessage();
            }
        } catch(IOException e){
            displayErrorMessage(e);
        }
    }

    // File created message
    public static void displaySuccessMessage(){
        System.out.println("File Created Successfully.");
    }

    // File already exists message
    public static void displayFileExistsMessage(){
        System.out.println("File already exists.");
    }

    // Error message
    public static void displayErrorMessage(IOException e){
        System.out.println("Error : " + e.getMessage());
    }

    public static void main(String[] args) {
        File file = getFile("notes.txt");
        createFile(file);
    }

}