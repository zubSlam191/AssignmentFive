package com.email.domain;

import java.util.Date;

/**
 * Created by student on 2016/04/04.
 */
public class Contact {
    String address;
    String nickname;
    Date lastSeen;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }
}
