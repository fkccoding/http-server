package handler;

import io.netty.handler.codec.http.FullHttpRequest;

/**
 * @author https://www.chuckfang.com
 * @date Created on 2020/10/8 15:30
 */
public interface RequestHandler {
    Object handle(FullHttpRequest fullHttpRequest);
}
