public class ArrayExercise01 {
    public static void main(String[] args) {
        /*
        创建一个char类型的26个元素的数组，分别放置'A'-'Z'
        使用for循环访问所有元素并打印出来,提示char类型的数据运算'A'+1 -> 'B'
        思路分析
        1.定义一个数组
        2.因为 'A'+1 -> 'B'，使用for循环来赋值
        3.使用for循环访问所有元素
         */
        //定义一个数组,使用for循环来赋值
        char[] chars = new char[26];
        for (int i = 0; i < chars.length; i++) {//循环26次
            //chars是char[]
            //chars[i]是char
            chars[i] = (char) ('A' + i);//'A' + i是int；需要强转
        }
        //循环输出
        System.out.println("====chars数组====");
        for (int i = 0; i < chars.length; i++) {//循环26次
            System.out.print(chars[i]+ " ");
        }
    }
}
