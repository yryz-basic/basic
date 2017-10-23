package com.yryz.basic.modules.email.manager;

import com.yryz.basic.common.entity.PageList;
import com.yryz.basic.modules.email.dto.EmailSendDto;
import com.yryz.basic.modules.email.entity.EmailSend;
import com.yryz.basic.modules.email.service.EmailSendService;
import com.yryz.basic.modules.email.vo.EmailSendVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailSendManager {

    @Autowired
    EmailSendService emailSendService;

    public EmailSendVo detail(Long id) {
        return emailSendService.detail(id);
    }

    public PageList<EmailSendVo> list(EmailSendDto record) {
        return emailSendService.list(record);
    }

    public List<EmailSendVo> emailSendList(EmailSendDto record) {
        return emailSendService.emailSendList(record);
    }

    public void insert(EmailSend record) {
        emailSendService.insert(record);
    }

    public int update(EmailSend record) {
        return emailSendService.update(record);
    }

    public void delete(Long id) {
        emailSendService.delete(id);
    }
}
