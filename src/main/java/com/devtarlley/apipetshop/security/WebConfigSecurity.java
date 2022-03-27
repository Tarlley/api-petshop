package com.devtarlley.apipetshop.security;

import com.devtarlley.apipetshop.service.impl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.servlet.http.HttpSessionListener;

public class WebConfigSecurity extends WebSecurityConfigurerAdapter implements HttpSessionListener {

     @Autowired
     private UserDetailsServiceImpl userDetails;


     @Override
     protected void configure(AuthenticationManagerBuilder auth) throws Exception {
          auth.userDetailsService(userDetails).passwordEncoder(new BCryptPasswordEncoder());
     }

     @Override
     public void configure(WebSecurity web) throws Exception {
          web.ignoring().antMatchers(HttpMethod.GET,"/login");
     }
}
