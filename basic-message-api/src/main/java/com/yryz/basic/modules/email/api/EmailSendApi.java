package com.yryz.basic.modules.email.api;

import com.yryz.basic.common.entity.PageList;
import com.yryz.basic.modules.email.dto.EmailSendDto;
import com.yryz.basic.modules.email.entity.EmailSend;
import com.yryz.basic.modules.email.vo.EmailSendVo;

public interface EmailSendApi {

    EmailSendVo detail(Long id);

    PageList<EmailSendVo> list(EmailSendDto record);

    Boolean accountExist(String account);

    void insert(EmailSend record);

    int update(EmailSend record);

    void delete(Long id);

}
