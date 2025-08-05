package in.devanshu.code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        Map<String , String> countryMap = new HashMap<>();
        countryMap.put("Bharat" , "New Delhi");
        countryMap.put("China" , "Beijing");
        countryMap.put("Pakistan" , "Islamabad");
        countryMap.put("SriLanka" , "Columbo");
        countryMap.put("Bangladesh" , "Dhaka");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the country name : ");
        String country = sc.next();

        if (countryMap.containsKey(country)){
            System.out.println("Capital of " + country + " : " + countryMap.get(country));
        }else{
            System.out.println("There is no country like this.");
        }
    }
}
