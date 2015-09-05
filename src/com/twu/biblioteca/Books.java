package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<Book> list;

    public Books(List<Book> list) {
        this.list = list;
    }

    public void printBooks() {
        String header = "Book Name\tAuthour Name\tYear Published";
        System.out.println(header);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
