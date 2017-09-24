package com.shanahan.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/cas")
public class CASController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(
            @CookieValue(value = "ssosession-id") String ssoSessionId,
            @RequestParam(value = "service", required = false) String service) {

        if (true) {
            return "redirect:/";
        }
        else {
            return "redirect:/";
        }
    }

    @RequestMapping(value = "/serviceValidate", method = RequestMethod.GET)
    public String ticketValidate(
            @RequestParam("service") String service,
            @RequestParam("ticket") String ticket) {

        return "";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(
            @CookieValue("ssosession-d") String ssoSessionId,
            @RequestParam(value = "service", required = false) String service) {

        return "";
    }

}
