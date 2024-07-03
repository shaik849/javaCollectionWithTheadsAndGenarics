package javacollections.generics;


public class LearnGenarics {
public static void main(String[] args) {
	String str = "123";
	
	int a = Integer.valueOf(str);
	System.out.println(a);
	String s = Integer.toString(a);
	System.out.println(s+10);
	MyList<String> list = new MyList<>();
	list.setId("123");
	MyList<Integer> listInt = new MyList<>();
	listInt.setId(123);
	System.out.println(list);
	System.out.println(listInt);
	System.out.println();
}
public <E> int data(E data) {
	return 10;
}
}

class MyList<T>{
	private T id;

	public T getId() {
		return id;
	}

	@Override
	public String toString() {
		return "MyList [id=" + id + "]";
	}

	public void setId(T id) {
		this.id = id;
	}
	
}
