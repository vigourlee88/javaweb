import java.util.Scanner;

public class SeqSearch {
    public static void main(String[] args) {
        /*
        思路分析
        1.定义一个字符串数组
        2.接收用户输入，遍历数组，逐一比较，如果有，则提示信息，并退出
         */
        //定义一个字符串数组
        String[] names= {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入名字");
        String findName = myScanner.next();

        //遍历数组，逐一比较，如果有，则提示信息，并退出
        //编程思想  用索引来记录一下
        int index = -1;
        for (int i = 0; i < names.length; i++) {
            //字符串比较 equals  如果要找到名字就是当前元素
            if(findName.equals(names[i])){
                System.out.println("恭喜你找到"+ findName);
                System.out.println("下表为="+ i);
                //把 i 保存到index
                index = i;
                break;//找到就提前退出
            }
        }
        if(index == -1){//说明没找到
            System.out.println("sorry,没有找到" + findName );
        }
    }
}
