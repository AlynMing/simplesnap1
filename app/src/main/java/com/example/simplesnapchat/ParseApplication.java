package com.example.simplesnapchat;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("tsR5zbdPxAxg15H7HMZv7aUv1VI22Y45vB0FZbWV")
                .clientKey("eReAJHjDGwcwV1MhEIGj6rqtbgoshiZ74zU1a8lv")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
