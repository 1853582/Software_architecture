package pkg.LDL.Composite;

public class CompositeDemo {
    public static void main(String[] args){
        //theBoss是老板，Squirrel1是一名员工，将其add进老板的下属中去，也就是雇佣Squirrel1
        Employee theBoss = new Employee("Willy Wonka","Factory boss","数不尽的巧克力");
        Employee Squirrel1 = new Employee("小松鼠杰米","坚果质检与剥壳部门","200颗榛果");
        theBoss.add(Squirrel1);
    }
}
