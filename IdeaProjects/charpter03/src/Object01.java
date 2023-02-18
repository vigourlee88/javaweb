public class Object01 {
    public static void main(String[] args) {
        //单独变量来解决==> 不利于数据的管理
        String cat1Name = "小白";
        int cat1Age =3;
        String cat1Color="白色";

        String cat2Name = "小花";
        int cat2Age =3;
        String ca21Color="花色";
        //数组==>(1)数据类型体现不出来,
        //(2)只能通过下标获取信息，造成变量名字和内容的对应关系不明确
        //(3)不能体现猫的行为
        String[] cat11 = {"小白","3","白色"};
        String[] cat22 = {"小花","100","花色"};

        //使用oop面向对象解决
        //实例化一只猫 创建一只猫的对象
        //1.new Cat()
        //2.Cat cat1 = new cat();把创建的猫赋给cat1
        //3.cat1就是一个对象，指向这只猫
        Cat cat1 = new Cat();
        cat1.name= "小白";
        cat1.age = 3;
        cat1.color= "白色";

        Cat cat2 = new Cat();
        cat2.name= "小花";
        cat2.age = 100;
        cat2.color= "花色";

        //怎么访问对象的属性
        System.out.println("第1只猫信息" +
                cat1.name + " " + cat1.age + " " + cat1.color);
        System.out.println("第2只猫信息" +
                cat2.name + " " + cat2.age + " " + cat2.color);
    }
}
//使用面向对象的方式来解决猫的问题
class Cat {
    //属性
    String name;
    int age;
    String color;
   // double weight;
}
