package com.app.interceptors;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.log4j.Logger;

/**
 * Created by artur on 23/10/16.
 */
public class MyInterceptor extends AbstractPhaseInterceptor {
    private static final Logger logger = Logger.getLogger(MyInterceptor.class);

    public MyInterceptor(){
        super(Phase.PRE_INVOKE);
    }

    public MyInterceptor(String phase) {
        super(phase);
        logger.info("MyInterceptor - constructor");
    }

    @Override
    public void handleMessage(Message message) throws Fault {
        logger.info("MyInterceptor - handleMessage");
    }
}
