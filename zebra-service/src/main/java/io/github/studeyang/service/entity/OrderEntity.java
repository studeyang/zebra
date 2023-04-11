package io.github.studeyang.service.entity;

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