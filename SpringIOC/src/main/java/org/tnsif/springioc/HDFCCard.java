package org.tnsif.springioc;

public class HDFCCard implements DebitCard{

	@Override
	public void deposit() {
		System.out.println("SBI-Depositing an amount of 1 lakh rupees");
		
	}

	@Override
	public void withdraw() {
		System.out.println("SBI-Withdrawing an amount of 20 thousand rupees");
		
	}

}
