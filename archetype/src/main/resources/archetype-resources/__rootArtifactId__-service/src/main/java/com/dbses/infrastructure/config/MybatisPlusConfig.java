#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.infrastructure.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.zaxxer.hikari.HikariDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Mybatis-Plus 配置类
 *
 * @author dbses
 */
@Configuration
@EnableTransactionManagement
@MapperScan("${package}.service.dao.mapper")
public class MybatisPlusConfig {
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    @Bean
    public PlatformTransactionManager defaultTransactionManager(HikariDataSource dataSource) {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(dataSource);
        transactionManager.setGlobalRollbackOnParticipationFailure(false);
        return transactionManager;
    }
}
