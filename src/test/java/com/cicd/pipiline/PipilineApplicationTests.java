package com.cicd.pipiline;

import com.cicd.pipiline.model.Hello;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PipilineApplicationTests {

	@Test
	public void testHello(){
		Hello hello = new Hello("hello");
		assertEquals(hello.getHello(),"hello");
	}
	@Test
	public void testSetHello(){
		Hello hello = new Hello("Bye");
		hello.setHello("Hello");
		assertEquals("Hello",hello.getHello());
	}

}
