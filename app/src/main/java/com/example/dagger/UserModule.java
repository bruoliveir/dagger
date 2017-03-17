package com.example.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class UserModule {
    @Provides
    @Singleton
    User provideUser() {
        return new User(new PremiumProfile());
    }
}
