
package com.app.ones;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override                 //para habilitar el Metodo Post desde donde sea PostMan,Localhost,etc... 
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
    }

}