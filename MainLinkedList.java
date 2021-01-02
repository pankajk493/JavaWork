package linkedlists;
import java.util.*;
public class MainLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> ll=new LinkedList<>();
//		List<Integer> al=new ArrayList<>();
//		//System.out.println(ll);
//		getTimeDiff(al);
//		getTimeDiff(ll);
//
//	}
//	static void getTimeDiff(List<Integer> list) {
//		long start=System.currentTimeMillis();
//		for(int i=0;i<100000;i++) {
//			list.add(0,i);
//		}
//		long end=System.currentTimeMillis();
//		System.out.println(list.getClass().getName() + "-->" + (end-start));
		MyLinkedList myLL=new MyLinkedList();
		for(int i=0;i<10;i++) {
			myLL.add(i);
		}
		myLL.print();
	}

}
