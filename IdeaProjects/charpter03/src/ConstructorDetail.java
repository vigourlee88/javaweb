public class ConstructorDetail {
    public static void main(String[] args) {
        //在调用构造器时，对象空间已经有了
        Person04 p1 = new Person04("king", 40);//第一个构造器
        Person04 p2 = new Person04("tom");//第二个构造器

    }
}
class Dog04{
    //如果没有定义构造器，系统会自动给类生成一个默认无参构造器
    /*
    默认构造器
    Dog04(){
    }
    一旦定义了自己的构造器，默认的构造器就覆盖了，就不能再使用磨人的无参构造器
    除非显式的定义一下，即Dog(){}
     */
    public Dog04(String dName){

    }
    Dog04(){//显式的定义一下 无参构造器

    }

}
class Person04{
    String name;
    int age;
    //第一个构造器
    public Person04(String pName,int pAge){
        name = pName;
        age = pAge;
    }
    //第二个构造器， 只指定人名，不指定年龄
    public Person04(String pName){
        name = pName;

    }
}