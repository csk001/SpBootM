package thread;

public class TestJoin {

	public static void main(String[] args) throws Throwable {

		System.out.println("main start");
		Thread t1 = new Thread("thread-1");
		t1.start();
//		t1.join();
		System.out.println("main end");

	}
}
