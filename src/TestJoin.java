import java.util.Arrays;
import java.util.List;

public class TestJoin implements Runnable{
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		Thread t = new Thread(new TestJoin());
//		t.start();
//		Thread t1 = new Thread(new TestJoin1());
//		t1.start();
//		System.out.println("Started");
////		t1.join();
//		t.join();
//		System.out.println("Completed14");
		
		List<String> as=Arrays.asList("a","b","c","d","eefef");
		for(String s:as){
			System.out.println("==="+s);
		}
	}
	public void run(){
		for(int i=0; i<4; i++){
			System.out.println(i);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
 	class TestJoin1 implements Runnable{
	public void run(){
		for(int i=0; i<4; i++){
			System.out.println("join1=="+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
