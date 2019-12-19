package io.hwc;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.hwc.controller.HelloController;

/**
 * 
 * @author Fanon Jupkwo
 * 
 * 
 */

@SpringBootTest
public class Building4hwcApplicationTests {

	@Autowired
	private HelloController helloController;

	@Test
	public void contextLoads() {
		
		Assert.assertEquals("Hello World from 4HWC",helloController.home() );
	}

}
