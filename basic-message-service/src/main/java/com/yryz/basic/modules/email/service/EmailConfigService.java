package com.yryz.basic.modules.email.service;

import com.yryz.basic.modules.email.dao.EmailConfigDao;
import com.yryz.basic.modules.email.EmailConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailConfigService {

    @Autowired
    EmailConfigDao emailConfigDao;

    /**
     * 获取邮件配置详情
     * @param   id
     * @return
     * */
    public EmailConfig detail(Long id) {
        return emailConfigDao.selectByPrimaryKey(id);
    }

    /**
     * 新增邮件配置信息
     * @param   emailConfig
     * */
    public void insert(EmailConfig emailConfig) {
        emailConfigDao.insert(emailConfig);
    }

    /**
     * 新增邮件配置信息
     * @param   emailConfig
     * @return
     * */
    public int update(EmailConfig emailConfig) {
        return emailConfigDao.updateByPrimaryKeySelective(emailConfig);
    }

}
