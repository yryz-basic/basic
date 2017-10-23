package com.yryz.basic.modules.email.service;

import com.github.pagehelper.PageHelper;
import com.yryz.basic.common.entity.PageList;
import com.yryz.basic.modules.email.dao.EmailSendDao;
import com.yryz.basic.modules.email.dto.EmailSendDto;
import com.yryz.basic.modules.email.entity.EmailSend;
import com.yryz.basic.modules.email.vo.EmailSendVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailSendService {

    @Autowired
    EmailSendDao emailSendDao;

    public EmailSendVo detail(Long id) {
        return emailSendDao.selectByPrimaryKey(id);
    }

    public PageList<EmailSendVo> list(EmailSendDto record) {
        PageHelper.startPage(record.getPageNo(), record.getPageSize());
        return new PageList<EmailSendVo>(emailSendDao.selectByConditions(record));
    }

    public List<EmailSendVo> emailSendList(EmailSendDto record) {
        return emailSendDao.selectByConditions(record);
    }

    public void insert(EmailSend record) {
        emailSendDao.insert(record);
    }

    public int update(EmailSend record) {
        return emailSendDao.update(record);
    }

    public void delete(Long id) {
        emailSendDao.delete(id);
    }

}
