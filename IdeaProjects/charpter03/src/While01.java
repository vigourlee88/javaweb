public class While01 {
    public static void main(String[] args) {
        //输出10句 你好，hsp教育
        int i = 1;//循环变量初始化
        while(i <= 10){//循环条件
            System.out.println("你好，hsp教育" + i);//执行语句
            i++;
        }
        System.out.println("退出while循环，继续.."+ i);
    }
}
