package com.eazyshop.openapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.tags.Tag;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class OpenapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenapiApplication.class, args);
	}

	@Bean
	public OpenAPI eazyShopOpenAPI() {
		List<Tag> tags = new ArrayList<>();
		Tag tag = new Tag();
		tag.setName("Category");
		tags.add(tag);
		return new OpenAPI()
				.info(new Info().title("EazyShop Products APIs Definition")
						.summary("EazyShop Products APIs Design-First Approach")
						.description("EazyShop Demo Application")
						.version("v0.0.1")
						.contact(new Contact().name("Facilitate Organizations with their API-first strategy")
								.url("https://www.linkedin.com/in/shubhojit-dasgupta/")
								.email("shubhojit.dasgupta@gmail.com"))
						.license(new License()
								.name("EazyShop Apache License")
								.url("https://github.com/Brisinger/openapi/blob/master/LICENSE")))
				.externalDocs(new ExternalDocumentation()
						.description("My Resume")
						.url("https://1drv.ms/b/s!Ar05itH4diJzvP4l35OUKHUw0WJ_9w?e=V4WhAz"))
				.tags(tags);
	}
}
