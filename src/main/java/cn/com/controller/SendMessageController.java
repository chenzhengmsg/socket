package cn.com.controller;

import cn.com.config.WebSocketHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/send")
public class SendMessageController {

    @Autowired
    private WebSocketHandler webSocketHandler;

    @RequestMapping("/msg")
    public Boolean msg(String user,String msg) {
        try {
            webSocketHandler.sendMessage(user,msg);
        } catch (Exception e) {

        }
        return true;
    }
}
