package efffective.chapter1.singleton;

/**
 * 这种 方式类似于公有属性方式，但它更简洁，而且不仅免费提供了序列化机制，
 * 而且对多次初始化的行为提供了强有效的保证，即使是面对复杂的序列化或者反射攻击。
 * 这种方式可能会让人觉得有点不自然，但单元素枚举通常是实现Singleton的最佳方式。
 * 要注意的是，
 * 如果我们的Singleton必须扩展自一个超类而不是枚举时，
 * 这种方式就不能使用了（虽然你也可以申请一个枚举，这个枚举实现自一个或多个接口）。
 */
public enum Singleton3 {
    INSTANCE;

    public void leaveTheBuilding() {
    }


}
