package com.base.study.web.springbootweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * 上午9:49 2020/4/15
 * Created By CC.Z
 * Version:1.0.
 */
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {




	@Override
	protected void configure(HttpSecurity http) throws Exception {
		super.configure(http);
		http.formLogin().successForwardUrl("/login-success");
	}

	@Bean
	@Override
	public UserDetailsService userDetailsService() {
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(User.withUsername("zcc").password("$2a$10$O5a.e34V0AYKuuoKho.GTuftg3H6EPw12t1sRtZ3dW9DGyTwpHn7i").roles("admin").build());
		return manager;
	}
	@Bean
	PasswordEncoder passwordEncoder(){
		return  new BCryptPasswordEncoder();
	}


}
