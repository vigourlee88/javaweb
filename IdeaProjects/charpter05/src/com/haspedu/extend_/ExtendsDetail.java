package com.haspedu.extend_;

public class ExtendsDetail {
    //1.子类继承了所有的属性和方法，
    // 要通过公共的方法去访问私有属性
    //2.子类必须调用弗雷德构造器，完成父类的初始化
    //3.当创建子类对象时，不管使用子类的哪个构造器，
    // 默认情况下总会先去调用父类的无参构造器，
    // 如果父类没有提供无参构造器，则必须在子类的 每一个 构造器中
    // 使用super去指定使用父类的哪个构造器完成对父类的初始化工作
    public static void main(String[] args) {
        System.out.println("===第1个对象===");
        Sub sub = new Sub();//创建了子类对象sub
        System.out.println("===第2个对象===");
        Sub sub2 = new Sub("jack");//创建了子类对象sub2
       // sub.sayOk();
        System.out.println("===第3个对象===");
        Sub sub3 = new Sub("king",10);//创建了子类对象sub3
    }
}
