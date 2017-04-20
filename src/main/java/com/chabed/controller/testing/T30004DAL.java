package com.chabed.controller.testing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chabed.database.service.DatabaseConfigure;
import com.chabed.model.T30003;




@Controller
public class T30004DAL {
	
	
	@RequestMapping("/get/information")
    @ResponseBody
	 public HashMap<String, Object> getDrugTherapeCode(){
		HashMap<String, Object> plr = new HashMap<String, Object>();
		List<T30003> testEntities = new ArrayList<T30003>();

        String sql = "SELECT DISTINCT T_DRUG_THERAP_CLS_CODE,T_LANG2_NAME "
		   +"FROM T30003";
        			
		Connection connection = new DatabaseConfigure().getConnection();
		PreparedStatement statement = null;
         try {
        	 statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery();
             
             if(resultSet!=null){
            	 while (resultSet.next()) {
            		 T30003 entity = new T30003();
            		 entity.setT_DRUG_THERAP_CLS_CODE(resultSet.getString("T_DRUG_THERAP_CLS_CODE"));
            		 testEntities.add(entity);
    			 }
             }else{
            	 System.out.println("not found");
             }
             
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(statement!=null){
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(connection!=null){
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
         
         if(testEntities != null){
        	 plr.put("data", testEntities);
         }
         
         return plr;
     }
	
	
	
	
	@RequestMapping("/get/informationById")
    @ResponseBody
	 public HashMap<String, Object> GenericCodeSearch(String T_DRUG_THERAP_CLS_CODE){
		HashMap<String, Object> plr = new HashMap<String, Object>();
		List<T30003> testEntities = new ArrayList<T30003>();

        String sql = "SELECT DISTINCT T_DRUG_THERAP_CLS_CODE,T_LANG2_NAME "
		   +"FROM T30003 "
		   +"WHERE T_DRUG_THERAP_CLS_CODE LIKE '"+T_DRUG_THERAP_CLS_CODE+"'";
        			
		Connection connection = new DatabaseConfigure().getConnection();
		PreparedStatement statement = null;
         try {
        	 statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery();
             
             if(resultSet!=null){
            	 while (resultSet.next()) {
            		 T30003 entity = new T30003();
            		 entity.setT_DRUG_THERAP_CLS_CODE(resultSet.getString("T_DRUG_THERAP_CLS_CODE"));
            		 entity.setT_LANG2_NAME(resultSet.getString("T_LANG2_NAME"));
            		 testEntities.add(entity);
    			 }
             }else{
            	 System.out.println("not found");
             }
             
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(statement!=null){
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(connection!=null){
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
         
         if(testEntities != null){
        	 plr.put("data", testEntities);
         }
         
         return plr;
     }
	
	
	
	
}
