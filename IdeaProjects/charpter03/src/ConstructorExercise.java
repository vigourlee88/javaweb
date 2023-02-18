public class ConstructorExercise {
    public static void main(String[] args) {
        Person05 p1 = new Person05();
        Person05 p2 = new Person05("tom",40);
        System.out.println("p1的信息 name=" + p1.name + " age=" + p1.age);//null 18
        System.out.println("p2的信息 name=" + p2.name + " age=" + p2.age);//tom 40


    }
}
class Person05{
    String name;//默认值为null;
    int age;
    //第一个构造器
    public Person05( ){
        age = 18;
    }
    //第二个构造器
    public Person05(String pName,int pAge){
        name = pName;
        age = pAge;

    }
}