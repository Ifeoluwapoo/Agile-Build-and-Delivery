package test.com.jUnit;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dao.AddProductdao;
import model.AddProduct;


class AddProductTest {
	
	private AddProductdao prod = new AddProductdao(); 
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {

		String productName = "Warm Blanket";
		String productDescription = "A Blanket to keep you warm all night";
		Double productPrice = 150.0;
		int productQuantity = 5;
		String productManufacturer = "DVW";
		//Part productFile =  (Part) ImageIO.read(new File("C:/Users/A00267252/Downloads/51IPsZuMWaL._SX425_"));
		AddProduct product = new AddProduct(productName, productDescription, productPrice, productQuantity, productManufacturer);
		prod.saveProduct(product);
		
		int id = product.getProductId();
		assertNotNull(id, "This Product Id is not null");
		assertEquals(productName, product.getProductName());
		assertEquals(productDescription, product.getProductDescription());
		//assertEquals(productPrice, product.getProductPrice());
		assertEquals(productQuantity, product.getProductQuantity());
		assertEquals(productManufacturer, product.getProductManufacturer());
		//assertEquals(productFile, product.getInputFile());
		
	}

}
