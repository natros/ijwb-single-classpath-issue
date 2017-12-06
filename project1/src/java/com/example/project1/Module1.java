package com.example.project1;

import com.google.inject.AbstractModule;

/**
 * This file will appear to be OK according to IntelliJ, but won't build with Bazel.
 */
public class Module1 extends AbstractModule {

    @Override
    protected void configure() {
        bindInterceptor(null, null);
    }


}
