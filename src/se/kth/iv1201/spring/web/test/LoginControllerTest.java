package se.kth.iv1201.spring.web.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
 
import se.kth.iv1201.spring.web.controllers.BasicController;
import se.kth.iv1201.spring.web.controllers.LoginController;
 
@RunWith(MockitoJUnitRunner.class)
public class LoginControllerTest {
 
    @Mock
    private LoginController controller;
    @Mock
    private BasicController basicController;
 
   
    @Before
    public void setup() {
        controller = new LoginController();
        basicController = new BasicController();
    }
   
    @Test
    public void when_invalid_login_error_message_is_generated(){
        String modelAndView = controller.showLogin();
        assertEquals("login", modelAndView);
       
    }
   
   
   
}