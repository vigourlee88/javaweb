public class Object04 {
    public static void main(String[] args) {
        PersonB a = new PersonB();
        a.age = 10;
        a.name = "小明";
        PersonB b;
        b = a;
        System.out.println(b.name);//小明
        b.age = 200;
        b = null;
        System.out.println(a.age);//200
        System.out.println(b.age);//出现异常
    }
}
class PersonB{
    String name;
    int age;
}