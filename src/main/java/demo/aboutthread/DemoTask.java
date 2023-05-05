package demo.aboutthread;

import java.util.concurrent.Callable;

public class DemoTask implements Callable<String>{
    
    @Override
    public String call() throws Exception {
        // TODO Auto-generated method stub
        return "hello!";
    }
}
