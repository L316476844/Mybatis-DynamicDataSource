package org.jon.lv.jdbc.strategy;


import org.jon.lv.jdbc.enums.DynamicDataSourceGlobal;

import javax.sql.DataSource;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description: 轮询策略---随机轮询
 * Author lv bin
 * @date 2016/11/4 17:50
 * version V1.0.0
 * 常用的轮询策略算法：http://www.open-open.com/code/view/1457074772062
 */
public class RoundRobinStrategy extends AbstractStrategy {

    private Byte[] lock = new Byte[0];

    @Override
    protected String doSelect(List<DataSource> slaves, DataSource master) {
        int _index = 0;
        synchronized (lock) {
            Random random = new Random();
            _index = random.nextInt(slaves.size());
        }

        return DynamicDataSourceGlobal.READ.name() + "_" + _index;
    }
}