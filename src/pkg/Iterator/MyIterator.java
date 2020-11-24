package pkg.wck.Iterator;

import pkg.zyl.ChainofResponsibility.chocolategood;

public interface Iterator {
    //迭代器接口
    //正向检测
    public boolean hasNext();
    public chocolategood next();
    //反向检测
    public boolean hasLast();
    public chocolategood last();
}
