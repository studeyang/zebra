#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.infrastructure.config;

import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

/**
 * @author infra
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({Exception.class})
    private ResponseEntity<Object> exceptionHandler(Exception exception) {

        Map<String, Object> result = Maps.newHashMap();
        result.put("status", 500);
        result.put("message", "");
        result.put("exception", exception.getClass().getName());
        return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);

    }

}
