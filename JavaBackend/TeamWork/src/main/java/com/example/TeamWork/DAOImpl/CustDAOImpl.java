package com.example.TeamWork.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Repository;


import com.example.TeamWork.DAO.CustDAO;
import com.example.TeamWork.Util.DBUtil;
import com.example.TeamWork.model.Customer;


@Repository
public class CustDAOImpl implements CustDAO {
	
	Connection connection;

	public CustDAOImpl() {
		connection = DBUtil.getConnection();
		System.out.println("connection " + connection);
	}
	
	@Override
	public String getName(int id) {
		String name=null;
		
		try {
			

			PreparedStatement stmt = connection.prepareStatement("select CustName from customer where CustId="+id+"");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				name=rs.getString(1);
			}
		} catch (Exception e) {
		}
		return name;
		
	}
	
	@Override
	public boolean updatePassword(String oldpassword,String newpassword,int id)
	{
		String password=null;
		String retriveQuerry ="select CustPassword from customer where CustId="+id+"";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(retriveQuerry);
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				password=rs.getString(1);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if (password.equals(oldpassword))
		{
			String updateQuerry ="update customer set CustPassword ='"+newpassword+"' where CustId="+id+"";
			try {
				Statement stmt=connection.createStatement();
				stmt.executeUpdate(updateQuerry);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		return true;
	}

	@Override
	public boolean signup(Customer c) {
		// TODO Auto-generated method stub
		
String addCustQuerry = "insert into  customer (CustName, CustUserName, CustPassword, CustPhone, CustEmail, CustAddress ) values "
		+ "('"+c.getCustname()+"','"+c.getCustusername()+"','"+c.getCustpassword()+"',"+c.getCustphone()+",'"+c.getCustemail()+"','"+c.getCustaddress()+"');";
		

System.out.println(addCustQuerry);
		Statement stmt;
		try {
			stmt=connection.createStatement();
			stmt.executeUpdate(addCustQuerry);
			return true;
			
			}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
																																//CustId, CustName, CustUserName, CustPassword, CustPhone, CustEmail, CustAddress 
		return false;
	}
	
	@Override
	public String loginValidation(String username ,String password) {
		// TODO Auto-generated method stub
		
		String custtValidationQuerry = "select CustId,CustName,CustUserName,CustPassword from customer where CustUserName='"+username+"' and Custpassword='"+password+"' ;";
		String CustName = null;
		int custId=-1;
		
		try {
			

			PreparedStatement stmt = connection.prepareStatement(custtValidationQuerry);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				custId =rs.getInt(1);
				CustName = rs.getString(2);
				String CustUserName = rs.getString(3);
				String CustPassword = rs.getString(4);
				System.out.println(CustPassword);	
			}
			if (custId != -1)
			{
				
				return CustName;
			}
			else
			{
				return "Querry does not works";
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return CustName;
	}
	
	
	

}
