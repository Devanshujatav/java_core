package in.devanshu.programs;

import java.util.Collections;



public class ArrayOperations {
    private int[] numbers;

    public ArrayOperations(int[] numbers){
        this.numbers = numbers;
    }

    public class Sort{
       void sort() {
            int n = numbers.length;

            // for loop start from 1 index
            for (int i = 1; i < n; i++) {

                // Take a varible j to check the previous element whether greater or smaller.
                int j = i;

                while (j > 0 && numbers[j] < numbers[j - 1]) {

                    // Swaping the Elements
                    int temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;

                    // decrement j by 1
                    j--;
                }
            }
        }
    }

    public class Statistics{
        double mean(){
            double sum = 0;
            for (int val : numbers){
                sum+=val;
            }
            return sum/ numbers.length;
        }

        double median(){

            int start = 0;
            int end = numbers.length-1;

            int mid = start + (end - start)/2;

            int count = 0;

            Sort sorted = new Sort();
            sorted.sort();

            for (int val : numbers){
                count++;
            }

            if (count % 2 == 0){
                return (numbers[mid] + numbers[mid+1]) / 2;
            }else{
                return numbers[mid];
            }
        }
    }
}
