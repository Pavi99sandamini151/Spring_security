package com.security.springsecure;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

public interface SecurityConfigurationAuth {
    void configure(AuthenticationManagerBuilder auth) throws Exception;
}
