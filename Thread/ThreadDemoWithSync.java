package Thread;

//example of java synchronized method  
class Table2 {
  synchronized void printTable(int n) {// synchronized method
      for (int i = 1; i <= 5; i++) {
    	  
          System.out.println(n * i);
          
          try {
              Thread.sleep(6000);

          } 
          catch (Exception e) {
              System.out.println(e);
          }
      }

  }
}

class MyThread3 extends Thread {
  Table2 t;

  MyThread3(Table2 t) {
      this.t = t;

  }


  public void run() {
      t.printTable(5);

  }

}

class MyThread4 extends Thread {
  Table2 t;

  MyThread4(Table2 t) {
      this.t = t;
  }

  public void run() {
      t.printTable(100);
  }
}

public class ThreadDemoWithSync {
  public static void main(String args[]) {
      Table2 obj = new Table2();// only one object
      MyThread3 t1 = new MyThread3(obj);
      t1.setName("Shivam");
      MyThread4 t2 = new MyThread4(obj);
      t2.setName("Singh");
      t1.start();
      t2.start();
  }
}
