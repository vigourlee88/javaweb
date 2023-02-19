public class Homework03 {
    public static void main(String[] args) {
        //测试
        Book book = new Book("笑傲江湖",20);
        book.info();
        book.updatePrice();//更新价格
        book.info();

    }
}
/*
实现更改某本书的价格，
具体 如果价格>150,则跟改为150
如果价格>100,更改为100，否则不变
分析
1.类名
2.属性 price name
3.方法名updatePrice
4.形参()
5.返回值void
 */
class Book{
    double price;
    String name;
    public  Book(String name,double price){
        this.name = name;
        this.price = price;
    }
    public void updatePrice(){
        //如果方法中，没有price局部变量，this.price 等价 price
        if(this.price > 150){
            this.price =150;
        }else if(this.price >100){
            this.price = 100;
        }
    }
    //显示书籍的情况
    public void info(){
        System.out.println("书名=" + this.name + " 价格=" + this.price);
    }
}