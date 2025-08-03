public class GuessTheNumber {

    int number;

    int randomNumber = (int)(Math.random()*100)+1;

    GuessTheNumber(int n){
        this.number = n;
    }

    void guess(){
        if (this.number == randomNumber){
            System.out.println("Congrats!!!!.....You Won the Game, You made the right guess.");
        }else{
            System.out.println("Sorry Buddy.....You made the wrong guess...Please try again.");
        }
    }


    public static void main(String[] args){
//        System.out.println(GuessTheNumber.randomNumber);

        int n = (int)(Math.random()*100)+1;

        GuessTheNumber play = new GuessTheNumber(n);
        play.guess();
    }
}
