package com.liufengkj.pojo;

public class OndutyMan {
    private Integer omId;

    private String omName;

    private String omMobilephone;

    private String omShortphone;

    private String omUserimg;

    public Integer getOmId() {
        return omId;
    }

    public void setOmId(Integer omId) {
        this.omId = omId;
    }

    public String getOmName() {
        return omName;
    }

    public void setOmName(String omName) {
        this.omName = omName == null ? null : omName.trim();
    }

    public String getOmMobilephone() {
        return omMobilephone;
    }

    public void setOmMobilephone(String omMobilephone) {
        this.omMobilephone = omMobilephone == null ? null : omMobilephone.trim();
    }

    public String getOmShortphone() {
        return omShortphone;
    }

    public void setOmShortphone(String omShortphone) {
        this.omShortphone = omShortphone == null ? null : omShortphone.trim();
    }

    public String getOmUserimg() {
        return omUserimg;
    }

    public void setOmUserimg(String omUserimg) {
        this.omUserimg = omUserimg == null ? null : omUserimg.trim();
    }
}