#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.Date;

/**
 * 订单实体类
 *
 * @author infra
 */
@Accessors(chain = true)
@Data
@TableName(value = "tbl_order")
public class OrderEntity {

    private Integer id;

    private Integer orderStatus;

    private Date orderCreateDate;

}