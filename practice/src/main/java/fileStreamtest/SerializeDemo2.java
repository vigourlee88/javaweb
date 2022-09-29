package fileStreamtest;

import java.io.*;

/*实例化一个对象，实现 java.io.Serializable接口。
 *并将该对象序列化到一个文件中。
 *该程序执行后，就创建了一个名为employee.ser文件。
 *将序列对象写入文件之后，可以从文件中读出来，并且对它进行反序列
 * 
 */


public class SerializeDemo2 {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Reyan Ali";
		e.address = "Phokka kuan,Ambehta Peer";
		e.SSN = 11122333;
		e.number = 101;
		
		try {
			FileOutputStream fileOut = new FileOutputStream("/tmp/Employee.ser.");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);//序列化一个对象e，把它发送到输出流
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in /tmp/Employee.ser.");
		} catch (Exception i) {
			i.printStackTrace();
			
		}
		
	}

}
