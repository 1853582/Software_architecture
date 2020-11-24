package pkg.Iterator;

import pkg.ChainofResponsibility.chocolategood;

public interface MyIterator {
    //迭代器接口
    //正向检测
    public boolean hasNext();
    public chocolategood next();
    //反向检测
    public boolean hasLast();
    public chocolategood last();
}
