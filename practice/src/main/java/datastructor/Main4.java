package datastructor;

import java.util.LinkedList;

//使用 top() 和 pop() 方法来获取链表的元素：
public class Main4 {
	private LinkedList list = new LinkedList();
	public void push(Object v) {
		list.addFirst(v);
	}
	public Object top() {
		return list.getFirst();
	}
	public Object pop() {
		return list.removeFirst();
	}
	public static void main(String[] args) {
		Main4 stack = new Main4();
		for (int i = 30;i < 40;i++) 
			stack.push(new Integer(i));
			System.out.println(stack.top());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
	
	}
}
