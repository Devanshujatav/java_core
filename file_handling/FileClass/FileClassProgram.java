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

    // Check for the directory
    public static void checkIsDirectory(File file){
        if (file.isDirectory()) {
            System.out.println(file.getPath() + " is a Directory.");
        }else{
            System.out.println(file.getPath() + " is NOT a Directory.");
        }
    }

    // ---------------------------------------------------------
    // 9. canRead()
    // Checks whether file can be read
    // ---------------------------------------------------------
    public static void checkCanRead(File file){
        if (file.canRead()) {
            System.out.println("Read Permission : YES");
        }else{
            System.out.println("Read Permission : NO");
        }
    }

    // ---------------------------------------------------------
    // 10. canWrite()
    // Checks whether file can be written
    // ---------------------------------------------------------
    public static void checkCanWrite(File file){
        if (file.canWrite()) {
            System.out.println("Write Permission : YES");
        }else{
            System.out.println("Write Permission : NO");
        }
    }

    // ---------------------------------------------------------
    // 11. canExecute()
    // Checks whether file can be executed
    // ---------------------------------------------------------
    public static void checkCanExecute(File file){
        if (file.canExecute()) {
            System.out.println("Execute Permission : YES");
        }else{
            System.out.println("Execute Permission : NO");
        }
    }

    // ---------------------------------------------------------
    // 12. getName()
    // Returns only the file/directory name
    // ---------------------------------------------------------
    public static void displayName(File file){
        System.out.println("File/Directory Name : " + file.getName());
    }

    // ---------------------------------------------------------
    // 13. getPath()
    // Returns path as given while creating File object
    // ---------------------------------------------------------
    public static void displayPath(File file){
        System.out.println("Path : " + file.getPath());
    }

    // ---------------------------------------------------------
    // 14. getAbsolutePath()
    // Returns complete absolute path
    // ---------------------------------------------------------
    public static void displayAbsolutePath(File file){
        System.out.println("Absolute Path : " + file.getAbsolutePath());
    }

    // ---------------------------------------------------------
    // 15. getCanonicalPath()
    // Returns cleaned-up absolute path
    // Removes things like . and ..
    // ---------------------------------------------------------
    public static void displayCanonicalPath(File file){
        try {
            System.out.println("Canonical Path : " + file.getCanonicalPath());
        } catch (IOException e) {
            System.out.println("Error getting Canonical Path : " + e.getMessage());
        }
    }

    // ---------------------------------------------------------
    // 16. length()
    // Returns size of file in bytes
    // ---------------------------------------------------------
    public static void displayLength(File file){
        System.out.println("File Size : " + file.length() + " bytes.");
    }

    // ---------------------------------------------------------
    // 17. lastModified()
    // Returns last modified time
    // ---------------------------------------------------------
    public static void displayLastModified(File file){
        long time = file.lastModified();

        if (time == 0) {
            System.out.println("Could not determine last modified time.");
            return;
        }

        Date date = new Date(time);

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        System.out.println("Last Modified : " + formatter.format(date));
    }

    // ---------------------------------------------------------
    // 18. list()
    // Returns names of files/directories inside directory
    // ---------------------------------------------------------
    public static void listNames(File directory){
        if (!directory.isDirectory()) {
            System.out.println("Given Path is not a Directory.");
            return;
        }

        String[] names = directory.list();

        if (names == null) {
            System.out.println("Unable to read the directory.");
            return;
        }

        if (names.length == 0) {
            System.out.println("Directory is Empty.");
        }

        for (String name : names) {
            System.out.println(name);
        }
    }

    // ---------------------------------------------------------
    // 19. listFiles()
    // Returns File[] objects inside directory
    // ---------------------------------------------------------
    public static void listFileObjects(File directory){
        if (!directory.isDirectory()) {
            System.out.println("Given Path is not a Directory.");
            return;
        }

        File[] files = directory.listFiles();

        if (files == null) {
            System.out.println("Unable to read directory.");
            return;
        }

        if (files.length == 0) {
            System.out.println("Directory is Empty.");
        }

        for(File file : files){
            if (file.isFile()) {
                System.out.println("FILE        : " + file.getPath());
            }else if (file.isDirectory()) {
                System.out.println("DIRECTORY         : " + file.getPath());
            }
        }
    }
}
