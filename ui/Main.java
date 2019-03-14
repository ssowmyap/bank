package com.capg.Banking.ui;

import java.util.Scanner;

import com.capg.Banking.AccountDetails;
import com.capg.Banking.Service.IRegLogPageService;
import com.capg.Banking.Service.RegLogPageservice;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the choice");
		System.out.println("1.Register");
		System.out.println("2.Login");
		System.out.println("3.Exit");
		AccountDetails ad=new AccountDetails();
		IRegLogPageService rl=new RegLogPageservice();
		do {
		int ch=sc.nextInt();	
		switch (ch) {
		case 1:
			System.out.println("enter FirstName");
			ad.setFirstName(sc.next());
			System.out.println("enter LastName");
			ad.setLastName(sc.next());
			System.out.println("enter emailId");
			ad.setEmailId(sc.next());
			System.out.println("enter passward");
			ad.setPassward(sc.next());
			System.out.println("enter pancardNo");
			ad.setPancardNo(sc.nextInt());
			System.out.println("enter aadharNo");
			ad.setAadharcardNo(sc.nextInt());
			System.out.println("enter address");
			ad.setAddress(sc.next());
			System.out.println("enter mobileNo");
			ad.setMobileNo(sc.nextLong());
			break;
		case 2:
			
			System.out.println("enter accountno");
			long checkaccno=sc.nextLong();
			System.out.println("enter password");
			String checkpassword=sc.next();
		
			
				if(checkaccno==ad.getAccountNo()&&checkpassword==ad.getPassward()) {
					
				System.out.println("valid");
				
			    }
				else {
					System.out.println("not valid");
					
				}
		case 3:
			System.exit(0);
			
		default:
			break;
		}
	}while(true);

}
}