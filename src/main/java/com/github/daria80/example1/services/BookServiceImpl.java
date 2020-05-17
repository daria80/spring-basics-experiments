package com.github.daria80.example1.services;

import com.github.daria80.example1.User;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {

    private List<User> places = new ArrayList<>();
    private int count = 0;
    private int maxCount = 2;

    @Override
    public boolean book(User user) {
        if (count < maxCount) {
            places.add(user);
            count++;
            return true;
        }
        return false;
    }

    @Override
    public void checkPlace(int id) {
        if (id > 0 && id < maxCount) {
            if (count < id)
                System.out.println("Свободно");
            else if (places.get(id) != null) {
                System.out.println("Занято");
            }
//            if(count < id)
//                return false;
//            return places.get(id) != null;

        }
//        return false;
        else
        System.out.println("Место не найдено");
    }
}
