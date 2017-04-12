package org.jon.lv.jdbc.strategy;
import javax.sql.DataSource;

/**
 * @Package com.shfc.jdbc.strategy.Strategy
 * @Description: 负载均衡策略
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * Author lv bin
 * @date 2016/11/4 17:48
 * version V1.0.0
 */
public interface Strategy {
    String select(java.util.List<DataSource> Slaves, DataSource master);
}

