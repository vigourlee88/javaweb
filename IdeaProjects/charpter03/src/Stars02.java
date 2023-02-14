public class Stars02 {
    public static void main(String[] args) {
        /*

         2.打印半个金字塔
               *         第1层 有 1个*
               **        第2层 有 2个*
               ***       第3层 有 3个*
               ****      第4层 有 4个*
               *****     第5层 有 5个*
         */
        for(int i = 1;i <= 5;i++){//i表示层数
            for(int j = 1;j <= i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
