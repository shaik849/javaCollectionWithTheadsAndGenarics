package myThreads;

public class DeadLockSituation  {
public static void main(String[] args) {
	String lock1 = "ridhi";
	String lock2 = "datha";
	System.out.println("main starts");
	Thread thread1 = new Thread(() ->{
		synchronized (lock1) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (lock2) {
				System.out.println("Lock aquired");
			}
		}
	}, "Thread1");
	Thread thread2 = new Thread(() ->{
		synchronized (lock2) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (lock1) {
				System.out.println("Lock aquired");
			}
		}
	}, "Thread1");
	thread1.start();
	thread2.start();
}
}
