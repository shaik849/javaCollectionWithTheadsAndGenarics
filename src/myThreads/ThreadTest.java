package myThreads;

public class ThreadTest {
public static void main(String[] args) {
	
	System.out.println("main staring");
	Thread th = new Threadpractice("thread1");
	Thread th1 = new Threadpractice("Synchrozation test");
	Thread tr = new Thread(new RunnableThread(), "thread2");
	th.start();
    th1.start();
//	tr.start()
	System.out.println("Existing main thread");
}
}
