#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.api;

import ${package}.dto.OrderDTO;
import ${package}.request.CancelOrderRequest;
import ${package}.request.ModifyOrderRequest;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

/**
 * 订单接口
 *
 * @author infra
 */
public interface OrderService {

    /**
     * 查询订单信息
     *
     * @param orderId 请求参数
     * @return 订单信息
     */
    @ApiOperation(value = "查询订单信息")
    @GetMapping("/order/{orderId}")
    OrderDTO getById(@PathVariable("orderId") String orderId);

    /**
     * 取消订单
     *
     * @param orderId 订单id
     * @param request 请求参数
     */
    @ApiOperation(value = "取消订单")
    @PutMapping("/order/{orderId}/cancel")
    void cancel(@PathVariable("orderId") String orderId, @RequestBody CancelOrderRequest request);

    /**
     * 批量获取订单信息
     *
     * @param orderIds 订单id, 如：1,2,3
     * @return list
     */
    @ApiOperation(value = "批量获取订单信息")
    @GetMapping("/orders")
    List<OrderDTO> listByIds(@RequestParam("orderIds") String orderIds);

    /**
     * 分页查询订单信息
     *
     * @param page 当前页码
     * @param size 么每页大小
     * @return list
     */
    @ApiOperation(value = "分页获取订单信息")
    @GetMapping("/orders/filter")
    List<OrderDTO> listByPage(@RequestParam("page") Integer page, @RequestParam("size") Integer size);

    /**
     * 更新订单状态
     *
     * @param orderId 订单id
     * @param request 修改订单请求
     */
    @ApiOperation("修改订单状态")
    @PutMapping("/order/{orderId}")
    void updateById(@PathVariable("orderId") Integer orderId,
                    @RequestBody ModifyOrderRequest request);

}
