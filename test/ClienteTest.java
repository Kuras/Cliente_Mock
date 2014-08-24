import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class) //MockitoAnnotations.initMocks(this)
public class ClienteTest {


	
	@Test
	public void testCompletedName_ReturnEmpty() {
		
		Cliente cliente = new Cliente();
		
		
		String result = cliente.formatedName();
		
		
		assertEquals("", result);
	}
	
	@Test
	public void testCompletedName_ReturnName() {
		
		Cliente cliente = new Cliente();
		cliente.setName("name");
		
		String result = cliente.formatedName();
		
		
		assertEquals("name", result);
	}
  
}
 