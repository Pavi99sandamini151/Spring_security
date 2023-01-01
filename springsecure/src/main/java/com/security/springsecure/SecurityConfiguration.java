package com.security.springsecure;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
public abstract class SecurityConfiguration implements WebSecurityConfigurer, SecurityConfigurationAuth {

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception{

    }

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//        auth.inMemoryAuthentication()
//                .withUser("Pavithra")
//                .password("test123")
//                .roles("USER");
//    }
}
