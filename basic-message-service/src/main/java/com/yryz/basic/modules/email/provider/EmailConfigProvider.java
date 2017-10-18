package com.yryz.basic.modules.email.provider;

import com.yryz.basic.modules.email.EmailConfig;
import com.yryz.basic.modules.email.api.EmailConfigApi;
import com.yryz.basic.modules.email.manager.EmailConfigManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailConfigProvider implements EmailConfigApi {

    @Autowired
    EmailConfigManager emailConfigManager;

    /**
     * 获取邮件配置详情
     * @param   id
     * @return
     * */
    public EmailConfig detail(Long id) {
        return emailConfigManager.detail(id);
    }

    /**
     * 新增邮件配置信息
     * @param   emailConfig
     * */
    public void insert(EmailConfig emailConfig) {
        emailConfigManager.insert(emailConfig);
    }

    /**
     * 新增邮件配置信息
     * @param   emailConfig
     * @return
     * */
    public int update(EmailConfig emailConfig) {
        return emailConfigManager.update(emailConfig);
    }

}
