package com.yryz.basic.modules.email.entity;

import com.yryz.basic.common.entity.GenericEntity;

public class EmailConfig extends GenericEntity {

    private String emailCode;

    private String receiverList;

    private String subject;

    private String typeModel;

    private String emailModel;

    private Byte emailFlag;

    private Byte delFlag;

    private String sendInfo;

    public String getEmailCode() {
        return emailCode;
    }

    public void setEmailCode(String emailCode) {
        this.emailCode = emailCode;
    }

    public String getReceiverList() {
        return receiverList;
    }

    public void setReceiverList(String receiverList) {
        this.receiverList = receiverList;
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