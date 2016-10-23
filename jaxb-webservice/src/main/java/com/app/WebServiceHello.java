package com.app;

import javax.jws.WebMethod;

/**
 * Created by artur on 23/10/16.
 */
@javax.jws.WebService
public interface WebServiceHello {
    @WebMethod
    void sayHello();
}
