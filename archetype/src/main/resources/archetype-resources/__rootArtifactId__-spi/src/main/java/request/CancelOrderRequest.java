#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.request;

import lombok.Data;

/**
 * @author infra
 */
@Data
public class CancelOrderRequest {

    private String orderId;

}
