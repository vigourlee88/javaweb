public class LogicOperator01 {
    public static void main(String[] args) {
        //&&短路与 和 & 案例演示
        int age = 50;
        if(age > 20 && age < 90){
            System.out.println("ok100");
        }

        //& 逻辑与使用

        if(age > 20 & age < 90){
            System.out.println("ok200");
        }
        //区别
        int a = 4;
        int b = 9;
        //对于短路与而言，a<1第一个条件为假，则第二个条件就不会去判断,退出条件语句
        //对于逻辑与而言，a<1第一个条件为假，后面的条件仍然去判断 //4 10
        if(a < 1 && ++b <50){
            System.out.println("ok300");
        }
        System.out.println("a=" + a +"b=" + b);//4 9
    }
}
