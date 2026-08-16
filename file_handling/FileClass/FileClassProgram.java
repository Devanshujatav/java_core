import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileClassProgram {
    // Base Directory
    static String basePath = "FileClass";

    // EXISTS()
    public static void checkExists(File file){
        if (file.exists()) {
            System.out.println("EXISTS : " + file.getPath());
        }else{
            System.out.println("DOES NOT EXISTS : " + file.getPath());
        }
    }

    // CREATE NEW FILE
    public static void createFile(File file){
        try{
            if (file.createNewFile()) {
                System.out.println("File Created Successfully : " + file.getPath());
            }else{
                System.out.println("File Already Exists : " + file.getPath());
            }
        }catch(IOException e){
            System.out.println("Error while creating file : " + e.getMessage());
        }
    }


    // MKDIR
    public static void createDirectory(File directory){
        if (directory.mkdir()) {
            System.out.println("Directory Created : " + directory.getPath());
        }else{
            System.out.println("Directory could not be created. It may already exists. " + "or parents directory may not exists.");
        }
    }

    // mkdirs
    public static void createNestedDirectories(File directory){
        if (directory.mkdirs()) {
            System.out.println("Nested Directories Created : " + directory.getPath());
        }else{
            System.out.println("Nested directories could not be created" + " They may already exists.");
        }
    }

    // Delete file or directory
    public static void deleteFileOrDirectory(File file){
        if (!file.exists()) {
            System.out.println("File/Directory does not Exists.");
            return;
        }

        if (file.delete()) {
            System.out.println("Delete Successfully." + file.getPath());
        }
    }

    // Rename / Move File
    public static void renameFile(File source , File destination){
        if (!source.exists()) {
            System.out.println("Source file/directory does not exists.");
            return;
        }

        if (source.renameTo(destination)) {
            System.out.println("Renamed / Moved Successfully.");
        }else{
            System.out.println("Rename/Move operation failed.");
        }
    }
}