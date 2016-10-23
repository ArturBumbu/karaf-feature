package com.app;


import org.apache.log4j.Logger;

import javax.annotation.PostConstruct;
import javax.jws.WebService;

/**
 * Created by artur on 23/10/16.
 */
@WebService
public class WebServiceHelloImpl implements WebServiceHello {

       private static final Logger logger = Logger.getLogger(WebServiceHelloImpl.class);

       public WebServiceHelloImpl(){
           logger.info("WebServiceHelloImpl - constructor");
       }

        @PostConstruct
        public void test(){
            logger.info("PostConstruct - postconstruct method");
        }

        public void sayHello() {
            logger.info("sayHello");
        }

}
