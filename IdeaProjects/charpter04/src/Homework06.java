public class Homework06 {
    public static void main(String[] args) {
        Cale cale1 = new Cale(2,0);
        System.out.println("和=" + cale1.sum());
        System.out.println("差=" + cale1.minus());
        System.out.println("乘=" + cale1.mul());
        Double divRes = cale1.div();
        if(divRes != null){
            System.out.println("除=" + cale1.div());
        }
    }
}
class Cale{
    double num1;
    double num2;
    public Cale(double num1,double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public double sum(){
        return num1 + num2;
    }
    public double minus(){
        return num1 - num2;
    }
    public double mul(){
        return num1 * num2;
    }
    //null不能返回成double，double=>Double包装类
    public Double div(){
        //判断
        if(num2 == 0){
            System.out.println("不能为0");
            return null;//返回空
        }
        return num1 / num2;
    }
}