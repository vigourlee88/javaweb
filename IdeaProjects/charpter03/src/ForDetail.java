public class ForDetail {
    public static void main(String[] args) {
        //使用for循环控制
        int i =1;//循环变量初始化
        for( ;i <= 10; ){
            System.out.println("你好"+ i);
            i++;
        }
        System.out.println("i=" + i);//11

        //补充
//        int j = 1;
//        for(;;){//表示一个无限循环，死循环
//            System.out.println("ok~" + (j++));
//        }

        //老师使用内存分析法，看看下面代码输出什么？
        int count = 3;
        for(int k =0,j=0;k <count;k++,j+=2){
            System.out.println("k=" + k + "J="+ j);
        }
    }
}
