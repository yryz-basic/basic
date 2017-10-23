package com.yryz.basic.modules.email.dto;

import com.yryz.basic.modules.email.entity.EmailSend;

public class EmailSendDto extends EmailSend {

    /*
    * 分页-当前第几页
    */
    private Integer pageNo = 1;

    /*
     * 分页-每页显示记录数量
     */
    private Integer pageSize = 10;

    private String accountSearch;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getAccountSearch() {
        return accountSearch;
    }

    public void setAccountSearch(String accountSearch) {
        this.accountSearch = accountSearch;
    }
}
