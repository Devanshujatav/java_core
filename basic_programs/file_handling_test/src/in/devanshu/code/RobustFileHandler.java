package in.devanshu.code;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class RobustFileHandler {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name you want to read : ");
        String fileName = sc.next();

        try(FileReader reader = new FileReader(fileName)){
            int read;
            while((read = reader.read()) != -1){
                System.out.print((char) read);
            }
        }catch(FileNotFoundException e){
            System.out.println("Error Occurred : " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error Occurred : " + e.getMessage());
        }
    }
}
