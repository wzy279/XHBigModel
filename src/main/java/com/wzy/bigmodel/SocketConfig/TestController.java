package com.wzy.bigmodel.SocketConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @description
 * @author: Wangzhaoyi
 * @create: 2024-01-15 16:04
 **/
@RestController
public class TestController {

    @Autowired
    MyWebSocket myWebSocket;



    public void sendMessage(String message) throws IOException {
        myWebSocket.sendMessage("1",message);
    }
}
