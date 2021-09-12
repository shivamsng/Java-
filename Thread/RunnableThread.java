package Thread;

public class RunnableThread implements Runnable {
	private int threadId;
	private int delay;

	RunnableThread(int id, int d) {
		threadId = id;
		delay = d;// time for which thread sleeps
	}

public void run(){
    for(int i=0;i<5;i++){
       System.out.println("Thread "+ threadId +" is running");
       try{

          Thread.sleep(delay);
       }
       
       catch(InterruptedException e){
    	   e.printStackTrace();
       }
   }
    
   System.out.println("Thread "+ threadId +" is completed");
}
}

class MyRunnableThread {
public static void main(String[] args){
	
   System.out.println("Main thread starts");
   
	RunnableThread r1 = new RunnableThread(1,5000);
	
    Thread t1 = new Thread(r1);
	
    t1.start();

   System.out.println("Main thread is completed");
}
}