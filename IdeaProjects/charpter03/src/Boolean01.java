public class Boolean01 {
    public static void main(String[] args) {
        //演示判断成绩是否通过实例
        //定义一个布尔变量，不可以0或非 0的整数替代false和true
        boolean isPass = true;
        if(isPass == true){
            System.out.println("考试通过恭喜");
        }else{
            System.out.println("考试没有通过，下次努力");
        }
    }
}
