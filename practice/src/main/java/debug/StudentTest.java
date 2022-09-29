package debug;

public class StudentTest {
	public static void main(String[] args) {
		try {
			Student s = new Student();
			s.regist(-100);
			System.out.println(s);
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
	}
	
}
