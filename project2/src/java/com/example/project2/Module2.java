package com.example.project2;

import com.google.inject.AbstractModule;

public class Module2 extends AbstractModule {

    @Override
    protected void configure() {
        bindInterceptor(null, null);
    }
}
