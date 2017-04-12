package org.jon.lv.jdbc.dataSource;


import org.jon.lv.jdbc.enums.DynamicDataSourceGlobal;

/**
 * @Description: 动态数据源持有
 * Author lv bin
 * @date 2016/11/4 10:17
 * version V1.0.0
 */
public final class DynamicDataSourceHolder {

    private static final ThreadLocal<DynamicDataSourceGlobal> holder = new ThreadLocal<DynamicDataSourceGlobal>();

    private DynamicDataSourceHolder() {
        //
    }

    public static void putDataSource(DynamicDataSourceGlobal dataSource){
        holder.set(dataSource);
    }

    public static DynamicDataSourceGlobal getDataSource(){
        return holder.get();
    }

    public static void clearDataSource() {
        holder.remove();
    }

}
