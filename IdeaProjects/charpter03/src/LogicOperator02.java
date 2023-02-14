public class LogicOperator02 {
    public static void main(String[] args) {
        //||短路或 和 |逻辑或 案例演示
        int age = 50;
        if(age > 20 || age < 30){
            System.out.println("ok100");
        }

        //| 逻辑或使用

        if(age > 20 | age < 30){
            System.out.println("ok200");
        }

        //区别
        int a = 4;
        int b = 9;
        //对于短路或而言，a<1第一个条件为真，则第二个条件就不用去判断,退出条件语句
        //对于逻辑或而言，a<1第一个条件为真，后面的条件仍然去判断 //4 10
        if(a > 1 || ++b < 4){
            System.out.println("ok300");
        }
        System.out.println("a=" + a +"b=" + b);//4 9
    }

}
