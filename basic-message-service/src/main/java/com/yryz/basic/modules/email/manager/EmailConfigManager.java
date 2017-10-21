package com.yryz.basic.modules.email.manager;


import com.yryz.basic.common.entity.PageList;
import com.yryz.basic.modules.email.dto.EmailConfigDto;
import com.yryz.basic.modules.email.entity.EmailConfig;
import com.yryz.basic.modules.email.service.EmailConfigService;
import com.yryz.basic.modules.email.vo.EmailConfigVo;
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
    public EmailConfigVo detail(Long id) {
        return emailConfigService.detail(id);
    }

    /**
     * 获取邮件配置列表
     * @param   emailConfigDto
     * @return
     * */
    public PageList<EmailConfigVo> selectByConditions(EmailConfigDto emailConfigDto) {
        return emailConfigService.selectByConditions(emailConfigDto);
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
