package com.shanahan.sso.cas;

public class ServiceTicket implements ITicket {
    private String type;
    private String random;

    public String output() {
        return "";
    }

    public boolean isExpired() {
        return false;
    }
}

