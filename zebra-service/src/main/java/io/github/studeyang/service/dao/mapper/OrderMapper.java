package io.github.studeyang.service.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.studeyang.service.entity.OrderEntity;

/**
 * @author infra
 */
public interface OrderMapper extends BaseMapper<OrderEntity> {

    /**
     * 根据订单 id 查询订单信息
     *
     * @param orderId 订单 id
     * @return 订单数据
     */
    OrderEntity selectById(Integer orderId);

    /**
     * 根据订单 id 修改订单状态
     *
     * @param orderEntity 订单实体类
     */
    void updateByIdUseMybatis(OrderEntity orderEntity);
}