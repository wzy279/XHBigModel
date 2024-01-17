package com.wzy.bigmodel.controller;

import com.alibaba.fastjson2.JSONObject;
import com.wzy.bigmodel.BigModel.ResultBean;
import com.wzy.bigmodel.service.PushService;
import lombok.extern.slf4j.Slf4j;
import okhttp3.WebSocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @description
 * @author: Wangzhaoyi
 * @create: 2023-11-04 10:50
 **/
@Slf4j
@RestController
@RequestMapping("/xfModel")
public class XFMessageController {

    @Autowired
    private PushService pushService;


    @GetMapping("/test")
    public ResultBean test(String uid, String text) {
        if (StringUtils.isEmpty(uid) || StringUtils.isEmpty(text)) {
            uid = UUID.randomUUID().toString();
            System.out.println(uid);
//            log.error("uid或text不能为空");
//            return ResultBean.fail("uid或text不能为空");
        }
        return pushService.pushMessageToXFServer(uid, text);
    }


}
