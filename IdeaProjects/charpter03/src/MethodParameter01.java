public class MethodParameter01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //创建AAAA对象
        AAAA obj = new AAAA();
        obj.swap(a,b);

        System.out.println("a=" + a + " b=" + b);//10 20

    }
}
class AAAA {
    public void swap(int a,int b){
        System.out.println("\na和b交换前的值\na=" + a + "\tb=" + b );
        //完成a和b的交换
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("\na和b交换后的值\na=" + a + "\tb=" + b);
    }
}
