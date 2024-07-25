class Thread1 extends Thread{
   public void run(){
    for(int i=0;i<=10;i++){
        System.out.println("Thread1 running");
    }
   } 
}
class Thread2 extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Thread 2");
        }
    }
}
public class Q5 {
    public static void main(String[] args) throws Exception{
    System.out.println("Name of current thread: "+Thread.currentThread().getName());
    Thread1 t1=new Thread1();
    System.out.println("Name of Executing Thread: "+t1.getName());
    Thread2 t2=new Thread2();
    t2.setPriority(10);
    t1.start();
    t1.join();
    t2.start();
    Thread.currentThread().setName("Virat");
    System.out.println("Name of present Thread is: "+Thread.currentThread().getName());
    } 
}
