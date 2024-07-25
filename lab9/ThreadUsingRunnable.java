class ThreadEx implements Runnable{
    @Override
    public void run(){
        for(int j=0;j<=10;j++){
            System.out.println("Hi");
        }
    }
}
public class ThreadUsingRunnable {
    public static void main(String[] args){
        Thread t=new Thread(new ThreadEx());
        t.start();
        for(int i=0;i<=10;i++){
            System.out.println("Hello");
        }
    }
}
