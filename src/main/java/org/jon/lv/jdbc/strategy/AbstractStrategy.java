package org.jon.lv.jdbc.strategy;


import org.jon.lv.jdbc.enums.DynamicDataSourceGlobal;

import javax.sql.DataSource;
/**
 * @Package com.shfc.jdbc.strategy.AbstractStrategy
 * @Description: 负载均衡策略
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * Author lv bin
 * @date 2016/11/4 17:46
 * version V1.0.0
 */
public abstract class AbstractStrategy implements Strategy {

    public String select(java.util.List<DataSource> slaves, DataSource master) {
        if (slaves == null || slaves.isEmpty())
            return DynamicDataSourceGlobal.WRITE.name();
        if (slaves.size() == 1)
            return DynamicDataSourceGlobal.READ.name() + "_0";
        return doSelect(slaves,master);
    }

    /** 
      * @Description: 读的数据源为多个的时候
      * @Title doSelect
      * @Author  lv bin
      * @Date 2016/11/7 9:29
      * @param  slaves, master
      * @return String
      * @throws 
      */
    protected abstract String doSelect(java.util.List<DataSource> slaves, DataSource master);
}