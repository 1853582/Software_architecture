package pkg.Iterator;


import pkg.ChainofResponsibility.chocolategood;
import pkg.ChainofResponsibility.Color;

public class ChocolateCase implements Container {
    //创建实现Container接口的实体类

    //巧克力示例
    private static int Choco = 5;
    Color color1 = new Color(40,50,60);
    Color color2 = new Color(80,50,60);
    Color color3 = new Color(40,90,60);
    Color color4 = new Color(40,50,120);
    Color color5 = new Color(120,150,160);
    chocolategood choco1 = new chocolategood(3,4,8,40,color1 ,1 ,1 );
    chocolategood choco2 = new chocolategood(3,40,8,40,color2 ,2 ,2 );
    chocolategood choco3 = new chocolategood(3,4,80,40,color3 ,1 ,3 );
    chocolategood choco4 = new chocolategood(30,4,8,40,color4 ,2 ,4 );
    chocolategood choco5 = new chocolategood(30,40,80,40,color5 ,1 ,5 );

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
