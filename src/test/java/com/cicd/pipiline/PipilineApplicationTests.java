package com.cicd.pipiline;

import com.cicd.pipiline.model.Hello;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PipilineApplicationTests {

	@Test
	public void testHello(){
		Hello hello = new Hello("hello");
		assertEquals(hello.getHello(),"hello");
	}

/*	@Test
	public void testShout(){
		Hello hello = new Hello("Hello");
		hello.setHello("Shout");
		assertEquals(hello.shout(),"Shout");
	}


 */

}
