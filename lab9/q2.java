class Hello implements Runnable{
    public void run(){
    for(int i=0;i<3;i++){
        System.out.println("Runnable thread");
    }
}
}
class Q2{
    public static void main(String[] args){
    Thread t=new Thread(new Hello());
    t.start();
    for(int i=0;i<3;i++){
        System.out.println("Main thread");
    }
}
}
