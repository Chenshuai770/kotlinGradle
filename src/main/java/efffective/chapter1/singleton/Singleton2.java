package efffective.chapter1.singleton;

/**
 * 在第二种实现Singleton的方式中，公有成员是一个静态工厂方法：
 */
public class Singleton2 {
    private static final Singleton2 INSTANCE = new Singleton2();

    public static Singleton2 getInstance() {
        return INSTANCE;
    }

    private Singleton2() {
    }

    public void leaveTheBuilding() {


    }

}
