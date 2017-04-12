package org.jon.lv.jdbc.strategy;
import javax.sql.DataSource;

/**
 * @Description: 负载均衡策略
 * Author lv bin
 * @date 2016/11/4 17:48
 * version V1.0.0
 */
public interface Strategy {
    String select(java.util.List<DataSource> Slaves, DataSource master);
}

