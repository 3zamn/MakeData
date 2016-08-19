package com.foreveross.main;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Date;

import com.foreveross.util.Dbutil;

public class Insert2 {

	public static void insert() {  
        // 开时时间  
        Long begin = new Date().getTime();  
        // sql前缀  
        Connection conn = Dbutil.getConn();
        String prefix = "INSERT INTO ma_orderdet (id, create_time,orderId ) VALUES ( ?,? ,? )";  
      
        try {  
            // 保存sql后缀  
            StringBuffer suffix = new StringBuffer();  
            // 设置事务为非自动提交  
            conn.setAutoCommit(false);  
            // Statement st = conn.createStatement();  
            // 比起st，pst会更好些  
            PreparedStatement pst = conn.prepareStatement(prefix);  
            // 外层循环，总提交事务次数  
            int id =0;
          
            for (int i = 1; i <= 100000; i++) {  
                // 第次提交步长  
                for (int j = 1; j <= 60; j++) {  
                    // 构建sql后缀  
                	id =id+1;
                    suffix.append("(" + id + ", SYSDATE(), " + id/3  + "),");  
                }  
                // 构建完整sql  
            //    String sql = prefix + suffix.substring(0, suffix.length() - 1);  
                // 添加执行sql  
                pst.setInt(1, 1);
                pst.setDate(2,  null);
                pst.setString(3, "test");
                pst.addBatch();  
                // 执行操作  
                pst.executeBatch();  
                // 提交事务  
                conn.commit();  
                // 清空上一次添加的数据  
            //    suffix = new StringBuffer();  
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
