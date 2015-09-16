package com.twu.biblioteca;

import java.util.ArrayList;

public class UserAccounts {

    private ArrayList users = new ArrayList<User>() {{
        add(new User("B09-1893", "B091893", "Admin"));
        add(new User("B09-1894", "B091894", "User"));
        add(new User("B09-1895", "B091895", "User"));
    }};

    public Menu compare(String loginId, String password) {
        Menu menu = null;
        for (int i = 0; i < users.size(); i++) {
            User thisUser = (User) users.get(i);
            if (thisUser.compare(loginId, password)) {
                if (thisUser.getRole().equals("User")) {
                    menu = new UserMenu();
                    return menu;
                }
                menu = new AdminMenu();
                return menu;
            }
        }
        menu = new GuestMenu();
        return menu;
    }
}
