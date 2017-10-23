package com.yryz.basic.modules.email.api;

import com.yryz.basic.common.entity.PageList;
import com.yryz.basic.modules.email.dto.EmailConfigDto;
import com.yryz.basic.modules.email.entity.EmailConfig;
import com.yryz.basic.modules.email.vo.EmailConfigVo;

public interface EmailConfigApi {

    /**
     * 获取邮件配置详情
     * @param   id
     * @return
     * */
    EmailConfigVo detail(Long id);

    /**
     * 获取邮件配置列表
     * @param   emailConfigDto
     * @return
     * */
    PageList<EmailConfigVo> list(EmailConfigDto emailConfigDto);

    /**
     * 判断emailCode是否存在
     * @param   emailCode
     * @return
     * */
    Boolean emailCodeExist(String emailCode);

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
