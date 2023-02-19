public class This02 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("大壮",3);
        System.out.println("dog1的hashcode="+dog1.hashCode());
        dog1.info();
        Dog dog2 = new Dog("大黄",2);
        System.out.println("dog2的hashcode="+dog2.hashCode());
        dog2.info();
    }
}
class Dog{//类
    public String name;
    public int age;
    //    public Dog05(String dName,int dAge){//构造器
//        name = dName;
//        age =dAge;
//    }
    //如果我们的构造器形参 能够直接写成属性名 就更好
    //但是出现了一个问题，根据变量的作用域原则
    //构造器的name 就是局部变量，而不是属性
    //构造器的age 就是局部变量，而不是属性
    //==>
    public Dog(String name,int age){//构造器
//            name = name;//name就是局部变量,自己给自己赋值了一下，和属性没有影响
//            age =age;   //age 就是局部变量,自己给自己赋值了一下，和属性没有影响
        //this.name 就是当前的属性name
        //对象是 创建好对象后，谁在调用构造器
        this.name = name;
        //this.age 就是当前对象的属性age
        this.age = age;
        System.out.println("this.hashCode=" + this.hashCode());
    }
    public void info(){//成员方法 输出对象属性

        System.out.println(name+"\t"+age+"\t");
    }
}

