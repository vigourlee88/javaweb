/*break and continue and return
 * break关键字用于退出或中断循环。一旦break执行，循环将停止迭代。
 * 
 * 如果我们想跳过迭代，可以将continue关键字放在循环内。
 * 如果continue执行，当前循环迭代将立即结束，并开始下一次迭代。
 * 我们可以使用continue关键字跳过任何偶数迭代：
 * 
 * 如果return关键字在方法中包含的循环内执行，
 * 则循环迭代将停止并且方法/构造函数将退出。
 */
class Numbers {
	public static void main(String[] args) {
		for(int i = 0;i < 100;i++) {
			//Add your code below
			if(i % 5 != 0) {
				continue;//
			}
			System.out.println(i);
		}
	}
}