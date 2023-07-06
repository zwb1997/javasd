package demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.io.*;

@Slf4j
public class AppTest {
 

    private static final String TEMP_FOLDER = "D:\\iotests\\javaio";

    @Test
    public void inputTest() throws IOException {
        String demo = "hello io\r";
        File f = new File(TEMP_FOLDER +"\\demo1.txt");
        FileOutputStream fos = new FileOutputStream(f,true);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write(demo.getBytes());
        bos.flush();
        bos.close();
    }
  
}
