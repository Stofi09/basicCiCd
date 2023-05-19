package com.cicd.pipiline;

import com.cicd.pipiline.model.Hello;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PipilineApplicationTests {


	@Test
	public void testShout(){
		Hello hello = new Hello("hello");
		assertEquals("hello", hello.shout());
	}
}
