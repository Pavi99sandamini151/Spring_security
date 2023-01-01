package com.security.springsecure;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

public abstract class WebSecurityConfigurerAdapter {

    protected abstract void configure(AuthenticationManagerBuilder auth) throws Exception;
}