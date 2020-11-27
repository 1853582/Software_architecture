package pkg.NullObject;

import pkg.Composite.CompositeDemo;

public class NulDemo {
    public void demoMain(){
        //该处使用了组合模式，得到员工列表
        CompositeDemo Boss = CompositeDemo.getInstance();
        //坚果样例以及相关景象
        AbstractNut nut1 = NutFactroy.getNut(1);
        AbstractNut nut2 = NutFactroy.getNut(2);
        AbstractNut nut3 = NutFactroy.getNut(3);
        AbstractNut nut4 = NutFactroy.getNut(4);
        AbstractNut nut5 = NutFactroy.getNut(5);
        AbstractNut nut6 = NutFactroy.getNut(6);
        AbstractNut nut7 = NutFactroy.getNut(7);
        AbstractNut nut8 = NutFactroy.getNut(8);
        AbstractNut nut9 = NutFactroy.getNut(9);
        AbstractNut nut10 = NutFactroy.getNut(10);
        AbstractNut nut11 = NutFactroy.getNut(11);
        AbstractNut nut12 = NutFactroy.getNut(12);
        AbstractNut nut13 = NutFactroy.getNut(13);
        AbstractNut nut14 = NutFactroy.getNut(14);
        AbstractNut nut15 = NutFactroy.getNut(15);

        //利用组合模式建造的员工列表，获取各个小松鼠的名字，利用组合模式
        System.out.println("厂长"+Boss.theBoss.getName()+"带小查理观看小松鼠啃坚果的场景：");
        System.out.println(Boss.theBoss.getStaffs().get(0).getName()+"："+nut1.getNum());
        System.out.println(Boss.theBoss.getStaffs().get(0).getStaffs().get(0).getName()+"："+nut2.getNum());
        System.out.println(Boss.theBoss.getStaffs().get(0).getStaffs().get(1).getName()+"："+nut3.getNum());
        System.out.println(Boss.theBoss.getStaffs().get(0).getStaffs().get(2).getName()+"："+nut4.getNum());
        System.out.println(Boss.theBoss.getStaffs().get(0).getStaffs().get(3).getName()+"："+nut5.getNum());
        System.out.println(Boss.theBoss.getStaffs().get(0).getStaffs().get(4).getName()+"："+nut6.getNum());
        System.out.println(Boss.theBoss.getStaffs().get(0).getStaffs().get(5).getName()+"："+nut7.getNum());
        System.out.println(Boss.theBoss.getStaffs().get(0).getStaffs().get(6).getName()+"："+nut8.getNum());
        System.out.println(Boss.theBoss.getStaffs().get(0).getStaffs().get(7).getName()+"："+nut9.getNum());
        System.out.println(Boss.theBoss.getStaffs().get(0).getStaffs().get(8).getName()+"："+nut10.getNum());
        System.out.println(Boss.theBoss.getStaffs().get(0).getStaffs().get(9).getName()+"："+nut11.getNum());
        System.out.println(Boss.theBoss.getStaffs().get(0).getStaffs().get(10).getName()+"："+nut12.getNum());

    };
}
