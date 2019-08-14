package cn.com.controller;

import cn.com.config.WebSocketHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/send")
public class SendMessageController {

    @Resource
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
