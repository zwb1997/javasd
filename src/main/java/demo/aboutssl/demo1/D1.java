package demo.aboutssl.demo1;

import java.io.InputStream;
import java.io.OutputStream;

import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class D1 {
    public static void main(String[] args) {
        SocketFactory sslsocketfactory = SSLSocketFactory.getDefault();
        try {
            SSLSocket sslsocket = (SSLSocket) sslsocketfactory.createSocket("asd", 8900);
            try (InputStream in = sslsocket.getInputStream()) {

            }
            try (OutputStream out = sslsocket.getOutputStream()) {

            }

        } catch (Exception ex) {

        }
    }
}
