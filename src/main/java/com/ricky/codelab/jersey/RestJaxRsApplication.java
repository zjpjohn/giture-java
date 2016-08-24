package com.ricky.codelab.jersey;

import com.ricky.codelab.jersey.resource.OrderResource;
import com.ricky.codelab.jersey.resource.UserResource;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-07-20 14:15
 */
public class RestJaxRsApplication extends ResourceConfig {
    private static final Logger LOGGER = Logger.getLogger("RestJaxRsApplication");

    /**
     * Register JAX-RS application components.
     */
    public RestJaxRsApplication() {
        LOGGER.log(Level.ALL,"初始化RESTful----jersey");
        System.out.println("初始化RESTful----jersey");
        // register application resources
        this.register(UserResource.class);
        this.register(OrderResource.class);

        // register filters
        register(RequestContextFilter.class);
        //register(LoggingResponseFilter.class);
        //register(CORSResponseFilter.class);

        // register exception mappers
        //register(GenericExceptionMapper.class);
        //register(AppExceptionMapper.class);
        //register(NotFoundExceptionMapper.class);

        // register features
        register(JacksonFeature.class);
        //register(MultiPartFeature.class);
    }
}
