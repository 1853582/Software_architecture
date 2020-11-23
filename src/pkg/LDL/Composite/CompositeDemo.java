package pkg.LDL.Composite;

public class CompositeDemo {
    public Employee theBoss = new Employee("Willy Wonka","Factory boss","数不尽的巧克力");
    public Employee Squirrel1 = new Employee("小松鼠杰米","坚果质检与剥壳部门","200颗榛果");
    Employee Squirrel2 = new Employee("小松鼠凯恩","坚果质检与剥壳部门","200颗榛果");
    Employee Squirrel3 = new Employee("小松鼠梅西","坚果质检与剥壳部门","200颗榛果");
    Employee Squirrel4 = new Employee("小松鼠萨内","坚果质检与剥壳部门","200颗榛果");
    Employee Squirrel5 = new Employee("小松鼠伊布","坚果质检与剥壳部门","200颗榛果");
    Employee Squirrel6 = new Employee("小松鼠布冯","坚果质检与剥壳部门","200颗榛果");
    public static void compositeEven(){
        //theBoss是老板，Squirrel1是一名员工，将其add进老板的下属中去，也就是雇佣Squirrel1
        Employee theBoss = new Employee("Willy Wonka","Factory boss","数不尽的巧克力");
        Employee Squirrel1 = new Employee("小松鼠杰米","坚果质检与剥壳部门","200颗榛果");
        theBoss.add(Squirrel1);
    }
//    public static void main(String[] args){
//        //theBoss是老板，Squirrel1是一名员工，将其add进老板的下属中去，也就是雇佣Squirrel1
//        Employee theBoss = new Employee("Willy Wonka","Factory boss","数不尽的巧克力");
//        Employee Squirrel1 = new Employee("小松鼠杰米","坚果质检与剥壳部门","200颗榛果");
//        theBoss.add(Squirrel1);
//    }
}
