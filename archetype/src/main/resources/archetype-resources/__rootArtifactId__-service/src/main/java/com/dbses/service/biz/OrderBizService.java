#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.biz;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import ${package}.service.dao.mapper.OrderMapper;
import ${package}.service.entity.OrderEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单基础服务
 *
 * @author infra
 */
@Service
public class OrderBizService {

    @Resource
    private OrderMapper orderMapper;

    /**
     * 查询订单
     *
     * @param orderId 订单 id
     * @return 订单数据
     */
    public OrderEntity selectById(String orderId) {
        return orderMapper.selectById(Integer.parseInt(orderId));
    }

    /**
     * 通过订单 id 批量查询订单信息
     *
     * @param orderIdList 订单 id 集合
     * @return list
     */
    public List<OrderEntity> selectByIds(List<String> orderIdList) {
        return orderMapper.selectBatchIds(orderIdList);
    }

    /**
     * 分页查询 order_status 为 0 的订单信息
     *
     * @param page 当前页码
     * @param size 每页大小
     * @return list
     */
    public List<OrderEntity> selectByPage(Integer page, Integer size) {
        return orderMapper.selectPage(new Page<>(page, size),
                new QueryWrapper<OrderEntity>()
                        .eq("order_status", 0))
                .getRecords();
    }

    /**
     * 更新订单状态
     *
     * @param orderEntity 订单实体类
     */
    public void updateById(OrderEntity orderEntity) {
        // mybatis-plus 已经定义了 updateById 方法, 这里用方法命名使用 mybatis 更新
        orderMapper.updateByIdUseMybatis(orderEntity);
    }

}
