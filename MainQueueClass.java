package linkedlists;



public class MainQueueClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue<Integer> mq=new MyQueue<>();
		mq.enqueue(12);
		mq.enqueue(2);
		mq.enqueue(123);
		mq.enqueue(45);
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
	}

}
