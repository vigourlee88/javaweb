public class MethodDetail {
    public static void main(String[] args) {

        AA a = new AA();
        int[] res = a.getSumAndSub(1,4);
        System.out.println("和=" + res[0]);
        System.out.println("差=" + res[1]);

        //细节 调用带有参数的方法是，一定对应着参数列表传入相同类型或兼容类型的参数
        byte b1 = 1;
        byte b2 = 2;
        a.getSumAndSub(b1,b2);//byte => int 兼容ok
        //a.getSumAndSub(1.1,1.8);//double => int 错误
        //细节 实参和形参的类型要一致或者兼容，个数，顺序必须一致
        //a.getSumAndSub(100);//个数不一致
        a.f3("tom",10);
        //a.f3(100,"jack");//实参和形参顺序不一致
    }
}
class AA {
    //1.一个方法最多有一个返回值，但是值得类型可以是数组，放几个具体的数据
    public int[] getSumAndSub(int n1,int n2){
        int[] resArr = new int[2];
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;
        return resArr;
    }
    //2.如上，返回类型可以是基本数据类型，也可以是引用数据类型-数组，对象

    //3.如果方法要求返回数据类型，则方法体中最后的执行语句必须为 return 值；值可以为常量
    //而且要求返回值类型 必须和return 的值类型一致或者兼容
    public double f1(){
        double b1 = 1.1 * 3;
        int n = 100;
        return b1;
        //return 1.1;
        //return n;//int => double 兼容ok
    }
    //如果方法是void,则方法体中可以没有return 语句，或者只写 return;//不能带值
    public void f2(){
        System.out.println("hello1");
        System.out.println("hello2");
        System.out.println("hello3");

        return;//不能带值
    }
    public void f3(String str,int n){

    }
}