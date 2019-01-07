package efffective.chapter1.singleton;

/**
 * 但这两种方式都是将构造器私有化，然后提供一个公有的静态成员，
 * 并通过这个静态成员来访问这个唯一的实例。在第一种方式中，
 * 采用第一种方式的好处是，透过API，我们能清晰地意识到这个类是个Singleton：
 * 公有静态属性是final不可变的，所以它将总是保持着相同的对象引用
 * 这个静态成员是final属性：
 */
public class Singleton1 {
    public static final Singleton1 INSTANCE=new Singleton1();
    private Singleton1() {
    }
    public void leaveTheBuilding() {

    }


}
