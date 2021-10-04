package br.com.med.clinica;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EntityScan(basePackages = "br.com.med.clinica.administrativo.model")
@ComponentScan(basePackages = { "br.*" })
@EnableJpaRepositories(basePackages = { "br.com.med.clinica.atendimento.repository" })
@EnableTransactionManagement
@EnableWebMvc
public class MyConfig implements WebMvcConfigurer { //talvez não seja necessario

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
         registry.addViewController("/").setViewName("index");
         registry.addViewController("/login").setViewName("login");
	
	
	}

}
