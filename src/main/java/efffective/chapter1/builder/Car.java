package efffective.chapter1.builder;

/**
 * builder设计模式,多参数
 * 总的说来，在设计一个类时，
 * 而这个类的构造器或者静态工厂将会有很多参数时，Builder模式是个不错的选择，尤其是当很多参数都是可选或者是相同的类型时。
 * 比起用可伸缩构造器，通过采用builders而产生的客户端代码也更容易阅读和编写，而且，builder也比JavaBeans安全多了。
 */
public class Car {

    @Override
    public String toString() {
        return "Car{" +
                "wheel='" + wheel + '\'' +
                ", steeringWheel='" + steeringWheel + '\'' +
                ", tank='" + tank + '\'' +
                ", money='" + money + '\'' +
                ", book='" + book + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    private String wheel;//轮子
    private String steeringWheel;//方向盘
    private String tank;//油箱
    private String money;//钱
    private String book;//书
    private String phone;//手机

    private  Car(Builder builder) {
        wheel=builder.wheel;
        steeringWheel=builder.steeringWheel;
        tank=builder.tank;
        money=builder.money;
        book=builder.book;
        phone=builder.phone;

    }

    private static class Builder {
        private String wheel;//轮子
        private String steeringWheel;//方向盘
        private String tank;//油箱
        private String money;//钱
        private String book;//书
        private String phone;//手机

        public Builder(String wheel, String steeringWheel, String tank) {
            this.wheel = wheel;
            this.steeringWheel = steeringWheel;
            this.tank = tank;
        }

        public Builder money(String val) {
            this.money = val;
            return this;
        }

        public Builder book(String val) {
            this.book = val;
            return this;
        }

        public Builder phone(String val) {
            this.phone = val;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    public static void main(String[] args) {
        Car car = new Builder("轮子", "方向盘", "油箱")
                .book("编程思想")
                .money("23")
                .phone("苹果手机")
                .build();
        System.out.println(car);
    }




}

