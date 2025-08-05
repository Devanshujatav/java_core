package in.devanshu.code.unique_character;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacter {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string : ");
        String userStr = sc.next();
        for (char ch : userStr.toCharArray()){
            unique.add(ch);
        }

        System.out.println("Number of Unique Elements : " + unique.size());
    }
}
