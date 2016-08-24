package com.ricky.codelab.jersey.resource;

import com.ricky.codelab.jersey.domain.Order;
import com.ricky.codelab.jersey.domain.ServiceResult;
import com.ricky.codelab.jersey.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-07-21 10:25
 */
@Component
@Path("/order")
public class OrderResource {

    @Autowired
    private IOrderService orderService;

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<Order> getOrderList(){

        return orderService.getOrderList();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Order getOrderById(@PathParam("id") Long id) {

        return orderService.findOrderById(id);
//        return jsonpcallback+"( {\"id\":\""+orderService.findOrderById(id)+"\"})";
    }

    @PUT
    @Path("{id}")
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    public ServiceResult<String> putOrderById(@PathParam("id") Long id, Order order){

        Order orderById = orderService.findOrderById(id);

        ServiceResult<String> result = new ServiceResult<String>();
        result.setCode(0);
        if (orderById == null) {
            long userId = orderService.insert(order);
            result.setMsg("A new order has been created");
        } else {
            orderService.update(order);
            result.setMsg("The order you specified has been fully updated");
        }
        result.setData(String.valueOf(id));

        return result;
    }

    @DELETE
    @Produces({ MediaType.APPLICATION_JSON })
    public ServiceResult<String> deleteOrders() {

        long update = orderService.delete();
        ServiceResult<String> result = new ServiceResult<String>();
        result.setCode(0);
        result.setMsg("All users have been successfully removed");
        result.setData(String.valueOf(update));

        return result;
    }

    @DELETE
    @Path("{id}")
    @Produces({ MediaType.APPLICATION_JSON })
    public ServiceResult<String> deleteOrderById(@PathParam("id") Long id) {

        int update = orderService.deleteOrderById(id);
        ServiceResult<String> result = new ServiceResult<String>();
        result.setCode(0);
        result.setMsg("Oder successfully removed from database");
        result.setData(String.valueOf(update));

        return result;
    }
}
