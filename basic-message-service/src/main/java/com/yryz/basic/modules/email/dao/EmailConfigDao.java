package com.yryz.basic.modules.email.dao;

import com.yryz.basic.modules.email.EmailConfig;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailConfigDao {

    EmailConfig selectByPrimaryKey(Long id);

    int insert(EmailConfig record);

    int updateByPrimaryKeySelective(EmailConfig record);

}