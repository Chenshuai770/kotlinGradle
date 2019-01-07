package efffective.chapter1.singleton;
/**
* 采用第一种方式的好处是，透过API，我们能清晰地意识到这个类是个Singleton：
* 公有静态属性是final不可变的，所以它将总是保持着相同的对象引用。
* 而第二种方式的好处是它更简单些。
 * 第三是枚举,但是枚举类的方法虽然简洁,
 * 但是仍然纯在限制性
 */
public class SingleTest {
    public static void main(String[] args) {

        Singleton1.INSTANCE.leaveTheBuilding();
        Singleton2.getInstance().leaveTheBuilding();
        Singleton3.INSTANCE.leaveTheBuilding();
    }
}
