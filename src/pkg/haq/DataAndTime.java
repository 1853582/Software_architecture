package pkg.haq;

public class DataAndTime {
    public int PublishYear;
    public String ChocolateName;

    public DataAndTime() {
    }

    public void init(int a, String b) {
        this.PublishYear = a;
        this.ChocolateName = b;
        System.out.println(this.PublishYear + " " + this.ChocolateName);
    }
}
