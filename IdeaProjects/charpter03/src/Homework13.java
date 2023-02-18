public class Homework13 {
    public static void main(String[] args) {
        /*
        随机生成10个整数(1-100)的范围保存到数组，
        并倒序打印以及求平均值，求最大值和最大值的下标
         */
        //随机生成10个整数保存到数组，
        int[] arr = new int[10];
        //(int)(Math.random() * 100) + 1 生产随机数1-100

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100) + 1;
        }
        System.out.println("====arr的元素情况====");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n====arr元素的情况(倒序)====");
        //注意最大下标arr.length-1
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.print(arr[i] + "\t");
        }
        //求平均值，求最大值和最大值的下标
        //遍历数组 总和sum/个数
        //double sum = 0;
        double sum =arr[0];
        int max = arr[0];//假定第一个元素最大，所以循环从第2各元素下标为1开始
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {

            sum += arr[i];//累积和

            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;//下标变化为i
            }
        }
        System.out.println("\nmax=" + max + " maxIndex=" + maxIndex);
        System.out.println("\n平均值=" + (sum/arr.length));

        //查找数组中是否有8->使用顺序查找
        int findNum =8;
        int index = -1;//如果找到就把下表记录到index中
        for (int i = 0; i <arr.length ; i++) {
            if(findNum == arr[i]){
                System.out.println("找到数" + findNum + " 下标=" + index);
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("没有找到数" + findNum);
        }
    }
}
