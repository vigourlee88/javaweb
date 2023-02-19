public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("mary",20);
        Person p2 = new Person("smith",30);

        System.out.println("p1和p2比较的结果=" + p1.compareTo(p2));

    }
}
class Person{
    String name;
    int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    //compareTO比较方法
    public boolean compareTo(Person p){
        //名字和年龄完全一样
//        if(this.name.equals(p.name)&& this.age == p.age){
//            return true;
//        }else{
//            return false;
//        }
        return this.name.equals(p.name)&& this.age == p.age;
    }
}