public class MethodExercise02 {
    public static void main(String[] args) {

        Person02 p = new Person02();
        p.name = "milan";
        p.age = 100;
        //创建tools
        MyTools02 tools = new MyTools02();
        Person02 p2 = tools.copyPerson(p);

        //到此 p 和 p2是 Person02对象，但是是两个独立的对象，属性相同
        System.out.println("p的属性 age=" + p.age + "名字=" + p.name);
        System.out.println("p2的属性 age=" + p2.age + "名字=" + p2.name);
        //提示 输出对象的hashcode
        // 可以通过对象比较 是不是一个对象
        System.out.println(p == p2);

    }
}
class Person02{
    String name;
    int age;
}
class MyTools02{
    //编写一个方法copyPerson,可以赋值一个Person对象，返回复制的对象。
    //克隆对象 注意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同
    //思路
    //1.方法类型 Person02
    //2.方法名字 print
    //3.方法形参( )Person02 p)
    //4.方法体 创建一个新对象，并复制属性，返回即可
    public Person02 copyPerson(Person02 p){
        //创建一个新对象
        Person02 p2 = new Person02();
        p2.name = p.name;//把原来(传入)对象的名字赋给p2.name
        p2.age = p.age;//把原来对象的年龄赋给p2.age

        return p2;
    }
}
