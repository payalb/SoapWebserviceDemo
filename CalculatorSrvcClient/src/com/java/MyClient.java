package com.java;

import java.rmi.RemoteException;

import com.java.CalcServiceStub.AddResponse;

public class MyClient {
//wsdl: stubs: 1 url: axis2
	//.net: .net language
	//rmi: java java
	//webservice: platform independent
	public static void main(String args[]) throws RemoteException {
		CalcServiceStub stub= new CalcServiceStub();
		
		CalcServiceStub.Add add= new CalcServiceStub.Add();
		add.setA(3);
		add.setB(5);
		AddResponse response=stub.add(add);
		int sum=response.get_return();
		System.out.println(sum);
	}
}
