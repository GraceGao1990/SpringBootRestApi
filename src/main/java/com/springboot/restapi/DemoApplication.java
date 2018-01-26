package com.springboot.restapi;

import com.springboot.restapi.Repository.ProductRepositoty;
import com.springboot.restapi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private ProductRepositoty productRepositoty;

	@Autowired
	public void ProductRepositoty(ProductRepositoty productRepositoty) {
		this.productRepositoty = productRepositoty;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

		Product testProduct = new Product();
		testProduct.setName("Simple Product111");
		testProduct.setDescription("This is a tester product");
		testProduct.setType("CUSTOM");
		testProduct.setCategory("SPECIAL");

		productRepositoty.save(testProduct);


	}
}
