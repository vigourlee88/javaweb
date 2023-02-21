package com.hspedu.super_;

public class B extends A{

    public int n1 = 888;

    //编写测试方法
    public void test(){
        //super的访问不限于直接父类，如果爷爷类和本类中有同名的成员，也可以使用super去访问爷爷类的成员
        //如果多个基类(上级类)中都有同名的成员，使用super访问遵循就近原则，A=>B=>C
        System.out.println("super.n1=" + super.n1);

    }


    //访问父类的属性，但不能访问父类的private属性
    public void hi(){
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
    }
    public void cal(){
        System.out.println("B类的cal() 方法...");
    }
    public void sum(){
        System.out.println("B类的sum()");
        //演示访问方法的规则
        //希望调用父类-A的cal方法
        //这时 因为子类B没有cal方法，因此我可以使用下面三种方式
        //cal();
        //找cal方法时，顺序是，先找本类，
        // 如果有，并且可以调用，则调用，如果没有，则找父类...
        //提示 如果查找方法的过程中，找到了，但是不能访问，则报错
        //提示 如果查找方法的过程中，没有找到，则提示该方法不存在
        //this.cal();//当前本类查找  等价cal();
        super.cal();//找cal方法的顺序是直接查找父类，其他规则一样

        //演示访问属性的规则
        System.out.println(n1);
        System.out.println(this.n1);
        System.out.println(super.n1);


    }
    //访问父类的方法，但不能访问父类的private方法
    public void ok(){
        super.test100();
        super.test200();
        super.test300();
       // super.test400();不能访问父类私有方法
    }
    //访问父类的构造器super(参数列表);
    //只能放在 构造器中 的第一句，只能出现一句
//    public void hello(){
//        super();//报错 Call to 'super()' must be first statement in constructor body
//    }
    public B(){
       // super();
       // super("jack",10);
        super("jack");
    }
}
