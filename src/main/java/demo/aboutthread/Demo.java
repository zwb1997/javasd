package demo.aboutthread;

public class Demo extends Thread{
    
    @Override
    public void run() {
        System.out.println("AAA");
    }

    public void run(Runnable r){
        System.out.println("BBB");
    }


    public static void main(String[] args) {
        new Thread(new Demo()).start();
    }
}
