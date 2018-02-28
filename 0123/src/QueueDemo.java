import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		String [] array = {"이미자", "나훈아", "설운도", "소녀시대"};
		Queue<String> queue = new LinkedList<String>();
		for(String str : array)  queue.offer(str);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
	}
}
