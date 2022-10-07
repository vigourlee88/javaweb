package datastructor;

import java.util.EmptyStackException;
import java.util.Stack;

/*栈（Stack）实现了一个后进先出（LIFO）的数据结构。
 *把栈理解为对象的垂直分布的栈，当你添加一个新元素时，就将新元素放在其他元素的顶部。
 *当你从栈中取元素的时候，就从栈顶取一个元素。换句话说，最后进栈的元素最先被取出。 
 *栈是Vector的一个子类，它实现了一个标准的后进先出的栈。 
 *堆栈只定义了默认构造函数，用来创建一个空栈。 
 *堆栈除了包括由Vector定义的所有方法，也定义了自己的一些方法。 
 *Object pop( )
 *移除堆栈顶部的对象，并作为此函数的值返回该对象。
 *Object push(Object element)把项压入堆栈顶部。
 *Object peek( )查看堆栈顶部的对象，但不从堆栈中移除它。
 */
public class StackDemo {
	static void showpush(Stack<Integer> st,int a) {
		st.push(new Integer(a));
		System.out.println("push(" + a + ")");
		System.out.println("stack: " + st);
	}
	
	static void showpop(Stack<Integer> st) {
		System.out.print("pop -> ");
		Integer a = (Integer)st.pop();
		System.out.println(a);
		System.out.println("stack: " + st);
	}
	
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		System.out.println("stack: " + st);
		showpush(st,42);
		showpush(st,66);
		showpush(st,99);
		showpop(st);
		showpop(st);
		showpop(st);
		try {
			showpop(st);
		}catch(EmptyStackException e) {
			System.out.println("empty stack");
		}
	}
}
