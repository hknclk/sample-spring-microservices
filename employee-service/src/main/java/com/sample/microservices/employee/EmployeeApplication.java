package com.sample.microservices.employee;

import com.sample.microservices.employee.model.Employee;
import com.sample.microservices.employee.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	@Bean
	public Docket swaggerPersonApi10() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
					.apis(RequestHandlerSelectors.basePackage("com.sample.microservices.employee.controller"))
					.paths(PathSelectors.any())
				.build()
				.apiInfo(new ApiInfoBuilder().version("1.0").title("Employee API").description("Documentation Employee API v1.0").build());
	}

	@Bean
    EmployeeRepository repository() {
		EmployeeRepository repository = new EmployeeRepository();
		repository.add(new Employee(1L, 1L, "Osman Ağa", 34, "Analist"));
		repository.add(new Employee(1L, 1L, "Dürüye Güğüm", 37, "Müdür"));
		repository.add(new Employee(1L, 1L, "Ali Veli", 26, "Yazılımcı"));
		repository.add(new Employee(1L, 2L, "Ahmet Mehmet", 39, "Analist"));
		repository.add(new Employee(2L, 3L, "Cemil İskeçeli", 38, "Yazılımcı"));
		repository.add(new Employee(2L, 3L, "Ali Pakdil", 30, "Müdür"));
		repository.add(new Employee(2L, 4L, "Serdar Ortaç", 30, "Yazılımcı"));
		return repository;
	}

}
