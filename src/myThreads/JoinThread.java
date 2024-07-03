package myThreads;

public class JoinThread extends Thread{
public static void main(String[] args) {
	

	
	System.out.println("Main starts");
	
	Thread th = new MyThread("Our Thread");
	
//	(or)
	
	Thread th1 = new Thread(() -> {
		System.out.println(Thread.currentThread());
	}, "Thread from same class");
	
	th.start();
	th1.start();
	try {
		th.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
//	try {
//		th1.join();
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
	System.out.println("Main Ends");
}
}

class MyThread extends Thread{
	
	public MyThread(String name) {
         super(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
	}
	
}
