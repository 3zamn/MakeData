package com.foreveross.main;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.util.Date;

import com.foreveross.util.Dbutil;

public class InsertDetail {

	public static void insert() {  
        // 开时时间  
        Long begin = new Date().getTime();  
        // sql前缀  
        Connection conn = Dbutil.getConn();
        String prefix = "INSERT INTO po_app_detail (ID, PO_APP_NO,LINE_NO, PRODUCT_CODE,PRODUCT_ATTR,PO_APP_QTY,PO_APP_PRICE,PO_APP_POINT,PO_SUPPLY_QTY,PO_SUPPLY_PRICE,PO_SUPPLY_POINT,PROM_CODE,PROM_PRODUCT_ATTR,PRODUCT_PRICE,PRODUCT_POINT,PRODUCT_BOM_CODE,IS_MANUAL_INPUT,COMMENTS,CREATED_TIME,CREATED_BY,LAST_UPDATED_TIME,LAST_UPDATED_BY) VALUES ";  
      
        try {  
            // 保存sql后缀  
            StringBuffer suffix = new StringBuffer();  
            // 设置事务为非自动提交  
            conn.setAutoCommit(false);  
            // Statement st = conn.createStatement();  
            // 比起st，pst会更好些  
            PreparedStatement pst = conn.prepareStatement("");  
            // 外层循环，总提交事务次数  
            int id =0;
            String PO_APP_NO="'NO_";
            int LINE_NO=123;
            String PRODUCT_CODE="'PN_";
            String PRODUCT_ATTR="'0'";
            int PO_APP_QTY=10;
          //  BigDecimal PO_APP_PRICE= new BigDecimal("100.00"); 
         //   BigDecimal PO_APP_POINT=new BigDecimal("120.00");
            int PO_SUPPLY_QTY=2000;
         //   BigDecimal PO_SUPPLY_PRICE=new BigDecimal("230.00");
         //   BigDecimal PO_SUPPLY_POINT=new BigDecimal("500.00");
            String PROM_CODE="'052'";
            String PROM_PRODUCT_ATTR="'1'";
        //    BigDecimal PRODUCT_PRICE=new BigDecimal("620.00");
       //     BigDecimal PRODUCT_POINT=new BigDecimal("750.00");
            String PRODUCT_BOM_CODE="'ta20'";
            int IS_MANUAL_INPUT =1;
            String COMMENTS="'hhhh'";
       //     Date CREATED_TIME= new Date();
            String CREATED_BY="'admin'";
        //    Date LAST_UPDATED_TIME= new Date();
            String LAST_UPDATED_BY ="'06'";
            
            for (int i = 1; i <= 100000; i++) {  
                // 第次提交步长  
                for (int j = 1; j <= 6000; j++) {  
                    // 构建sql后缀  
                	id =id+1;
                  	suffix.append("(" + id + "," +PO_APP_NO +String.format("%09d", id/3)+"'"+ "," + LINE_NO+ "," + PRODUCT_CODE+String.format("%05d", (int)(Math.random()*1000))+"'" +"," + PRODUCT_ATTR+"," + PO_APP_QTY+"," + 100.00+"," + 120.00+"," + PO_SUPPLY_QTY+"," + 230.00+"," + 53.00+"," + PROM_CODE+"," + PROM_PRODUCT_ATTR+"," + 520.00+"," + 230.00+"," + PRODUCT_BOM_CODE+"," + IS_MANUAL_INPUT+"," + COMMENTS+", SYSDATE(), "+ CREATED_BY+", SYSDATE(), "+ LAST_UPDATED_BY+"),");  
                //    suffix.append("(" + id + ", SYSDATE(), " + id/3  + "),");  
                 // 	 System.out.println(suffix);   	
                }  
                // 构建完整sql  
                String sql = prefix + suffix.substring(0, suffix.length() - 1);  
                // 添加执行sql  
           //     System.out.println(sql);
                pst.addBatch(sql);  
                // 执行操作  
                pst.executeBatch();  
                // 提交事务  
                conn.commit();  
                // 清空上一次添加的数据  
                suffix = new StringBuffer();  
            }  
            // 头等连接  
            pst.close();  
            conn.close();  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
        // 结束时间  
        Long end = new Date().getTime();  
        // 耗时  
        System.out.println("cast : " + (end - begin) / 1000 + " ms");  
    }  
	
}
