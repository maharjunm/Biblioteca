package com.twu.biblioteca;

import java.util.ArrayList;

public class UserAccounts {

    private ArrayList users = new ArrayList<User>() {{
        add(new User("B09-1893", "B091893", "Admin", "Maharjun", "maharjun123@gmail.com", "8498984842"));
        add(new User("B09-1894", "B091894", "User", "Maharjun1", "maharjun123@gmail.com", "8498984842"));
        add(new User("B09-1895", "B091895", "User", "Maharjun2", "maharjun123@gmail.com", "8498984842"));
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

    public User user(String loginId, String password) {
        User user = null;
        for (int i = 0; i < users.size(); i++) {
            user = (User) users.get(i);
            if(user.compare(loginId,password))
                return user;
        }
        return user;
    }
}
