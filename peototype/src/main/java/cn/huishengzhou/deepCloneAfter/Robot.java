package cn.huishengzhou.deepCloneAfter;

import java.io.Serializable;

public class Robot implements Cloneable, Serializable {
    private Info info;

    public Robot() {
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public String getStr() {
        return info.getName();
    }

    public void setStr(String name) {
        info.setName(name);
    }

    @Override
    public Robot clone() throws CloneNotSupportedException {
        return (Robot) super.clone();
    }
}
