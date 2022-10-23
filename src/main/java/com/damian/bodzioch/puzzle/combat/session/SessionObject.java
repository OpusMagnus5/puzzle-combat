package com.damian.bodzioch.puzzle.combat.session;

import com.damian.bodzioch.puzzle.combat.model.User;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class SessionObject {
    private User user = null;

    public SessionObject() {
    }

    public SessionObject(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public SessionObject setUser(User user) {
        this.user = user;
        return this;
    }

    public boolean isLogged(){
        return this.user != null;
    }
}
