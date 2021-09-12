package Thread;

class ThreadsSleepDemos extends Thread {
	 
    public void run() { // imp method given by thread class java
 
        // logic part
        try {
            for (int i = 1; i < 5; i++) {
                Thread.sleep(5000);
                System.out.println(i);
            }
 
        } catch (Exception e) {
 
            System.out.println("exception caught" + e);
 
        }
 
    }
 
}
 
public class ThreadsSleepDemo {
 
    public static void main(String ar[]) {
 
        ThreadsSleepDemos threadsDemos = new ThreadsSleepDemos();// created the object of a class
 
    

        threadsDemos.start();
 

    }
 

}