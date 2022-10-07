package datastructor;

import java.util.Enumeration;
import java.util.Vector;

/*Vector向量类实现了一个动态数组,大小能根据需要动态的变化。Vector对象的元素也能通过索引访问。
 *使用Vector类最主要的好处就是在创建对象的时候不必给对象指定大小，它的大小会根据需要动态的变化。
 *Vector是同步访问的，包含了很多传统的方法，这些方法不属于集合框架。
 *主要用于事先不知道数组的大小，或者只需要一个可以改变大小的数组的情况下。
 *Vector 类支持 4 种构造方法。
 *第一种构造方法创建一个默认的向量，默认大小为 10：Vector()
 *第二种构造方法创建指定大小的向量。Vector(int size) 
 *第三种构造方法创建指定大小的向量，并且增量用 incr 指定。增量表示向量每次增加的元素数目。
 *Vector(int size,int incr)
 *第四种构造方法创建一个包含集合 c 元素的向量：Vector(Collection c)
 */
public class VectorDemo {
	
	public static void main(String[] args) {
		//initial size is 3,increment is 2
		Vector v = new Vector(3,2);//创建指定大小的向量，并且增量用
		System.out.println("Initial size: " + v.size());
		System.out.println("Initial capacity: " + v.capacity());
		v.addElement(new Integer(1));//将指定的组件添加到此向量的末尾，将其大小增加 1。
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		System.out.println("capacity after four additions: "+ v.capacity());
		
		v.addElement(new Double(5.45));
		System.out.println("Current capacity: " + v.capacity());//int capacity()返回此向量的当前容量。
		v.addElement(new Double(6.08));
		v.addElement(new Integer(7));
		System.out.println("Current capacity: "+ v.capacity());
		v.addElement(new Float(9.4));
	    v.addElement(new Integer(10));
	    System.out.println("Current capacity: " + v.capacity());
	    v.addElement(new Integer(11));
	    v.addElement(new Integer(12));
	    System.out.println("First element: " +
	         (Integer)v.firstElement());
	    System.out.println("Last element: " +
	         (Integer)v.lastElement());
	    if(v.contains(new Integer(3)))
	    	System.out.println("Vector contains 3.");
	    //Enumerate the element in the Vector.
	    Enumeration vEnum = v.elements();
	    System.out.println("\nElements in vector:");
	    while(vEnum.hasMoreElements()) 
	    	System.out.print(vEnum.nextElement() + " ");
	    System.out.println();     
	}
}
