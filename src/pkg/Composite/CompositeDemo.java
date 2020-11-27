package pkg.Composite;

import java.util.Scanner;

public class CompositeDemo {
    private static CompositeDemo Instance = new CompositeDemo();

    public Employee theBoss;
    private Employee Squirrel1;
    private Employee Squirrel2;
    private Employee Squirrel3;
    private Employee Squirrel4;
    private Employee Squirrel5;
    private Employee Dwarf1;
    private Employee Dwarf2;
    private Employee Dwarf3;
    private Employee Dwarf4;
    private Employee Dwarf5;

    private CompositeDemo(){
        System.out.println("---------------");
        System.out.println("工厂员工列表生成中.......");
        this.theBoss = new Employee("Willy Wonka","Factory boss","数不尽的巧克力");
        this.Squirrel1 = new Employee("小松鼠吉米","坚果质检与剥壳部门","400颗榛果");
        this.Squirrel2 = new Employee("小松鼠凯恩","坚果质检与剥壳部门","200颗榛果");
        this.Squirrel3 = new Employee("小松鼠梅西","坚果质检与剥壳部门","200颗榛果");
        this.Squirrel4 = new Employee("小松鼠萨内","坚果质检与剥壳部门","200颗榛果");
        this.Squirrel5 = new Employee("小松鼠伊布","坚果质检与剥壳部门","200颗榛果");
        this.Dwarf1 = new Employee("小矮人大卫","原料搅拌部门","400个苹果");
        this.Dwarf2 = new Employee("小矮人杰西","原料搅拌部门","400个苹果");
        this.Dwarf3 = new Employee("小矮人卡西","原料搅拌部门","400个苹果");
        this.Dwarf4 = new Employee("小矮人托蒂","原料搅拌部门","400个苹果");
        this.Dwarf5 = new Employee("小矮人孔蒂","原料搅拌部门","400个苹果");
        theBoss.add(Squirrel1);
        Squirrel1.add(Squirrel2);
        Squirrel1.add(Squirrel3);
        Squirrel1.add(Squirrel4);
        Squirrel1.add(Squirrel5);
        theBoss.add(Dwarf1);
        Dwarf1.add(Dwarf2);
        Dwarf1.add(Dwarf3);
        Dwarf1.add(Dwarf4);
        Dwarf1.add(Dwarf5);
        System.out.println("工厂员工列表生完毕！.......");
        System.out.println("---------------");
        System.out.println("*****员工列表生成利用了组合模式*****");
        new Scanner(System.in).nextLine();
    }

    public static CompositeDemo getInstance(){
        return Instance;
    }

}
