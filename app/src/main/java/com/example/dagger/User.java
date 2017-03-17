package com.example.dagger;

import javax.inject.Inject;

public class User {
    private Profile profile;

    @Inject
    public User(Profile profile) {
        this.profile = profile;
    }

    public Profile getProfile() {
        return profile;
    }
}
