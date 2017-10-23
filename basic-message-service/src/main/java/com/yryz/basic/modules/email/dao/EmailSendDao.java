package com.yryz.basic.modules.email.dao;

import com.yryz.basic.modules.email.dto.EmailSendDto;
import com.yryz.basic.modules.email.entity.EmailSend;
import com.yryz.basic.modules.email.vo.EmailSendVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmailSendDao {

    EmailSendVo selectByPrimaryKey(Long id);

    List<EmailSendVo> selectByConditions(EmailSendDto record);

    void insert(EmailSend record);

    int update(EmailSend record);

    void delete(Long id);

}