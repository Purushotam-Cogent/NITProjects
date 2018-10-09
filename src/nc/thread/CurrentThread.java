package nc.thread;

public class CurrentThread {
	
	public static void main(String[] args) {
		
		
		Thread t=Thread.currentThread();
		
		System.out.println(t);
		
		System.out.println("Thread Name "+t.getName());
		System.out.println("Thread Priority "+t.getPriority());
		
		t.setName("NCThread");
		
		System.out.println(t);
		
		t.setPriority(10);
		
		System.out.println(t);
		
		t.setPriority(Thread.NORM_PRIORITY);
		System.out.println("Norm "+t);
		
		t.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Min"+t);
		
	//	t.setPriority(0);
		
		System.out.println("IsAlive "+t.isAlive());
		System.out.println("isDeamon "+t.isDaemon());
		System.out.println("isInterrupted "+t.isInterrupted());
		
		System.out.println("Thread ID "+t.getId());
		
		System.out.println(Thread.interrupted());
		System.out.println("isInterrupted "+t.isInterrupted());		
		
	}

}
