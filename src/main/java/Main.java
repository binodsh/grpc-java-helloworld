import com.github.binodsh.HelloWorldServer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("hello world");
        HelloWorldServer helloWorldServer = new HelloWorldServer();
        helloWorldServer.start();
        helloWorldServer.blockUntilShutdown();

    }
}
