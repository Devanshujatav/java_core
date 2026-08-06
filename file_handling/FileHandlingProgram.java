import java.io.File;
import java.io.FileWriter;
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

    public static void writeToFile(File file , String data){
        FileWriter writer = null;

        try{
            writer = new FileWriter(file);
            writer.write(data);
            displayWriteSuccessMessage();
        }catch (IOException e){
            displayErrorMessage(e);
        }finally {
            try{
                if (writer != null) {
                    writer.close();
                }
            }catch(IOException e){
                displayErrorMessage(e);
            }
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

    // Data written message
    public static void displayWriteSuccessMessage(){
        System.out.println("Data Written Successfully");
    }

    public static void main(String[] args) {
        File file = getFile("notes.txt");
        createFile(file);

        writeToFile(file, "Hello, this is file handling in java.");
    }
}