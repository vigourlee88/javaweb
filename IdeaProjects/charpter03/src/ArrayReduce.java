import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args) {
        /*
        有一个数组{1,2,3,4,5}
        可以将该数组进行缩减，提示用户是否缩减
        每次缩减最后那个元素，只当剩下最后一个元素，提示，不能再缩减
        思路分析

         */
        Scanner myScanner = new Scanner(System.in);

        int[] arr = {1,2,3,4,5};
        do {
            int[] arrNew = new int[arr.length - 1];
            //遍历数组 依次将arr的元素拷贝到arrNew数组
            for (int i = 0; i < arr.length - 1; i++) {
                arrNew[i] = arr[i];
            }
            System.out.println("缩减最后一个元素");

            int reduceNum = myScanner.nextInt();

            arrNew[arrNew.length - 1] = reduceNum;
            //让arr指向arrNew,
            arr = arrNew;
            System.out.println("只当剩下最后一个元素，不能再缩减");
            if(arr[0] == '1'){//如果输入你n,就退出
                break;//退出当前循环4
            }
        }while(true);

    }
}
