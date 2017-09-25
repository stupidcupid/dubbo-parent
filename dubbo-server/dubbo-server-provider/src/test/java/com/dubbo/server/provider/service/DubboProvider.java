package com.dubbo.server.provider.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by nanzhou on 2017/9/25.
 */
public class DubboProvider {

    private static final Log log = LogFactory.getLog(DubboProvider.class);

    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext context =
                    new ClassPathXmlApplicationContext(new String[]{"spring/*.xml", "dubbo/*.xml"});
            context.start();
            System.out.println("DubboProvider context start success ! ");
        } catch (Exception e) {
            log.error("== DubboProvider context start error:", e);
            e.printStackTrace();
        }
        synchronized (DubboProvider.class) {
            while (true) {
                try {
                    DubboProvider.class.wait();
                } catch (InterruptedException e) {
                    log.error("== synchronized error:", e);
                }
            }
        }
    }
}
