package javaverson9;

import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.time.ZoneId;

//ProcessHandle 接口中声明的 onExit() 方法可用于在某个进程终止时触发某些操作。
public class Tester2 {
	public static void main(String[] args) throws IOException {
		ProcessBuilder pd = new ProcessBuilder("notepad.exe");
		String np = "Not Present";
		Process p = pd.start();
		ProcessHandle.Info info = p.info();//ProcessHandle 嵌套接口 Info
		System.out.printf("Process ID : %s%n",p.pid());
		System.out.printf("Command name : %s%n",info.command().orElse(np));
		System.out.printf("Command line : %s%n",info.commandLine().orElse(np));
		
		System.out.printf("Start time: %s%n",
				info.startInstant().map(i -> i.atZone(ZoneId.systemDefault()).toLocalDateTime().toString()).orElse(np));
				
		System.out.printf("Arguments : %s%n", 
				info.arguments().map(a -> Stream.of(a).collect(Collectors.joining(" "))).orElse(np));
		
		System.out.printf("User : %s%n", info.user().orElse(np));
	}
}
