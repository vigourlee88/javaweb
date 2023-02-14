public class Test {
    public static void main(String[] args) {

//        int x = 5;
//        int y = 5;
//        if (x++ == 6 & ++y == 6) {
//            x = 11;
//        }
//        System.out.println("x="+x+",y="+y);//6 6

//        int x = 5;
//        int y = 5;
//        if (x++ == 6 && ++y == 6) {//短路与，有一个条件是false就false后边不执行
//            x = 11;
//        }
//        System.out.println("x="+x+",y="+y);//6 5

//        int x = 5;
//        int y = 5;
//        if (x++ == 5 | ++y == 5) {//两边都要执行
//            x = 11;
//        }
//        System.out.println("x="+x+",y="+y);//11 6

//        int x = 5;
//        int y = 5;
//        if (x++ == 5 || ++y == 5) {//短路或，有一个条件true就true。后边不执行
//            x = 11;
//        }
//        System.out.println("x="+x+",y="+y);//11 5

        boolean x = true ;
        boolean y = false;
        short z = 46;
        //&&一个为真必须都是真，这时两边都要执行
        if((z++ == 46)&&(y = true)) //y=true,这里是赋值注意
            z++;
        //短路或，只要一个为真就为真，两边也要执行
        if((x = false)||(++z == 49))
            z++;
        System.out.println("z="+z);//50
    }
}