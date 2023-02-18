import java.util.Scanner;

public class ArrayAdd02 {
    public static void main(String[] args) {
        /*
        实现动态地给数组添加元素效果，实现对数组扩容
        1.增加的元素4，直接放在数组的最后arr {1,2,3，4}
        2.用户可以通过如下方法来决定是否继续添加，添加成功，是否继续y/n?
        思路分析
        1.定义初始数组int[] arr {1,2,3}下标0-2
        2.arr[3] = 4;//不行
        3.定义一个新的数组int[] arrNew = new int[arr.length+1]
        4.遍历数组 依次将arr的元素拷贝到arrNew数组
        5.将4赋给arrNew[arrNew.length-1] = 4;把4赋给arrNew最后一个元素
        6.让arr指向arrNew,arr = arrNew;原来arr数组就被销毁
        7.创建一个Scanner可以接收用户输入
        8.因为用户什么时候退出，不确定，使用do-while+break来控制

          */
        Scanner myScanner = new Scanner(System.in);

        int[] arr = {1,2,3};

        do {
            int[] arrNew = new int[arr.length + 1];
            //遍历数组 依次将arr的元素拷贝到arrNew数组
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }
            System.out.println("请输入你要添加的元素");
            int addNum = myScanner.nextInt();
            //将addNum赋给arrNew[arrNew.length-1] 最后一个元素;
            arrNew[arrNew.length - 1] = addNum;
            //让arr指向arrNew,
            arr = arrNew;
            //输出arr,看看效果
            System.out.println("====arr扩容后元素情况====");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            //问用户是否继续
            System.out.println("是否继续添加y/n");
            char key = myScanner.next().charAt(0);
            if(key == 'n'){//如果输入你n,就退出
                break;//退出当前循环4
            }
        }while(true);
        System.out.println("你退出了添加");
    }
}
