class Helo extends Thread{
    @Override
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("Child Thread");
        }
    }
}
class Multithreading {
        public static void main(String[] args){
            Helo h=new Helo();
            h.start();
            for(int i=0;i<3;i++){
                System.out.println("Main Thread");
            }
        }
}
