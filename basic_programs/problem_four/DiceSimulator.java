public class DiceSimulator {

    int rollDice =(int) (Math.random()*6) + 1;

    public void rollDice(){
        System.out.println("Dice roll : " + rollDice);
    }

    public static void main(String[] args){
        DiceSimulator rolldice = new DiceSimulator(); 
        rolldice.rollDice();
    }
}
