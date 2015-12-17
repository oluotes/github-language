package com.winteam.language;

import com.winteam.language.customerservice.Address;
import com.winteam.language.customerservice.Customer;

public interface CustomerService {
	public Long startCustomerOnboardProcess(Customer customer);
	
	public int getNumberOfCustomerOnboardProcessesInProgress();
	
	public boolean isProcessComplete(Long processId);
	
	public void addCustomerAddress(Address address, Long processId);
}