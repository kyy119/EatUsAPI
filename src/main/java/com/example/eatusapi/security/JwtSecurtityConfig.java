package com.example.eatusapi.security;

import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;

public class JwtSecurtityConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {


}
