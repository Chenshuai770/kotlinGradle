package efffective.chapter1.builder;

/**
 * 第2条：遇到多个构造器参数时，考虑用构建者
 */
public class NutritionFacts {
    ///静态工厂和构造器都有个共同的不足的地方：
    // 它们都不能很好地扩展到大量的可选参数。
    // 考虑这么一种情况，用一个类来表示包装食品外面的营养成分标签。
    // 这些标签里有几个属性是必须有的：每份的含量，每罐的含量以及每份的卡路里，同时还有20个可选的属性：
    // 总脂肪含量、饱和脂肪含量、胆固醇含量、钠含量等等。大多数只在某几个可选属性里会有非零值。
    //这个构造器的调用通常需要很多你原本不想设置的参数，但你还是不得不给这些参数传一个值进去。
    // 在上述的例子中，我们为参数fat传了0值进去。若仅仅是这6个参数，情况还好点，但随着参数的增多，很快就开始失控。
    private final int servingSize; // (mL) required
    private final int servings;    // (per container) required
    private final int calories;    // (per serving) optional
    private final int fat;         // (g/serving) optional
    private final int sodium;      // (mg/serving) optional
    private final int carbohydrate; // (g/serving) optional

    public NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }


}
