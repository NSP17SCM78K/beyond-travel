package com.travelpro.entities;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by neo on 25-02-2017.
 */

@IgnoreExtraProperties
public class User {

    public String username;
    public String email;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

}