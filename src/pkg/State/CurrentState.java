package pkg.hzc.State;

public class CurrentState {
    //private float temp;
    //private float humi;
    private String Stemp;
    private String Shumi;

    public CurrentState() {
        Stemp = "适宜";        //摄氏度
        Shumi = "适宜";        //相对湿度
    }

    public void setStemp(String Stemp) {
        this.Stemp = Stemp;
    }
    public String getStemp() {
        return this.Stemp;
    }

    public void setShumi(String Shumi) {
        this.Shumi = Shumi;
    }
    public String getShumi() {
        return this.Shumi;
    }
}
