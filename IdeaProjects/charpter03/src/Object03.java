public class Object03 {
    public static void main(String[] args) {
        PersonA p1 = new PersonA();
        p1.age = 10;
        p1.name= "小明";
        PersonA p2 = p1;
        System.out.println(p2.age);
    }
}
class PersonA{
    String name;
    int age;
}