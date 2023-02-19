
public class Test {//公有类
    int count = 9;//属性
    public void count1(){//成员方法
        count = 10;//这个count就是属性 改成10
        System.out.println("count1=" + count);//10
    }
    public void count2(){//成员方法
        System.out.println("count1=" + count++);//9 -> 10
    }
    public static void main(String[] args) {

        //1.new Test()是匿名对象；匿名对象使用后，就不能使用
        //2.创建匿名对象后，就调用count1();
        new Test().count1();//10
        Test t1 = new Test();
        t1.count2();//9
        t1.count1();//10
    }
}


