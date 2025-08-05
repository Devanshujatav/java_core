package in.devanshu.code.program_four;

public class TrafficLightThread extends Thread{
    private final TrafficColor color;

    public TrafficLightThread(TrafficColor color){
        this.color = color;
    }

    @Override
    public void run(){
        System.out.printf("%s Active\n" , this.color);
        try{
            Thread.sleep(color.getOnTimeInMillis());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Inactive \n",this.color);
    }
}
