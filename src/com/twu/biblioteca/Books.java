package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<Book> list;

    public Books(List<Book> list) {
        this.list = list;
    }

    public void printBooksList() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
