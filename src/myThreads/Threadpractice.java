package myThreads;

public class Threadpractice extends Thread {
	
	public Threadpractice(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		printMyWord("from one");
//		for(int i=0;i<6;i++) {
//			System.out.println(i + " "+ Thread.currentThread());
//		}
	}
	
	public void printMyWord(String name) {
		System.out.println("my name is"+ name );
	}

}
