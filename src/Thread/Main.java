package Thread;

public class Main {

	public static void main(String[] args) {
		 MinhaThread t1 = new MinhaThread();
	        t1.start(); 
	        
	      Thread t2 = new Thread(new MinhaTarefa());
	      t2.start();
	}
}
