package com.yryz.basic.modules.email.manager;


import com.yryz.basic.modules.email.EmailConfig;
import com.yryz.basic.modules.email.service.EmailConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmailConfigManager {

    @Autowired
    EmailConfigService emailConfigService;

    /**
     * 获取邮件配置详情
     * @param   id
     * @return
     * */
    public EmailConfig detail(Long id) {
        return emailConfigService.detail(id);
    }

    /**
     * 新增邮件配置信息
     * @param   emailConfig
     * */
    public void insert(EmailConfig emailConfig) {
        emailConfigService.insert(emailConfig);
    }

    /**
     * 新增邮件配置信息
     * @param   emailConfig
     * @return
     * */
    public int update(EmailConfig emailConfig) {
        return emailConfigService.update(emailConfig);
    }

}
