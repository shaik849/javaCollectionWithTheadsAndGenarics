package myThreads;

public class RunnableThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<5;i++) {
			System.out.println(i+ " "+ Thread.currentThread());
		}
	}

}
