public class HanoTower {
    public static void main(String[] args) {
        //递归调用实例 汉诺塔代码
        Tower tower = new Tower();
        tower.move(2,'A','B','C');
    }
}
class Tower{
    //方法
    //num 表示移动的个数；a b c 分别表示A塔，B塔，C塔
    public void move(int num,char a,char b,char c){
        //如果只有一个盘 num = 1;
        if(num == 1){
            System.out.println(a + "->" + c);
        }else{
            //如果有多个盘,可以看成两个,最下面的和最上面的所有的盘(num-1)
            //1.先移动上面所有的盘到 b,借助 c
            move(num -1,a,c,b);
            //2.把最下面的这个盘,移动到c
            System.out.println(a + "->" + c);
            //3.再把b塔的所有盘,移动到c,借助a
            move(num-1,b,a,c);
        }
    }
}
