package pkg.Iterator;


import pkg.ChainofResponsibility.chocolategood;
import pkg.ChainofResponsibility.Color;

public class ChocolateCase implements Container {
    //创建实现Container接口的实体类

    //巧克力示例
    private static int Choco = 5;
    Color color1 = new Color(210,105,30);//合格的黑
    Color color2 = new Color(253,250,240);//合格的白
    Color color3 = new Color(240,251,240);//不合格的白
    Color color4 = new Color(210,99,30);//不合格的黑
    Color color5 = new Color(255,251,240);//合格的白
    chocolategood choco1 = new chocolategood((float)26.16,(float)26.16,(float)7.21,(float)100.01,color1 ,1 ,1 );
    chocolategood choco2 = new chocolategood((float)26.06,(float)26.16,(float)7.19,(float)99.99,color2 ,2 ,2 );
    chocolategood choco3 = new chocolategood((float)26.14,(float)26.16,(float)7.20,(float)100.00,color3 ,2 ,3 );
    chocolategood choco4 = new chocolategood((float)26.36,(float)26.28,(float)7.21,(float)99.05,color4 ,1 ,4 );
    chocolategood choco5 = new chocolategood((float)25.85,(float)26.13,(float)7.11,(float)100.2,color5 ,2 ,5 );

    //获得迭代器
    @Override
    public MyIterator getIterator(){
        return new ChocolateMyIterator();
    };


    //实现 Iterator 接口的内部类 NameIterator。
    public class ChocolateMyIterator implements MyIterator {
        int num = 1;

        //检测是否有下一个
        @Override
        public boolean hasNext() {
            if (num <= Choco) {
                return true;
            }
            return false;
        }

        //返回下一个巧克力
        @Override
        public chocolategood next() {
            if (this.hasNext()) {
                switch (num) {
                    case 1: {
                        num++;
                        return choco1;
                    }
                    case 2: {
                        num++;
                        return choco2;
                    }
                    case 3: {
                        num++;
                        return choco3;
                    }
                    case 4: {
                        num++;
                        return choco4;
                    }
                    case 5: {
                        num++;
                        return choco5;
                    }
                }
            }
            return null;
        }

        int num2 = 5;

        //检测是否有上一个
        @Override
        public boolean hasLast() {
            if (num2 > 0) {
                return true;
            }
            return false;
        }

        //返回上一个巧克力
        @Override
        public chocolategood last() {
            if (this.hasLast()) {
                switch (num2) {
                    case 1: {
                        num2--;
                        return choco1;
                    }
                    case 2: {
                        num2--;
                        return choco2;
                    }
                    case 3: {
                        num2--;
                        return choco3;
                    }
                    case 4: {
                        num2--;
                        return choco4;
                    }
                    case 5: {
                        num2--;
                        return choco5;
                    }
                }
            }
            return null;
        }
    }
}
