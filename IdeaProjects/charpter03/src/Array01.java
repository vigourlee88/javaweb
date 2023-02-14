import java.lang.reflect.Array;

public class Array01 {
    public static void main(String[] args) {
        /*
        一个养鸡场有6只鸡，他们的体重分别是3kg,5kg,1kg,
        3.4kg,2kg,50kg.请问这六只鸡的总体重量是多少？平均体重是多少?
         思路
         1.定义6个变量 double 求和 得到总体重
         2.平均体重=总体重 / 6
         引出-数组
         定义一个数组
         1.double[]表示是 double类型的数组，数组名hens
         2. {3,5,1,3.4,2,50}表示数组的值/元素
         */
        double[] hens = {3,5,1,3.4,2,50};
        //遍历数组，得到数组所有元素的和 使用for
        //1.我们可以通过hens[下标] 来访问数组的元素
        // 下标是从0开始标号，第一个元素就是hens[0]
        //2.通过for就可以循环的访问 数组的元素/值
        //3.使用一个变量totalWeight 将各个元素累积
        //4.数组的长度 — hens.length
        double totalWeight = 0;
        for(int i = 0;i < hens.length;i++){
           // System.out.println("第" +(i+1) + "个元素的值="+ hens[i]);
            totalWeight += hens[i];
        }
        System.out.println("总体重="+ totalWeight
               +"平均体重=" + totalWeight/hens.length);
    }
}
