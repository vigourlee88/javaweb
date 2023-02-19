public class Homework05 {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println("面积=" + circle.area());
        System.out.println("周长=" + circle.len());
    }
}
class Circle{
    double radius;
    //写构造器
    public Circle(double radius){
        this.radius = radius;
    }

    public double area(){//面积
        return Math.PI * radius * radius;
    }
    public double len(){//周长
        return Math.PI * radius * 2;
    }
}