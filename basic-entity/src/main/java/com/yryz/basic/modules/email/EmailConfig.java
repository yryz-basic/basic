package com.yryz.basic.modules.email;

import com.yryz.basic.common.entity.GenericEntity;

public class EmailConfig extends GenericEntity {

    private String transCode;

    private String host;

    private String auth;

    private String receiverlist;

    private String subject;

    private String typeModel;

    private String emailModel;

    private Byte emailFlag;

    private Byte delFlag;

    private String sendInfo;

    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode == null ? null : transCode.trim();
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth == null ? null : auth.trim();
    }

    public String getReceiverlist() {
        return receiverlist;
    }

    public void setReceiverlist(String receiverlist) {
        this.receiverlist = receiverlist == null ? null : receiverlist.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getTypeModel() {
        return typeModel;
    }

    public void setTypeModel(String typeModel) {
        this.typeModel = typeModel == null ? null : typeModel.trim();
    }

    public String getEmailModel() {
        return emailModel;
    }

    public void setEmailModel(String emailModel) {
        this.emailModel = emailModel == null ? null : emailModel.trim();
    }

    public Byte getEmailFlag() {
        return emailFlag;
    }

    public void setEmailFlag(Byte emailFlag) {
        this.emailFlag = emailFlag;
    }

    public Byte getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }

    public String getSendInfo() {
        return sendInfo;
    }

    public void setSendInfo(String sendInfo) {
        this.sendInfo = sendInfo == null ? null : sendInfo.trim();
    }
}