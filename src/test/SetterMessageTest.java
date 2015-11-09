package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tutorialspoint.HelloWorld;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class SetterMessageTest {
	
	final Logger logger = LoggerFactory.getLogger(SetterMessageTest.class);
	
	@Autowired
    private HelloWorld message = null;
	
	@Test
	public void testMessage() {
		assertNotNull("Constructor message instance is null.", message);
        
        String msg = message.getMessage();
        
        assertNotNull("Message is null.", msg);
        
        String expectedMessage = "Salut";
        
       assertEquals("Message should be '" + expectedMessage + "'.", expectedMessage, msg);
        logger.info("message='{}'",msg);
        
	}

}
