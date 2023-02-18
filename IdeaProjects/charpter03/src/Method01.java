public class Method01 {
    public static void main(String[] args) {
        //方法的使用
        //创建一个对象，然后调用其方法
        PersonC p1 = new PersonC();
        p1.speak();
        p1.cal01();
        p1.cal02(5);//调用cal02,同时给n=5
        p1.cal02(10);//调用cal02,同时给n=10

        //调用getSum方法，同时num1=10,num2=20;
        //把方法返回的值 赋给变量returnRes
        int returnRes = p1.getSum(10,20);
        System.out.println("getSum方法 返回的值=" + returnRes);
    }
}
class PersonC{
    String name;
    int age;
    public void speak(){
        System.out.println("我是一个好人");
    }
    //添加cal01 成员方法，可以计算从1+..+1000的结果
    public void cal01(){
        //循环完成
        int res = 0;
        for (int i = 1; i <= 1000; i++) {
            res += i;
        }
        System.out.println("cal01方法 计算结果=" + res);
    }
    //添加cal02成员方法 该方法可以接收一个数n,计算从1+..+1000的结果
    //1.(int n )形参列表，表示当前有一个形参 n;可以接收用户输入
    public void cal02(int n){
//循环完成
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        System.out.println("cal02方法 计算结果=" + res);
    }
    //添加getSum成员方法，可以计算两个数的和
    public int getSum(int num1,int num2){
        int res = num1 + num2;
        return res;
    }
}
