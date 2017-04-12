package org.jon.lv.dao;

import org.jon.lv.domain.RealtorAdmin;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtorAdminMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RealtorAdmin record);

    int insertSelective(RealtorAdmin record);

    RealtorAdmin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RealtorAdmin record);

    int updateByPrimaryKey(RealtorAdmin record);
}