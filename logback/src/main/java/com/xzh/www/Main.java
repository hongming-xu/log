package com.xzh.www;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-10 22:24
 **/
public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        logger.debug("logback 成功了");
        logger.info("logback 成功了");
        logger.error("logback 成功了");
    }

}
