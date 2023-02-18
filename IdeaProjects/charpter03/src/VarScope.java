public class VarScope {
    public static void main(String[] args) {

    }
}
class Cat01{
    //全局变量 也就是属性，作用域为整个类体Cat类:cry eat等方法使用属性
    //属性在定义时，可以直接赋值
    int age = 10;

    //全局变量(属性)可以不赋值，直接使用，因为有默认值
    double weight;//默认值是0.0

    public void hi(){
        int num;
        //局部变量必须赋值后，才能使用，因为没有默认值
        // System.out.println("num=" + num);
    }

    public void cry(){
        //1.局部变量一般是指在成员方法中定义的变量
        //2.n和name就是局部变量
        //3.n和name的作用域在cry方法中
        int n = 10;
        String name = "jack";
        System.out.println("在cry中使用属性 age=" + age);
    }
    public void eat(){
        System.out.println("在eat中使用属性 age=" + age);
    }
}
