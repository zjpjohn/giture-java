package com.ricky.codelab.jersey.service;

import com.ricky.codelab.jersey.domain.Order;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-07-21 10:30
 */
public interface IOrderService {


    List<Order> getOrderList();

    Order findOrderById(Long id);

    long insert(Order order);

    int update(Order order);

    long delete();

    int deleteOrderById(Long id);
}
