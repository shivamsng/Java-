package Thread;

	class ThreadsRunDemos extends Thread {
		 
	    public void run() { // imp method given by thread class java
	 
	        //logic part
	        try {
	            System.out.println("list of threads running " + Thread.currentThread());
	        } catch (Exception e) {
	 
	            System.out.println("exceotion caught" + e);
	 
	        }
	 
	    }
	 
	}
	 
	public class ThreadsRunDemo {
	 
	    public static void main(String ar[]) {
	 
	        int numberOfThreads = 2;
	 
	        for (int i = 0; i < numberOfThreads; i++) {
	 
	        	ThreadsRunDemos threadsDemos = new ThreadsRunDemos();
	 
	            threadsDemos.start();
	            threadsDemos.setName("Shivam thread");
	            threadsDemos.setPriority(8);
	 
	        }
	 
	    }
	 

	}
