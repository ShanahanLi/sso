package com.shanahan.sso.session;

public class SingleUserSession implements ISession {

    private String sessionId;
    private long expireAt;
    private String userId;

    public String output () {
        return "";
    }

    public String getSessionId() {
        return "";
    }

    public long getExpireAt() {
        return 0;
    }

    public boolean isValid() {
        return false;
    }
}
