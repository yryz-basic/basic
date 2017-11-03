package com.yryz.basic.modules.id.api;


import com.yryz.basic.common.entity.PageList;
import com.yryz.basic.modules.id.entity.CodeModel;
import com.yryz.basic.modules.id.entity.CodeModelDto;
import com.yryz.basic.modules.id.entity.IDRequest;
import com.yryz.basic.modules.id.entity.IDResponse;

/**
 * @author zhangkun
 * @version 1.0
 * @date 2017/9/18
 * @description
 */
public interface CodeAPI {

    /**
     * 发号器配置列表
     *
     * @return
     */
    PageList<CodeModel> list(CodeModelDto codeModelDto);

    /**
     * 增加业务类型，指定发号的宽度
     * eg: type="qshop_order", codeLength=8,
     * 给qshop_order发起始宽度为8的号码,后期发号递增
     *
     *
     * @throws
     */
    IDResponse addType(IDRequest request);
}
