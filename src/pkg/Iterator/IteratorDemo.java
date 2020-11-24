package pkg.Iterator;

import pkg.ChainofResponsibility.ColorCheck;
import pkg.ChainofResponsibility.SizeCheck;
import pkg.ChainofResponsibility.WeightCheck;
import pkg.ChainofResponsibility.chocolategood;

public class IteratorDemo {
    public IteratorDemo (){
        ChocolateCase chocolateCase = new ChocolateCase();

        System.out.println("厂长：这是我们在检测制作出的巧克力，我们只会保留颜色、大小、重量全部合格的巧克力。");
        //正向检测
        for(MyIterator iter = chocolateCase.getIterator(); iter.hasNext();){
            chocolategood choco = iter.next();
            new ColorCheck(choco).Handler();
            new SizeCheck(choco).Handler();
            new WeightCheck(choco).Handler();
        }

        System.out.println("厂长：为了更好的保证巧克力的合格率，我们设置了两次检验程序，对已经检测过的产品进行一次反向检测。");

        //反向检测
        for(MyIterator iter1 = chocolateCase.getIterator(); iter1.hasLast();){
            chocolategood choco = iter1.last();
            new ColorCheck(choco).Handler();
            new SizeCheck(choco).Handler();
            new WeightCheck(choco).Handler();
        }

        System.out.println("小男孩：wow，这真是太棒了！");
    }
}
