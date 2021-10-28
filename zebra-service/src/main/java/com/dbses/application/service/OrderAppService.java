package com.dbses.application.service;

import com.dbses.dto.OrderDTO;
import com.dbses.request.ModifyOrderRequest;
import com.dbses.service.biz.OrderBizService;
import com.dbses.service.entity.OrderEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 订单详情业务逻辑类
 *
 * @author infra
 */
@Slf4j
@Service
public class OrderAppService {

    @Autowired
    private OrderBizService orderBizService;

    /**
     * 查询订单信息
     *
     * @return 订单信息
     */
    public OrderDTO getOrderDetails(String orderId) {
        // 从数据库查订单信息
        OrderEntity order = orderBizService.selectById(orderId);
        return new OrderDTO()
                .setOrderCreateDate(order.getOrderCreateDate())
                .setOrderId(order.getId() + "")
                .setOrderStatus(order.getOrderStatus() + "");
    }

    /**
     * 批量查询订单信息
     *
     * @param orderIds 订单 ids
     * @return list
     */
    public List<OrderDTO> listByIds(String orderIds) {
        // 获取订单 id 集合
        List<String> orderIdList = Stream.of(orderIds.split(",")).collect(Collectors.toList());
        // 从数据库查询订单信息
        List<OrderEntity> entityList = orderBizService.selectByIds(orderIdList);
        return entityList.stream().map(order -> new OrderDTO()
                .setOrderCreateDate(order.getOrderCreateDate())
                .setOrderId(order.getId() + "")
                .setOrderStatus(order.getOrderStatus() + "")).collect(Collectors.toList());
    }

    /**
     * 分页查询订单信息
     *
     * @param page 当前页码
     * @param size 每页条数
     * @return list
     */
    public List<OrderDTO> listByPage(Integer page, Integer size) {
        // 从数据库查询订单信息
        List<OrderEntity> entityList = orderBizService.selectByPage(page, size);
        return entityList.stream().map(order -> new OrderDTO()
                .setOrderCreateDate(order.getOrderCreateDate())
                .setOrderId(order.getId() + "")
                .setOrderStatus(order.getOrderStatus() + "")).collect(Collectors.toList());
    }

    /**
     * 更新订单状态
     *
     * @param orderId 订单 id
     * @param request 修改订单请求
     */
    public void updateById(Integer orderId, ModifyOrderRequest request) {
        OrderEntity orderEntity = new OrderEntity()
                .setId(orderId)
                .setOrderStatus(request.getOrderStatus());
        orderBizService.updateById(orderEntity);
    }

}
