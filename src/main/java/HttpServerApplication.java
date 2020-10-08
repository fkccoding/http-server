import server.HttpServer;

/**
 * @author https://www.chuckfang.com
 * @date Created on 2020/10/8 15:26
 */
public class HttpServerApplication {
    public static void main(String[] args) {
        HttpServer httpServer = new HttpServer();
        httpServer.start();
    }
}
