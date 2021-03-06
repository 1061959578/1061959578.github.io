package cn.dsq.no10.test1;

/*
* 在任何版本的java中都可以定义抽象方法。
* 格式
* public abstract 返回值类型 方法名称(参数列表)；
*
* 注意事项：
* 1.接口当中的抽象方法，修饰词必须两个固定的关键字：public 、abstract
* 2.这两个关键字修饰符，可以选择性省略
* */
public interface CodeTest173MyInterface {
    //这是一个抽象方法
    public  abstract  void  methodAbs1();

    //这也是抽象方法
    abstract void methodAbs2();

    //这也是抽象方法
    public void methodAbs3();

    //这也是抽象方法
    void methodAbs4();
}
