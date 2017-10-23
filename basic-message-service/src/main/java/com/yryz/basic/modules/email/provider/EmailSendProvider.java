package com.yryz.basic.modules.email.provider;

import com.yryz.basic.common.entity.PageList;
import com.yryz.basic.modules.email.api.EmailSendApi;
import com.yryz.basic.modules.email.dto.EmailSendDto;
import com.yryz.basic.modules.email.entity.EmailSend;
import com.yryz.basic.modules.email.manager.EmailSendManager;
import com.yryz.basic.modules.email.vo.EmailSendVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class EmailSendProvider implements EmailSendApi {

    @Autowired
    EmailSendManager emailSendManager;

    public EmailSendVo detail(Long id) {
        return emailSendManager.detail(id);
    }

    public PageList<EmailSendVo> list(EmailSendDto record) {
        return emailSendManager.list(record);
    }

    public Boolean accountExist(String account) {
        EmailSendDto record = new EmailSendDto();
        record.setAccount(account);
        List<EmailSendVo> emailSendList = emailSendManager.emailSendList(record);
        return CollectionUtils.isEmpty(emailSendList) ? true : false;
    }

    public void insert(EmailSend record) {
        emailSendManager.insert(record);
    }

    public int update(EmailSend record) {
        return emailSendManager.update(record);
    }

    public void delete(Long id) {
        emailSendManager.delete(id);
    }

}
