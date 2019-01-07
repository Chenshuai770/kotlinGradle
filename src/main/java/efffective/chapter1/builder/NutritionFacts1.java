package efffective.chapter1.builder;

/**
 *  第2条：遇到多个构造器参数时，考虑用构建者
 * JavaBeans模式(无参构造方法) Java Beans创建实例简单，而且代码易于阅读
 * 简而言之，**可伸缩构造器是可行，只是当有很多参数时，会让客户端代码很难编写，而且代码也很难阅读。
 * **读者若想知道传入的那些值代表什么，就必须得仔细地数着这些参数来一探究竟。
 * 一长串相同类型的参数还会导致一些难以察觉的错误。
 * 假如客户端不小心将两个相同类型的参数调换来位置，编译器不会报错，但程序在运行时就不会按照我们所想的去做了（条目51）。
 */
public class NutritionFacts1 {
    // Parameters initialized to default values (if any)
    private int servingSize = -1; // Required; no default value
    private int servings = -1; // Required; no default value
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public NutritionFacts1() {
    }

    // Setters
    public void setServingSize(int val) {
        servingSize = val;
    }

    public void setServings(int val) {
        servings = val;
    }

    public void setCalories(int val) {
        calories = val;
    }

    public void setFat(int val) {
        fat = val;
    }

    public void setSodium(int val) {
        sodium = val;
    }

    public void setCarbohydrate(int val) {
        carbohydrate = val;
    }
}

