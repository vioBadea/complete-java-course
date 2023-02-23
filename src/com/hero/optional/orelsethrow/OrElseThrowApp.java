package com.hero.optional.orelsethrow;

import com.hero.optional.ifpresent.User;
import com.hero.optional.ifpresent.UserRepository;

import java.util.ArrayList;

public class OrElseThrowApp {

    public static void main(String[] args) {
        ArrayList<User> users = UserRepository.getUsers();
        users.forEach(EmailServiceOrElseThrow::sendPromotion);
    }
}
