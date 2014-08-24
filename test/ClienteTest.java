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
	
	@Test
	public void testCompletedName_ReturnNameAndLastName() {
		
		Cliente cliente = new Cliente();
		cliente.setName("name");
		cliente.setLastName("lastName");
		
		String result = cliente.formatedName();
		
		
		assertEquals("name lastName", result);
	}
  
	// Dependency injection
	@Test
	public void testValidate_CallApi_CalledApiWasRunned() {
		
		IApiValidate mockApi = mock(IApiValidate.class);
		
		Cliente cliente = new Cliente(mockApi);
		cliente.setId(1);
		
		cliente.validate();
		
		verify(mockApi).validateCliente(1);
	}
	
	@Test
	public void testValidate_CallApi_CalledApiWasRunned1() {
		
		IApiValidate mockApi = mock(IApiValidate.class);
		
		Cliente cliente = new Cliente(mockApi);
		
		cliente.validate();
		
		verify(mockApi).validateCliente(anyInt());
	}
	
	
}
 