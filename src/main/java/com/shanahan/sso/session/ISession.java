package com.shanahan.sso.session;

public interface ISession {

    public String output ();
    public String getSessionId();
    public long getExpireAt();
    public boolean isValid();
}
