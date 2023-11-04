package com.wzy.bigmodel.service;

import com.wzy.bigmodel.bean.ResultBean;

/**
 * @description
 * @author: Wangzhaoyi
 * @create: 2023-11-04 10:50
 **/
public interface PushService {

    void pushToOne(String uid, String text);

    void pushToAll(String text);

    ResultBean pushMessageToXFServer(String uid, String text);
}
