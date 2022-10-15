package www.hsp.practice;

public class Stars {
	public static void main(String[] args) {
		//经典的打印金字塔，使用for 循环完成下面案例
		//请编写一个程序，可以接收一个整数，表示层数totalLevel，打印出金字塔
		/*    3.打印整个金字塔             空格      1.先打印一个矩形   2.打印半个金字塔
		 *        *     第1层1个星 2*1-1  4  5-1     *****           *     第1层1个星
		 *       ***    第2层3个星 2*2-1  3  5-2     *****           **    第2层2个星
		 *      *****   第3层5个星 2*3-1  2  5-3     *****           ***   第2层2个星
		 *     *******  第4层7个星 2*4-1  1  5-4     *****           ****  第4层4个星
		 *    ********* 第4层9个星 2*5-1  0  5-5     *****           ***** 第5层4个星
		 *    4.打印空心的金字塔  
		 *        *      第1层1个星   输出 当前行第一个位置和最后一个位置 星
		 *       * *     第2层2个星   输出 当前行第一个位置和最后一个位置 星
		 *      *   *    第3层2个星   输出 当前行第一个位置和最后一个位置 星
		 *     *     *   第4层2个星   输出 当前行第一个位置和最后一个位置 星
		 *    *********  第4层9个星   输出全部
		 *5 层数做成变量 int totalLevel = 5
		 *
		 *
		 */
		int totalLevel = 5;
		for( int i = 1;i <= totalLevel;i++) {//i表示层数
			//再输出星之前，还要输出 对应空格   总层数-当前层
			for(int k = 1;k <= totalLevel-i;k++) {
				System.out.print(" ");
			}
			//控制打印每层的*的个数
			for(int j = 1;j <= 2*i-1;j++) {
				//当前行的 第一个位置j =1是*,最后一个位置j=2*i - 1也是*,最后一层全部*
				if(j == 1 || j== 2*i - 1 || i== totalLevel) {
					System.out.print("*");
				}else {//其他情况输出空格
					System.out.print(" ");
				}
				
			}
			//每打印完一层的*后，就println本身自动换行
			System.out.println();
		}
		
		
	}

}