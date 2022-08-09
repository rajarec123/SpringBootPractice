package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ashokit.util.PwdUtils;

@Configuration
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig:: Construction...!");
	}
	
	@Bean
	public PwdUtils getInstance() {
		System.out.println("getInstance() executed...!");
		PwdUtils pwd = new PwdUtils("SHA-1"); 
		return pwd;
	}
}
