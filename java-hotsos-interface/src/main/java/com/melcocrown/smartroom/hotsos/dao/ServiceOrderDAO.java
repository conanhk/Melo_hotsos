package com.melcocrown.smartroom.hotsos.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;


public class ServiceOrderDAO {
	private static final Logger LOG = LoggerFactory.getLogger(ServiceOrderDAO.class);
	
	private DataSource dataSource;	
	
	public String findIssueIdByIssueName(String issueName)
	{
	    Connection con = null;
	    PreparedStatement pstmt = null;
	    ResultSet result = null;
		 try
		 {  
		    con = dataSource.getConnection();
		    String sql = "select * from IRMSDB.hotsos_serviceorder_issue_mapping where issueName = '"+issueName+"'";
		    pstmt = con.prepareStatement(sql);		    
		    result = pstmt.executeQuery();
		    while(result.next())
		    {
		    	String issueId =  result.getString("issueId");
		    	return issueId;
		    }
			    	    
		}
		 catch(SQLException e)
		{   
			 LOG.error(e.getMessage());
		} 
		 finally
		{ 	
			try 
			{
				if(result != null)
				{
					result.close();
				}
				if(pstmt != null)
				{
					pstmt.close();
				}
				
				if(con != null)
		    	{
		    		con.close();
		    	}
			} catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			 LOG.error(e.getMessage());
			}
		}
		return null;
	}
	
	public String storeServiceOrderInfo(String serviceOrderId, String roomNumber)
	{
	    Connection con = null;
	    PreparedStatement pstmt = null;
	    try
		{  
	    	con = dataSource.getConnection();
		    pstmt = con.prepareStatement("insert into IRMSDB.hotsos_service_order(serviceOrderId,roomNumber,createDate) value(?,?,now())");
		    pstmt.setString(1, serviceOrderId);
		    pstmt.setString(2, roomNumber);
		    pstmt.execute();			    
		}catch(SQLException e)
		{   
			LOG.error(e.getMessage());
	    } 
	    finally
		{
    		try 
    		{
    			if(pstmt != null)
    			{
    				pstmt.close();
    			}
				
				if(con != null)
		    	{
		    		con.close();
		    	}
			} catch (SQLException e) 
    		{
				// TODO Auto-generated catch block
				LOG.error(e.getMessage());
				e.printStackTrace();
			}
		}
		return null;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
}
