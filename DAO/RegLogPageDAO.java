package com.capg.Banking.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.capg.Banking.AccountDetails;

public class RegLogPageDAO implements IRegLogPageDAO{
	AccountDetails ad=new AccountDetails();
	public int register(AccountDetails accountno) {
		int a=ad.getAccountNo();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","CAPGEMINI"," oracle123");
            
			
			PreparedStatement preparedstatement=con.prepareStatement("insert into customer_details(first_name,last_name,email_id,passward,pancard_no,aadhar_no,address,mobile_no,balance) values(?,?,?,?,?,?,?,?,?,?)");
			preparedstatement.setString(1, ad.getFirstName());
			preparedstatement.setString(2,ad.getLastName());
			preparedstatement.setString(3,ad.getEmailId());
			preparedstatement.setString(4,ad.getPassward());
			preparedstatement.setInt(5,ad.getPancardNo());
			preparedstatement.setInt(6,ad.getAadharcardNo());
			preparedstatement.setString(7,ad.getAddress());
			preparedstatement.setLong(8,ad.getMobileNo());
			preparedstatement.setInt(9,ad.getBalance());
			
			
			preparedstatement.executeUpdate();
			con.close();
		
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return a;
	}
public AccountDetails login(int AccountNo, String Passward) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","CAPGEMINI"," oracle123");
            Statement st= con.createStatement();
			
			ResultSet resultset =st.executeQuery("select * from customer_details");
			while (resultset.next()) {
				resultset.getInt(1);
				resultset.getString(5);
				
			}
			
			con.close();
		
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		return ad;
	}

	
	
}
