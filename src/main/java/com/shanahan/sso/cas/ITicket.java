package com.shanahan.sso.cas;
import java.security.SecureRandom;

public interface ITicket {

    public String output();

    public boolean isExpired();
}
