package pkg.Composite;

import java.util.Scanner;

public class CompositeDemo {
    //创建 SingleObject 的一个对象，单例模式
    private static CompositeDemo Instance = new CompositeDemo();

    public Employee theBoss;
    private Employee Squirrel1;
    private Employee Squirrel2;
    private Employee Squirrel3;
    private Employee Squirrel4;
    private Employee Squirrel5;
    private Employee Squirrel6;
    private Employee Squirrel7;
    private Employee Squirrel8;
    private Employee Squirrel9;
    private Employee Squirrel10;
    private Employee Squirrel11;
    private Employee Squirrel12;

    private Employee Dwarf1;
    private Employee Dwarf2;
    private Employee Dwarf3;
    private Employee Dwarf4;
    private Employee Dwarf5;
    //让构造函数为 private，这样该类就不会被实例化，单例模式
    private CompositeDemo(){
        //员工列表构造
        System.out.println("---------------");
        System.out.println("工厂员工列表生成中.......");
        this.theBoss = new Employee("Willy Wonka","Factory boss","数不尽的巧克力");
        this.Squirrel1 = new Employee("小松鼠吉米","坚果质检与剥壳部门","400颗榛果");
        this.Squirrel2 = new Employee("小松鼠凯恩","坚果质检与剥壳部门","200颗榛果");
        this.Squirrel3 = new Employee("小松鼠梅西","坚果质检与剥壳部门","200颗榛果");
        this.Squirrel4 = new Employee("小松鼠萨内","坚果质检与剥壳部门","200颗榛果");
        this.Squirrel5 = new Employee("小松鼠伊布","坚果质检与剥壳部门","200颗榛果");
        this.Squirrel6 = new Employee("小松鼠盖仑","坚果质检与剥壳部门","200颗榛果");
        this.Squirrel7 = new Employee("小松鼠盖伊","坚果质检与剥壳部门","200颗榛果");
        this.Squirrel8 = new Employee("小松鼠萨内","坚果质检与剥壳部门","200颗榛果");
        this.Squirrel9 = new Employee("小松鼠C罗","坚果质检与剥壳部门","200颗榛果");
        this.Squirrel10 = new Employee("小松鼠托蒂","坚果质检与剥壳部门","200颗榛果");
        this.Squirrel11 = new Employee("小松鼠哲科","坚果质检与剥壳部门","200颗榛果");
        this.Squirrel12 = new Employee("小松鼠济科","坚果质检与剥壳部门","200颗榛果");

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
        Squirrel1.add(Squirrel6);
        Squirrel1.add(Squirrel7);
        Squirrel1.add(Squirrel8);
        Squirrel1.add(Squirrel9);
        Squirrel1.add(Squirrel10);
        Squirrel1.add(Squirrel11);
        Squirrel1.add(Squirrel12);
        theBoss.add(Dwarf1);
        Dwarf1.add(Dwarf2);
        Dwarf1.add(Dwarf3);
        Dwarf1.add(Dwarf4);
        Dwarf1.add(Dwarf5);
        System.out.println("工厂员工列表生完毕！.......");
        System.out.println("---------------");
        new Scanner(System.in).nextLine();
    }
    //获取唯一可用的对象，单例模式
    public static CompositeDemo getInstance(){
        return Instance;
    }

}
