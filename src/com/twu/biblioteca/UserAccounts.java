package com.twu.biblioteca;

import java.util.ArrayList;

public class UserAccounts {

    private ArrayList users = new ArrayList<User>() {{
        add(new User("B09-1893", "B091893"));
        add(new User("B09-1894", "B091894"));
        add(new User("B09-1895", "B091895"));
    }};

    public boolean compare(String loginId, String password) {
        for (int i = 0; i < users.size(); i++) {
            User thisUser = (User) users.get(i);
            if (thisUser.compare(loginId, password))
                return true;
        }
        return false;
    }
}
