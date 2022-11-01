package com.damian.bodzioch.puzzle.combat.controller;

import com.damian.bodzioch.puzzle.combat.session.SessionObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogInController {
    private final String LOG_IN_PATH = "/log/in";
    public static final String LOG_IN_HTML = "log_in.html";
    @Autowired
    SessionObject sessionObject;

    @RequestMapping(value = LOG_IN_PATH, method = RequestMethod.GET)
    public String logIn() {
        return LOG_IN_HTML;
    }
}
