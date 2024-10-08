package org.example.unit.mockito.test.dummyTest;

import static org.junit.jupiter.api.Assertions.*;

import org.example.unit.mockito.dummy.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class DummyObjectDemo {

	/*
	 * Scenario 1.txt. Standard use case
	 */
	public Customer createDummyCustomer() {
		State state = new State("CA");
		City city = new City("Los Angeles", state);
		Address address = new Address("Mulholland Drive", city);
		return new Customer("Jack", "Nicholson", address);
	}

	@Test
	public void addCustomerTest() {
		Customer dummy = createDummyCustomer();
		AddressBook addressBook = new AddressBook();
		addressBook.addCustomer(dummy);
		assertEquals(1, addressBook.getNumberOfCustomers());
	}

	/*
	 * Scenario 2. Must deal with an exception on null dummy
	 */
	@Test
	public void addNullCustomerTest() {
		Customer dummy = null;
		AddressBook addressBook = new AddressBook();
		assertThrows(NullPointerException.class, () -> addressBook.addCustomer(dummy));
	}

	/*
	 * Scenario 3. Avoid exceptions altogether by injecting a mock object
	 */
	@Test
	public void addCustomerWithDummyTest() {
		Customer dummy = Mockito.mock(Customer.class);
		AddressBook addressBook = new AddressBook();
		addressBook.addCustomer(dummy);
		assertEquals(1, addressBook.getNumberOfCustomers());
	}
}