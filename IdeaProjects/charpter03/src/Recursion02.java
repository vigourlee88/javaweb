public class Recursion02 {
    public static void main(String[] args) {
        F t1 = new F();
        t1.test(4);//2


    }
}
class F {
    //分析
    public void test(int n){
        if(n > 2){
            test(n -1);
        }else {
            System.out.println("n=" + n);
        }
    }
}


