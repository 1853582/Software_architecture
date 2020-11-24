package pkg.AppearanceControllerRoom;

public interface RoomController {
    //查看温度
    public int checkTemp(Object room);
    //调整温度
    public void setTemp(Object room,int x);
    //查看湿度
    public float checkHumidity(Object room);
    //调整湿度
    public void setHumidity(Object room,float x);
    //调整灯光亮度
    public void setBrightness(Object room,int x);
}
