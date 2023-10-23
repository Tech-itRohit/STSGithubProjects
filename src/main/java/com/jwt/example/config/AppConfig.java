package com.jwt.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.context.annotation.Bean;

@Configuration
public class AppConfig 
{
    @Bean
     UserDetailsService userDetailsService()
	{
//		UserDetails ur = User.builder().username("sohan").password("abcd").roles("admin").build();
    	UserDetails ur = User.builder().username("sohan").password(passwordEncoder().encode("abcd")).roles("admin").build();
		UserDetails ur1 = User.builder().username("rohan").password(passwordEncoder().encode("efgh")).roles("admin").build();

		
		return new InMemoryUserDetailsManager(ur,ur1);
	}
    @Bean
	 PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();	
	}
    @Bean
    AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception 
    {
    	return builder.getAuthenticationManager();
    }
}
