import java.io.*;
class T1 extends Thread{
    public synchronized void t1(){
        System.out.println("Thread1 starts");
        for(int i=0;i<10;i++){
            System.out.println("Thread1 stared");
        }
        try{
            Thread.sleep(3000);
        }
        catch(Exception e){
            System.out.println("Hello");
        }
    }
}
class T2 extends Thread{
    public synchronized void t2(){
        System.out.println("Thread2 starts");
        for(int i=0;i<=10;i++){
            System.out.println("Thread2 started");
        }
    }
}
class Q4{
    public static void main(String[] args) {
        T1 t=new T1();
        T2 t1=new T2();
        t.t1();
        t1.t2();
    }
}