package pkg.LDL.Composite;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;     //如小松鼠杰米
    private String dept;
    private String salary;   //薪水声明成String，为了给小松鼠月薪为，松果100颗
    private List<Employee> staffs;

    //构造函数
    public Employee(String name,String dept, String sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        staffs = new ArrayList<>();
    }
    //给该名员工添加一名他的直属下属staff
    public void add(Employee staff) {
        System.out.println(this.name+"新雇佣了一个员工"+staff.name);
        staffs.add(staff);
    }
    //从该名员工的下属当中辞退员工staff
    public void remove(Employee staff) {
        System.out.println(this.name+"辞退了一个员工"+staff.name);
        staffs.remove(staff);
    }
    //获得该名员工的下属列表
    public List<Employee> getstaffs(){
        System.out.println("当前的下属一共有这么多");
        return staffs;
    }
    //得到该名员工的姓名
    public  String getName(){
        //System.out.println("你要查看的员工的名字为："+this.name);
        return name;
    }
    //得到该名员工隶属的部门
    public  String getDept(){
        System.out.println("该名员工属于："+this.dept);
        return dept;
    }
    //得到该名员工的姓名
    public  String getSalary(){
        return salary;
    }
    //展示该名下属的一些基本信息
    public boolean showMsg(){
        System.out.println("员工："+name+"；隶属于："+dept+"部门；每个月的薪水为："+salary);
        return true;
    }
}
