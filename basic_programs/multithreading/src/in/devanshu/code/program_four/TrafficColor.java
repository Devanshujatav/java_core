package in.devanshu.code.program_four;

public enum TrafficColor {
    RED(8000),
    YELLOW(1000),
    GREEN(3000);

    private final int onTimeInMillis;

    TrafficColor(int onTimeInMillis){
        this.onTimeInMillis = onTimeInMillis;
    }

    public int getOnTimeInMillis(){
        return this.onTimeInMillis;
    }
}
