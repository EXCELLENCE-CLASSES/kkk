package com.excellence.OnlineOfficialWebsite;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter 
{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
		
		System.out.println("hello");
		
		
		// TODO Auto-generated method stub
		
		auth.inMemoryAuthentication().withUser("EXC").password("ARYA").roles("USER");
		
		
		
		
		
		
	}
	
	@SuppressWarnings("deprecation")
	@Bean
	public PasswordEncoder getPasswordEncorder() 
	{
		return NoOpPasswordEncoder.getInstance();
	}
	
	
	
	

}
