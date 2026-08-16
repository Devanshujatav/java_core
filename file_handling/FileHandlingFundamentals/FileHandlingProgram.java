import java.io.File;
import java.io.FileReader;
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

    public static void appendToFile(File file , String data){
        FileWriter writer = null;

        try{
            writer = new FileWriter(file, true);
            writer.write(data);
            displayAppendSuccessMessage();
        }catch(IOException e){
            displayErrorMessage(e);
        }finally{
            try {
                if (writer != null) {
                    writer.close();     
                }
            } catch (IOException e) {
                displayErrorMessage(e);
            }
        }
    }

    public static void readFile(File file){
        FileReader reader = null;

        try{
            reader = new FileReader(file);
            int ch;

            while ((ch = reader.read())!=-1) {
                System.out.print(
                    (char) ch
                );
            }
            displayReadSuccessMessage();
        }catch(IOException e){
            displayErrorMessage(e);
        }finally{
            try{
                if (reader != null) {
                    reader.close();
                }
            }catch(IOException e){
                displayErrorMessage(e);
            }
        }
    }

    public static void deleteFile(File file){
        if (file.delete()) {
            displayDeleteSuccessMessage();
        }else{
            displayDeleteErrorMessage();
        }
    }

    public static void checkFile(File file){
        if (file.exists()) {
            displayFileExistsMessage();
        }else{
            displayFileNotExistsMessage();
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

    // Data Append Message
    public static void displayAppendSuccessMessage(){
        System.out.println("Data Appended Successfully");
    }

    // Data Read Message
    public static void displayReadSuccessMessage(){
        System.out.println("\n Data Read Successfully.");
    }

    // Data Delete Message
    public static void displayDeleteSuccessMessage(){
        System.out.println("File Deleted Successfully.");
    }

    // Data Delete Error Message
    public static void displayDeleteErrorMessage(){
        System.out.println("File not found or could not delete.");
    }


    public static void displayFileNotExistsMessage(){
        System.out.println("File not exists message.");
    }

    public static void main(String[] args) {
        File file = getFile("notes.txt");
        createFile(file);

        writeToFile(file, "Hello, this is file handling in java.");

        appendToFile(file, "\nthis line is appended.");

        readFile(file);
    }
}