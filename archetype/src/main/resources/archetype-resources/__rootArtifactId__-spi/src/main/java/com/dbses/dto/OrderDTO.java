#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 订单信息响应类
 *
 * @author infra
 */
@Data
@Accessors(chain = true)
@ApiModel(description = "订单数据")
public class OrderDTO {

    /**
     * 订单编号
     */
    @ApiModelProperty("订单编号")
    private String orderId;

    /**
     * 订单状态
     */
    @ApiModelProperty("订单状态")
    private String orderStatus;

    /**
     * 订单创建时间
     */
    @ApiModelProperty("订单创建时间")
    private Date orderCreateDate;

}
