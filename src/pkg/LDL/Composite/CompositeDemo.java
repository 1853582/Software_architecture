package pkg.LDL.Composite;

public class CompositeDemo {
    private static CompositeDemo Instance = new CompositeDemo();

    public Employee theBoss;
    private Employee Squirrel1;
    private Employee Squirrel2;
    private Employee Squirrel3;
    private Employee Squirrel4;
    private Employee Squirrel5;
    private Employee Squirrel6;

    private CompositeDemo(){
        System.out.println("工厂员工列表生成中.......");
        Employee theBoss = new Employee("Willy Wonka","Factory boss","数不尽的巧克力");
        Employee Squirrel1 = new Employee("小松鼠杰米","坚果质检与剥壳部门","200颗榛果");
        Employee Squirrel2 = new Employee("小松鼠凯恩","坚果质检与剥壳部门","200颗榛果");
        Employee Squirrel3 = new Employee("小松鼠梅西","坚果质检与剥壳部门","200颗榛果");
        Employee Squirrel4 = new Employee("小松鼠萨内","坚果质检与剥壳部门","200颗榛果");
        Employee Squirrel5 = new Employee("小松鼠伊布","坚果质检与剥壳部门","200颗榛果");
        Employee Squirrel6 = new Employee("小松鼠布冯","坚果质检与剥壳部门","200颗榛果");
        theBoss.add(Squirrel1);
        theBoss.add(Squirrel2);
        theBoss.add(Squirrel3);
        theBoss.add(Squirrel4);
        theBoss.add(Squirrel5);
        theBoss.add(Squirrel6);
    }

    public static CompositeDemo getInstance(){
        return Instance;
    }
    //public static void compositeEven(){
//        System.out.println("工厂员工列表生成中.......");
    //theBoss是老板，Squirrel1是一名员工，将其add进老板的下属中去，也就是雇佣Squirrel1
    //Employee theBoss = new Employee("Willy Wonka","Factory boss","数不尽的巧克力");
    //Employee Squirrel1 = new Employee("小松鼠杰米","坚果质检与剥壳部门","200颗榛果");
//        theBoss.add(Squirrel1);
//        theBoss.add(Squirrel2);
//        theBoss.add(Squirrel3);
//        theBoss.add(Squirrel4);
//        theBoss.add(Squirrel5);
//        theBoss.add(Squirrel6);
    //}
//    public static void main(String[] args){
//        //theBoss是老板，Squirrel1是一名员工，将其add进老板的下属中去，也就是雇佣Squirrel1
//        Employee theBoss = new Employee("Willy Wonka","Factory boss","数不尽的巧克力");
//        Employee Squirrel1 = new Employee("小松鼠杰米","坚果质检与剥壳部门","200颗榛果");
//        theBoss.add(Squirrel1);
//    }
}
