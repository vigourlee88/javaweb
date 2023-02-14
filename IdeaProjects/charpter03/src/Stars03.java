public class Stars03 {
    public static void main(String[] args) {
        /*

         3.打印整个金字塔
               *           第1层 有 1个*   2 * 层数 - 1   有4=(总层数-1)个空格
              ***          第2层 有 3个*   2 * 层数 - 1   有3=(总层数-2)个空格
             *****         第3层 有 5个*   2 * 层数 - 1   有2=(总层数-3)个空格
            *******        第4层 有 7个*   2 * 层数 - 1   有1=(总层数-4)个空格
           *********       第5层 有 9个*   2 * 层数 - 1   有0=(总层数-5)个空格


        for(int i = 1;i <= 5;i++){//i表示层数
            for(int j = 1;j <= 2*i-1;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }

         */
        for(int i = 1;i <= 5;i++){//i表示层数
            //打印空格
            for(int k = 1;k <= 5 - i;k++) {
                System.out.print(" ");

            }
            for(int j = 1;j <= 2*i-1;j++){
                System.out.print("*");
            }

            System.out.println("\n");
        }
    }
}
