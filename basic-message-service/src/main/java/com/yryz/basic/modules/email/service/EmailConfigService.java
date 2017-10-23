package com.yryz.basic.modules.email.service;

import com.github.pagehelper.PageHelper;
import com.yryz.basic.common.entity.PageList;
import com.yryz.basic.modules.email.dao.EmailConfigDao;
import com.yryz.basic.modules.email.dto.EmailConfigDto;
import com.yryz.basic.modules.email.entity.EmailConfig;
import com.yryz.basic.modules.email.vo.EmailConfigVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailConfigService {

    @Autowired
    EmailConfigDao emailConfigDao;

    /**
     * 获取邮件配置详情
     * @param   id
     * @return
     * */
    public EmailConfigVo detail(Long id) {
        return emailConfigDao.selectByPrimaryKey(id);
    }

    /**
     * 获取邮件配置列表
     * @param   emailConfigDto
     * @return
     * */
    public PageList<EmailConfigVo> list(EmailConfigDto emailConfigDto) {
        PageHelper.startPage(emailConfigDto.getPageNo(), emailConfigDto.getPageSize());
        return new PageList<EmailConfigVo>(emailConfigDao.selectByConditions(emailConfigDto));
    }

    /**
     * 获取邮件配置列表（不分页）
     * @param   emailConfigDto
     * @return
     * */
    public List<EmailConfigVo> emailConfigList(EmailConfigDto emailConfigDto) {
        return emailConfigDao.selectByConditions(emailConfigDto);
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
