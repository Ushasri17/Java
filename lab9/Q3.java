class Thread1 implements Runnable{
   public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("Hello Namaste");
        }
   }
}
public class Q3{
    public static void main(String[] args){
        Thread t=new Thread(new Thread1());
        t.start();
        try{
            t.sleep(2000);
        }
        catch(Exception e){
            System.out.println("Hello");
        }
        for(int i=0;i<10;i++){
            System.out.println("Hi");
        }
    }
}