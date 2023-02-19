public class Homework01 {
    public static void main(String[] args) {
        double[] arr = {1,4.9,1.67};
        A01 a01 = new A01();
       // System.out.println("arr的最大值=" + a01.max(arr));
        Double res = a01.max(arr);
        if(res != null){
            System.out.println("arr的最大值="+ res);
        }else{
            System.out.println("arr的输入有误,数组不能为null,或{}");
        }
    }
}
/*
实现求某个double数组的最大值，并返回
 */
class A01{
    public Double max(double[] arr) {
        //先判断是否为null,再判断length > 0
        if (arr != null && arr.length > 0) {
            //保证arr至少有1个元素
            double max = arr[0];//假定第一个元素是最大值
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }else{
            return null;
        }
    }
}