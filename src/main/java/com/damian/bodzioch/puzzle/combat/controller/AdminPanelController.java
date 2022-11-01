package com.damian.bodzioch.puzzle.combat.controller;

import com.damian.bodzioch.puzzle.combat.session.SessionObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminPanelController {
    private final String ADMIN_PATH = "/admin";
    private final String PANEL_PATH = "/panel";
    private final String ADMIN_PANEL_HTML = "admin_panel.html";

    @Autowired
    SessionObject sessionObject;

    @RequestMapping(value = ADMIN_PATH + PANEL_PATH, method = RequestMethod.GET)
    public String adminPanel() {
        if (!sessionObject.isLogged()) {
            return LogInController.LOG_IN_HTML;
        }
        return ADMIN_PANEL_HTML;
    }
}
