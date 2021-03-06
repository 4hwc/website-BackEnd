package io.hwc;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.hwc.controller.HelloController;

/**
 * 
 * @author Fanon Jupkwo
 * 
 * 
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class Building4hwcApplicationTests {

	@Autowired
	private HelloController helloController;

	@Test
	public void contextLoads() {
		
		Assert.assertEquals("Hello World from 4HWC",helloController.home() );
	}

}
