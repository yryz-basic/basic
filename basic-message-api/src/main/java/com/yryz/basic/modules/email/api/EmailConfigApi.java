package com.yryz.basic.modules.email.api;

import com.yryz.basic.modules.email.EmailConfig;

public interface EmailConfigApi {

    /**
     * 获取邮件配置详情
     * @param   id
     * @return
     * */
    EmailConfig detail(Long id);

    /**
     * 新增邮件配置信息
     * @param   emailConfig
     * */
    void insert(EmailConfig emailConfig);

    /**
     * 新增邮件配置信息
     * @param   emailConfig
     * @return
     * */
    int update(EmailConfig emailConfig);

}
