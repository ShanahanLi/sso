package com.shanahan.sso.session;

public class DomainUserSession implements ISession {

    private String sessionId;
    private long expireAt;
    private String domainId;
    private String userId;


    public String output () {
        return "";
    }

    public String getSessionId() {
        return"";
    }
    public long getExpireAt() {
        return 1;
    }

    public boolean isValid() {
        return false;
    }
}
