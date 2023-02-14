public class TernaryOperatorExercise {
    public static void main(String[] args) {
        //实现三个数的最大值
        int n1 = 55;
        int n2 = 33;
        int n3 = 123;
        //思路
        //1.先得到 n1 和n2的最大值，保存到max1
        //2.然后再 求出max1和n3的最大值
        int max1 = n1 > n2? n1:n2;
        int max2 = max1 >n3 ? max1:n3;
        System.out.println("最大数是"+max2);

    }
}
