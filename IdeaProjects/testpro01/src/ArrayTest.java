import java.util.Scanner;


public class ArrayTest {
    //使用模板
    public static void main(String[] args) {
        //快速格式化代码  ctrl+alt +L
        //快速运行代码 自定义 alt+R
        int n = 1 + 3 + 4 + 5 * 6;
        //导入该行需要的类 alt+enter
        //查看类的层级关系 ctrl+h(继承)
        Scanner myScanner = new Scanner(System.in);
        //开始快捷键自动分配 变量名.var
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        MyTools myTools = new MyTools();


        MyTools mt = new MyTools();
        int[] arr = {10, -1, 8, 0, 34};
        //光标移至方法上，自动定位到哪个类的方法上 ctrl+b
        mt.bubble(arr);
        //输出排序后的arr,引用传
        System.out.println("===排序后的arr===");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
//查看类的类继承关系 ctrl+h
class Person{
    String name;
    int age;
    //构造器 快捷键生成 alt+insert
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
//创建一个类MyTools,编写一个方法，可以完成对int数组冒泡排序的功能
//要求从小到大
class MyTools {
    public void bubble(int[] arr) {
        //冒泡排序
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {//外层循环次数 arr.length - 1
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {//交换
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}




