public class BubbleSort02 {
    public static void main(String[] args) {
        /*
        将5个无序 {24,69,,80,57,13}
        使用冒泡排序将其排成一个从小到大的有序数列
        思路分析
        化繁为简
        先死后活
        数组 {24,69,80,57,13}
        第1次排序 目标把最大数放在最后
        第1次比较 {24,69,80,57,13}
        第2次比较 {24,69,80,57,13}
        第3次比较 {24,69,57,80,13}
        第4次比较 {24,69,57,13,80}


         */
        int[] arr = {24,69,80,57,13,-1,30};
        int temp = 0;//用于辅助交换的变量

        //将多轮排序使用外层循环包括起来即可
        //先死后活=>4就是arr.length-1
        for (int i = 0; i < arr.length-1; i++) {//外层循环4次
            for (int j = 0; j < arr.length-1- i; j++) {//4-i控制比较次数，4次比较-3次-2次
                //如果前面的数>后面的数，就交换
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("\n===第"+(i+1)+"轮===");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
        }
    }
}
