public class MethodExercise01 {
    public static void main(String[] args) {

        AAA a = new AAA();
//        if(a.isOdd(2)){//真的话
//            System.out.println("是一个奇数");
//        }else{
//            System.out.println("是一个偶数");
//        }
        //使用print方法
        a.print(4,4,'#');

    }
}
//编写类AAA 有一个方法；判断一个数是奇数odd还是偶数，返回boolean
class AAA{
    //思路
    //1.方法类型 boolean
    //2.方法名字 isOdd 是奇数
    //3.方法形参 int num
    //4.方法体 判断
    public boolean isOdd(int num ){
//        if(num%2 != 0){
//            return true;
//        }else{
//           return false;
//        }
       // return num%2 != 0? true:false;
        return num%2 != 0;
    }
       /*
       根据行，列 ，字符打印 对应行数和列数的字符，
       比如 行4，列4，字符#，则打印相应的效果
       ####
       ####
       ####
       ####
        */
    //思路
    //1.方法类型 void
    //2.方法名字 print
    //3.方法形参 int row, int column,char c
    //4.方法体 循环
    public void print(int row,int col,char c){
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col; j++) {//输出每一行
                System.out.print(c);
            }
            System.out.println();//换行
        }
    }
}
