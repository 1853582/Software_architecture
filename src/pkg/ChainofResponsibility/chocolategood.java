package pkg.zyl.ChainofResponsibility;

// 巧克力物件类
public class chocolategood {
    float width; // 巧克力块宽/cm
    float length; // 巧克力块长度/cm
    float thickness; // 巧克力厚度/mm
    float weight; // 巧克力质量/g
    Color color; // 巧克力颜色
    int type; //巧克力类型 0表示白巧克力，1表示黑巧克力
    int number; // 巧克力编号
    public chocolategood(float width, float length,float thickness ,float weight, Color color, int type,int number) {

        this.width = width;
        this.length = length;
        this.thickness= thickness;
        this.weight = weight;
        this.color = color;
        this.type = type;
        this.number=number;
    }
}
