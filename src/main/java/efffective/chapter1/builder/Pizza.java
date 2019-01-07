package efffective.chapter1.builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
    //配料
    public enum Topping{
        //火腿,蘑菇,洋葱,胡椒,香肠
        HAM,MUSHROOM,ONION,PEPPER,SAUSAGE
    }
    Set<Topping> toppings;
    abstract static class Builder<T extends Builder<T>>{
        EnumSet<Topping> toppings=EnumSet.noneOf(Topping.class);//建立一个新的枚举
        public T addTopping(Topping topping){
            toppings.add(Objects.requireNonNull(topping));//判空
            return self();
        }
        abstract Pizza build();
        protected abstract T self();
    }
    Pizza(Builder<?> builder){
        toppings=builder.toppings.clone();
    }
}
