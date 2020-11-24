package pkg.ChainofResponsibility;

//巧克力颜色类
public class Color {
    public float R;
    public float G;
    public float B;

    public Color(float r, float g, float b) {
        if ((r > 255.0f || r < 0.0f) || (g > 255.0f || g < 0.0f) || (b > 255.0f || b < 0.0f)) {
            System.out.println("输入检测到的颜色参数不在0-255范围内！");
            return;
        }
        R = r;
        G = g;
        B = b;
    }
}
