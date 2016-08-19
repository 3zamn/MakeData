package com.foreveross.main;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Date;

import com.foreveross.util.Dbutil;

public class Insert {

	public static void insert() {  
        // 开时时间  
        Long begin = new Date().getTime();  
        // sql前缀  
        Connection conn = Dbutil.getConn();
    //   String prefix = "INSERT INTO ma_order (id, create_time,creator ) VALUES ";  
        String prefix="INSERT INTO dealer (ID,DEALER_NO,DEALER_TYPE,DEALER_POST_CODE,SPONSOR_NO,FULL_NAME,LAST_NAME,FIRST_NAME,SALE_ORG_CODE,SALE_BRANCH_NO,SALE_ZONE_NO,TYPE_CHG_DATE,TYPE_CHG_REASON,TYPE_CHG_CLASS,TYPE_EFFECTIVE_DATE,TYPE_INACTIVE_DATE,POST_EFFECTIVE_DATE,POST_INACTIVE_DATE,APP_DATE,APP_PERIOD,APP_STATUS,SEX,IS_REGISTER_SPOUSE,SPOUSE_NAME,IS_VIP,IS_SP2_LICENCE_HOLDER,OP_LOCK_STATUS,COMMENTS,CREATED_TIME,CREATED_BY,LAST_UPDATED_TIME,LAST_UPDATED_BY,TRAN_LOCK_01,APP_SP_FIRST_PERIOD,SP_EFFECTIVE_DATE,SP_INACTIVE_DATE) VALUES ";
//     "VALUES ('1', 'no_00000001', '00', '0', 'no_00000001', 'chx', 'chen', 'ch', '0', '0', '0', '2016-08-01 10:58:14', '0', '0', '2016-08-01 10:59:42', '2016-08-01 10:59:45', '2016-08-01 10:59:50', '2016-08-01 11:00:17', '2016-08-01 10:59:23', '0', '0', 'F', '0', '0', '0', '0', '0', 'test', '2016-08-01 10:58:41', 'admin', '2016-08-01 10:58:34', '1', '1', '1', '2016-08-01 10:58:26', '2016-08-01 10:58:23')";
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
            String DEALER_NO="'DNO_";
            String DEALER_TYPE="'1'";
            int DEALER_POST_CODE=0;
            String SPONSOR_NO="'no_0000002'";
            String FULL_NAME="'chx'";
            String LAST_NAME="'chen'";
            String FIRST_NAME="'hx'";
            String SALE_ORG_CODE="'01'";
            String SALE_BRANCH_NO="'02'";
            String SALE_ZONE_NO="'S_03'";
          //  Date  TYPE_CHG_DATE= new Date();
            String TYPE_CHG_REASON="'why'";
            String TYPE_CHG_CLASS ="'0'";
            String APP_PERIOD="'02'";
            String APP_STATUS="'1'";
            String SEX="'F'";
            int IS_REGISTER_SPOUSE=0;
            String SPOUSE_NAME="'chx'";          
            int IS_VIP=0;
            int IS_SP2_LICENCE_HOLDER=0;
            String OP_LOCK_STATUS="'1'";
            String COMMENTS="'test'";
            String CREATED_BY="'admin'";           
            String LAST_UPDATED_BY="'admin'";
            String    TRAN_LOCK_01="'1'" ;
            String APP_SP_FIRST_PERIOD="'04'";
            for (int i = 1; i <= 100; i++) {  
                // 第次提交步长  
                for (int j = 1; j <= 10000; j++) {  
                    // 构建sql后缀  
                	id =id+1;
                	suffix.append("(" + id + "," + DEALER_NO+String.format("%07d", id)+"'"+ "," + DEALER_TYPE+   "," +DEALER_POST_CODE +   "," +SPONSOR_NO +   "," +FULL_NAME +   "," +LAST_NAME +   "," +FIRST_NAME +   "," +SALE_ORG_CODE +   "," +SALE_BRANCH_NO +   "," +SALE_ZONE_NO  + ", SYSDATE(), "  +TYPE_CHG_REASON +   "," +TYPE_CHG_CLASS + ", SYSDATE(), " + " SYSDATE(), " + "SYSDATE(), " + " SYSDATE(), " + " SYSDATE(), "+APP_PERIOD +   "," +APP_STATUS +   "," +SEX +   "," +IS_REGISTER_SPOUSE +   "," +SPOUSE_NAME +   "," +IS_VIP +   "," +IS_SP2_LICENCE_HOLDER +   "," +OP_LOCK_STATUS +   "," +COMMENTS  + " ,SYSDATE(), " +CREATED_BY + " ,SYSDATE(), " +LAST_UPDATED_BY +   "," +TRAN_LOCK_01 +   "," +APP_SP_FIRST_PERIOD + " ,SYSDATE(), " + " SYSDATE()"+"),");  
                 //   suffix.append("(" + id + ", SYSDATE(), " + DEALER_NO+String.format("%05d", id)+"'"+ "),");  
                	//  "," +
              //  	 System.out.println(suffix);
                }  
                // 构建完整sql  
                String sql = prefix + suffix.substring(0, suffix.length() - 1);  
             //   System.out.println(sql);
                // 添加执行sql  
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
