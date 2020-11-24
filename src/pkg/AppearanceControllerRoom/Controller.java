package pkg.AppearanceControllerRoom;
import pkg.*;

public class Controller implements RoomController{

    @Override
    public int checkTemp(Object room) {
        if(room==ColdStorage.getInstance()) {
            System.out.println("旺卡选择了冷库温度查看功能");
            System.out.println("屏幕上显示出当前冷库温度为"+ColdStorage.getInstance().temp+"度");
            return ColdStorage.getInstance().temp;
        }
        else if(room==MaterialHandlingWorkshop.EnterMaterialProductionWorkshop()) {
            System.out.println("旺卡选择了原料生产车间温度查看功能");
            System.out.println("屏幕上显示出当前原料生产车间温度为"+MaterialHandlingWorkshop.EnterMaterialProductionWorkshop().temp+"度");
            return MaterialHandlingWorkshop.EnterMaterialProductionWorkshop().temp;
        }
        return -1;
    }

    @Override
    public void setTemp(Object room, int x) {
        if(room==ColdStorage.getInstance()) {
            System.out.println("旺卡选择了冷库温度调节功能，并输入了温度");
            System.out.println("冷库中的机器臂迅速调整了冰霜宝石的数量，冷库中的温度有所变化");
            ColdStorage.getInstance().temp = x;
        }
        else if(room==MaterialHandlingWorkshop.EnterMaterialProductionWorkshop())
            System.out.println("旺卡选择了原料生产车间温度调节功能，并输入了温度");
        System.out.println("原料生产车间中的机器臂迅速调整了燃烧宝石的数量，原料生产车间中的温度有所变化");
            MaterialHandlingWorkshop.EnterMaterialProductionWorkshop().temp=x;

    }

    @Override
    public float checkHumidity(Object room) {
        if(room==ColdStorage.getInstance()) {
            System.out.println("旺卡选择了冷库湿度查看功能");
            System.out.println("屏幕上显示出当前冷库湿度为"+ColdStorage.getInstance().Humidity+"度\n");
            return ColdStorage.getInstance().Humidity;
        }
        else if(room==MaterialHandlingWorkshop.EnterMaterialProductionWorkshop()) {
            System.out.println("旺卡选择了原料生产车间湿度查看功能");
            System.out.println("屏幕上显示出当前原料生产车间湿度为"+ColdStorage.getInstance().Humidity+"度\n");
            return MaterialHandlingWorkshop.EnterMaterialProductionWorkshop().Humidity;
        }
        return -1;
    }

    @Override
    public void setHumidity(Object room, float x) {
        if(room==ColdStorage.getInstance()) {
            System.out.println("旺卡选择了冷库湿度调节功能，并输入了湿度");
            System.out.println("冷库中的鲤鱼王使用了水溅跃，冷库中的湿度有所变化");
            ColdStorage.getInstance().Humidity = x;
        }
        else if(room==MaterialHandlingWorkshop.EnterMaterialProductionWorkshop()) {
            System.out.println("旺卡选择了原料生产车间湿度调节功能，并输入了湿度");
            System.out.println("原料生产车间中的鲤鱼王使用了水溅跃，车间中的湿度有所变化");
            MaterialHandlingWorkshop.EnterMaterialProductionWorkshop().Humidity = x;
        }
    }

    @Override
    public void setBrightness(Object room, int x) {
        if(room==ColdStorage.getInstance()) {
            System.out.println("旺卡选择了冷库亮度调节功能，并输入了亮度");
            System.out.println("冷库中的巫师掏出了魔杖 ”荧光闪烁(Lumos)！“，冷库中的亮度有所变化");
            ColdStorage.getInstance().Brightness = x;
        }
        else if(room==MaterialHandlingWorkshop.EnterMaterialProductionWorkshop()) {
            System.out.println("旺卡选择了原料生产车间亮度调节功能，并输入了亮度");
            System.out.println("原料生产车间中的巫师掏出了魔杖 ”荧光闪烁(Lumos)！“，车间中的亮度有所变化");
            MaterialHandlingWorkshop.EnterMaterialProductionWorkshop().Brightness = x;
        }
    }
}
