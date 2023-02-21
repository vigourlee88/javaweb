package com.haspedu.extend_;

public class Sub extends Base {

    public Sub(String name,int age){
        //1.想调用父类的无参构造器或者 什么都不写，默认super()
        //super();//父类无参构造器
        //2.要调用父类的Base(String name)构造器
        //super("hsp");
        //3.要调用父类的Base(String name,int age)构造器
        super("king",20);

        //4.super在使用时，必须放在构造器第一行
        //5.super()和this()都只能放在构造器第一行，因此这两个方法不能共存
        //this();//不能再使用了

        System.out.println("子类sub(String name,int age)构造器被调用....");
    }

    public Sub() {//构造器
        super("jack",10);//隐藏 默认调用父类的无参构造器
        System.out.println("子类的sub()构造器被调用....");
    }
    //当创建子类对象时，不管使用子类的哪个构造器，
    //默认情况下总会去调用父类的无参构造器

    public Sub(String name ) {
        super("tom",30);
        System.out.println("子类的sub(String name)构造器被调用....");
    }

    public void sayOk(){
        //父类的非private属性和方法可以在子类直接访问
        System.out.println(n1+" "+n2+" "+n3+" ");
        test100();
        test200();
        test300();
        // test400();错误
        //要通过父类提供公共的方法去访问
        System.out.println("n4=" + getN4());
        callTest400();//中转调用私有的父类test400
    }
}
