package debug;

public class Student {
		private int id;
		public void regist(int id) throws Exception {
			if (id > 0) {
				this.id = id ;
			}else {
//	//			System.out.println("您输入的数据非法！");
				//手动抛出异常对象
//	//			throw new RuntimeException("您输入的数据非法！");
//				throw new Exception("您输入的数据非法！");
				throw new MyException("不能输入负数");//new 异常类的对象
			}
		}
		@Override
		public String toString() {
			return "student [id=" + id + "]";
		}
		
	}


