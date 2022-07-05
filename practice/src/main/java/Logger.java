public class Logger {
	//logger类中的format变量为私有变量
	private String format;
	//声明为私有访问类型的变量只能通过类中的公共的getter方法被外部类访问
	public String getFormat() {
		return this.format;//返回format的值
	}
	public void setFormat(String format) {
		this.format = format;//设置format的值
		
	}
}