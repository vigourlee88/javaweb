package javaverson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

//已经有一个资源是 final 或等效于 final 变量,您可以在 try-with-resources 语句中使用该变量，而无需在 try-with-resources 语句中声明一个新变量。

public class Tester7 {
	public static void main(String[] args) throws IOException {
		System.out.println(readData("test"));
	}
	static String readData(String message) throws IOException {
		Reader inputString= new StringReader(message);
		BufferedReader br = new BufferedReader(inputString);
	//	try (BufferedReader br1 = br){//我们需要在 try 语句块中声明资源 br1，然后才能使用它。
	//		return br1.readLine()
        try (br) {
        	return br.readLine();
			
		}
	}
}
