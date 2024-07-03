package myThreads;

public class PracticeSynchronization {
public static void main(String[] args) {
	Thread1 t = new Thread1();
	Thread2 t1= new Thread2(t);
	Thread3 t2 = new Thread3(t);
	t1.start();
	t2.start();
}
}

class Thread1{
    synchronized void printTable(int n){//method not synchronized  
		   for(int i=1;i<=5;i++){  
		     System.out.println(n*i);  
		     try{  
		      Thread.sleep(400);  
		     }catch(Exception e){System.out.println(e);}  
		   }  
		  
		 } 
}

class Thread2 extends Thread{
	Thread1 t1;
	Thread2(Thread1 t1){
		this.t1 = t1;
	}
	public void run() {
		t1.printTable(5);
	}
}

class Thread3 extends Thread{
	Thread1 t1;
	Thread3(Thread1 t1){
		this.t1 = t1;
	}
	public void run() {
		t1.printTable(5);
	}
}
