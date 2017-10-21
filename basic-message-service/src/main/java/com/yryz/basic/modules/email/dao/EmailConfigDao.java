package com.yryz.basic.modules.email.dao;

import com.yryz.basic.modules.email.dto.EmailConfigDto;
import com.yryz.basic.modules.email.entity.EmailConfig;
import com.yryz.basic.modules.email.vo.EmailConfigVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmailConfigDao {

    EmailConfigVo selectByPrimaryKey(Long id);

    List<EmailConfigVo> selectByConditions(EmailConfigDto emailConfigDto);

    int insert(EmailConfig record);

    int updateByPrimaryKeySelective(EmailConfig record);

}