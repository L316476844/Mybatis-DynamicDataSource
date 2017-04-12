package org.jon.lv.manager;

import org.jon.lv.dao.RealtorAdminMapper;
import org.jon.lv.domain.RealtorAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Package com.shfc.manager.RealtorAdminManager
 * @Description: TODO
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * Author lv bin
 * @date 2016/11/4 13:58
 * version V1.0.0
 */
@Service
public class RealtorAdminManager {

    @Autowired
    private RealtorAdminMapper realtorAdminMapper;


    public void save(RealtorAdmin admin){
        realtorAdminMapper.insert(admin);
    }

    @Transactional
    public void add(RealtorAdmin admin){
        realtorAdminMapper.insert(admin);
    }

    public RealtorAdmin get(Long id){
        return realtorAdminMapper.selectByPrimaryKey(id);
    }
}
