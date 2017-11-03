package com.yryz.basic.modules.id.service;


import com.yryz.basic.common.entity.PageList;
import com.yryz.basic.modules.id.entity.CodeModel;
import com.yryz.basic.modules.id.entity.CodeModelDto;
import com.yryz.basic.modules.id.entity.IDRequest;
import com.yryz.basic.modules.id.entity.IDResponse;

/**
 * @author zhangkun
 * @version 1.0
 * @date 2017/8/14
 * @description
 */
public interface IdService {
    /**
     * 根据type获取id
     * @param type
     * @return
     */
    Long getId(String type);

    /**
     * 返回String类型Id
     * @return
     */
    String getId();

    IDResponse addType(IDRequest request);

    PageList<CodeModel> list(CodeModelDto dto);
}
