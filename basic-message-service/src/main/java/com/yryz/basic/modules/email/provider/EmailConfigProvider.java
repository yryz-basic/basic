package com.yryz.basic.modules.email.provider;

import com.yryz.basic.common.entity.PageList;
import com.yryz.basic.modules.email.api.EmailConfigApi;
import com.yryz.basic.modules.email.dto.EmailConfigDto;
import com.yryz.basic.modules.email.entity.EmailConfig;
import com.yryz.basic.modules.email.manager.EmailConfigManager;
import com.yryz.basic.modules.email.vo.EmailConfigVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class EmailConfigProvider implements EmailConfigApi {

    @Autowired
    EmailConfigManager emailConfigManager;

    /**
     * 获取邮件配置详情
     * @param   id
     * @return
     * */
    public EmailConfigVo detail(Long id) {
        return emailConfigManager.detail(id);
    }

    /**
     * 获取邮件配置列表
     * @param   emailConfigDto
     * @return
     * */
    public PageList<EmailConfigVo> list(EmailConfigDto emailConfigDto) {
        return emailConfigManager.list(emailConfigDto);
    }

    /**
     * 判断emailCode是否存在
     * @param   emailCode
     * @return
     * */
    public Boolean emailCodeExist(String emailCode) {
        EmailConfigDto emailConfigDto = new EmailConfigDto();
        emailConfigDto.setEmailCode(emailCode);
        List<EmailConfigVo> list = emailConfigManager.emailConfigList(emailConfigDto);
        return CollectionUtils.isEmpty(list) ? true : false;
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
