package in.devanshu.programs;

public class TestArray {
    public static void main(String[] args){
        ArrayOperations arrOps = new ArrayOperations(new int[]{1,3,5,9});
        ArrayOperations.Statistics  statistics = arrOps.new Statistics();
        System.out.println("Mean : "+statistics.mean());

        System.out.println("Median : " + statistics.median());
    }

}
