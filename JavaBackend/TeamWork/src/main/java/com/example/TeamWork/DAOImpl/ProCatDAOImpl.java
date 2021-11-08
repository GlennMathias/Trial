package com.example.TeamWork.DAOImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.TeamWork.DAO.ProCatDAO;
import com.example.TeamWork.Util.DBUtil;
import com.example.TeamWork.model.Cart;
import com.example.TeamWork.model.ProCat;


@Repository
public class ProCatDAOImpl implements ProCatDAO {

	Connection connection;
	
	ProCatDAOImpl()
	{
		connection = DBUtil.getConnection();
	}

	@Override
	public List<ProCat> viewCat() {
		// TODO Auto-generated method stub
		
		String getordIdQuery ="select * from procat";
		List <ProCat> catList = new ArrayList <ProCat> ();
		
		
		try {
			Statement stmt=connection.createStatement();
			ResultSet rs = stmt.executeQuery(getordIdQuery);
			
			while (rs.next()) {
				ProCat cat = new ProCat();
				
				cat.setProCatid(rs.getInt(1));
				cat.setProName(rs.getString(2));
				
				catList.add(cat);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return catList;
	}

	@Override
	public void addCategory(ProCat pc) {
		// TODO Auto-generated method stub
		
		
		
		String addCustQuerry = "insert into  procat (ProCatid, ProName) values "
				+ "('"+pc.getProCatid()+"','"+pc.getProName()+"');";
				

		System.out.println(addCustQuerry);
				Statement stmt;
				try {
					stmt=connection.createStatement();
					stmt.executeUpdate(addCustQuerry);
					
					}
				catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
		
	}

	
	@Override
	public void updateCategory(ProCat pc) {
		// TODO Auto-generated method stub
		
		
		
		String addCustQuerry = "update procat set ProName = '"+pc.getProName()+"' where ProCatId = "+pc.getProCatid()+";";
				

		System.out.println(addCustQuerry);
				Statement stmt;
				try {
					stmt=connection.createStatement();
					stmt.executeUpdate(addCustQuerry);
					
					}
				catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
		
	}
	
	
	
}
