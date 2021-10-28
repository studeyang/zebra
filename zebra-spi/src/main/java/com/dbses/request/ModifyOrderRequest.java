package com.dbses.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author lcjing
 * @date 2021/5/27
 */
@Data
@Accessors(chain = true)
@ApiModel("订单修改请求")
public class ModifyOrderRequest {

    @ApiModelProperty("订单状态")
    private Integer orderStatus;

    @ApiModelProperty("修改人")
    private String lastUpdatedBy;

    // ... 其它字段

}
