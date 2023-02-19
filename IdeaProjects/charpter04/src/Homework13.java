public class Homework13 {
    public static void main(String[] args) {
        Circle01 c = new Circle01();
        PassObject po = new PassObject();
        po.printAreas(c,5);


    }
}
/*
将对象作为参数传递给方法
 */
class Circle01{
    double radius;
    public Circle01(){

    }
    public Circle01( double radius){
        this.radius = radius;
    }
    public double findArea(){//返回面积
        return Math.PI * radius * radius;
    }
    //添加方法setRadius，修改对象的半径值
    public void setRadius(double radius){
        this.radius = radius;
    }
}
class PassObject{
    public void printAreas(Circle01 c,int times){
        System.out.println("radius\tarea");
        //输出1到times之间的每个整数半径值
        for (int i = 1; i <= times; i++) {
            c.setRadius(i);//修改c 对象的半径值
            System.out.println((double)i + "\t" +c.findArea());
        }
    }
}