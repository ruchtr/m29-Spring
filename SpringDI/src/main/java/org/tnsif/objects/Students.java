package org.tnsif.objects;

public class Students {
	Address address;
	public Students(Address address)
	{
		super();
		this.address= address;
	}
	public void print()
	{
		address.display();
	}
}
