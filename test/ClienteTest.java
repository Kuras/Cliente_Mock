import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@SuppressWarnings("deprecation")
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
	
	@Mock
	private IApiValidate iapi;
	
	@InjectMocks
	private Cliente c;
	
	@Test
	public void testValidate_CallApi_CalledApiWasRunned2() {
		
		c.validate();
		
		verify(iapi).validateCliente(anyInt());
	}
	
	@Test
	public void testValidate_CallApi_ReturnFalse() {
		
		boolean result = c.validate();
		
		assertFalse(result);
		
	}
	
	@Test
	public void testValidate_CallApi_ReturnTrue() {
		
		when(iapi.validateCliente(anyInt())).thenReturn(true);
		boolean result = c.validate();
		
		assertTrue(result);
		
	}
	
	//WithoutDependency
	@Test
	public void testValidate_CallApi_WithOutDependency() {
		
		IApiValidate api = mock(IApiValidate.class);
		TestableCliente testableCliente = new TestableCliente(api);
		
//		verify(api).validateCliente(anyInt());
//		when(api.validateCliente(anyInt())).thenReturn(true);
		
		boolean restult = testableCliente.validateWithoutDependency();
		assertTrue(restult );
		
		
	}
	
}
 