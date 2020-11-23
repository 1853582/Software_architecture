package pkg.haq;

public class RankAndName {
    public int Rank;
    public String ChocolateName;

    public RankAndName() {
    }

    public void init(int a, String b) {
        this.Rank = a;
        this.ChocolateName = b;
        System.out.println(this.Rank + " " + this.ChocolateName);
    }
}
