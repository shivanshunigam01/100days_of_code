import java.util.*;
import java.util.function.Supplier;

public class kuchbhi {
	public static void main(String args[])
	{
		

		// For ArrayList
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		System.out.println("ArrayList : " + list.toString());
		list.remove(1);
		System.out.println("ArrayList(Remove) : " + list.toString());
		

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(12);
		list2.add(33);
		List<Integer> list3 = new ArrayList<Integer>();

		/////////list3=list.addAll(list2);
		System.out.println("ArrayList(Remove) : " + list3.toString());
		// For LinkedList
		List<Integer> llist = new LinkedList<Integer>();
		llist.add(2);
		llist.add(4);
		llist.add(45);
		llist.add(48);
		llist.add(64);
		System.out.println("LinkedList : " + llist.toString());
		llist.remove(4);
		System.out.println("LinkedList After Removal : " + llist.toString());
		// For Stack
		List<Integer> stack = new Stack<Integer>();
		stack.add(3);
		stack.add(1);
		System.out.println("Stack : " + stack.toString());

	}
}
