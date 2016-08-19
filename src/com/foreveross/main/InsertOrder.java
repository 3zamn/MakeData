package com.foreveross.main;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.util.Date;
import java.util.Random;

import com.foreveross.util.Dbutil;

public class InsertOrder {

	public static void insert() {  
        // 开时时间  
        Long begin = new Date().getTime();  
        // sql前缀  
        Connection conn = Dbutil.getConn();

        String prefix="INSERT INTO po_app_master (ID,PO_APP_NO,PO_NO,ORDER_DEALER_NO,PO_APP_DATE,PO_APP_TYPE,PO_APP_TRAN_STATUS,PO_APP_PRICE_GROUP_TYPE,PO_APP_PRICE_ATTR,PO_APP_CARD_ATTR,PO_GROUP_NO,PO_PRE_CONFIG_NO,PO_PRE_TRAN_APP_NO,PO_PROCESS_CODE,PO_PROM_FLAG,PO_WHOLE_PROM_CODE,PO_TOTAL_POINT,PO_TOTAL_AMT,PO_PRODUCT_AMT,PO_NON_PRODUCT_AMT,PO_TRANSPORT_AMT,PO_ENTRY_CLASS,PO_ENTRY_DEALER_NO,PO_ENTRY_MEMO,HOLD_STOCK_STATUS,HOLD_STOCK_DOC_NO,HOLD_STOCK_BEGIN_TIME,PAYMENT_STATUS,PAYMENT_TIME,PAYMENT_DOC_NO,PAYMENT_EPAY_AGENT_CODE,PAYMENT_EPAY_TRAN_NO,PAYMENT_MEMO,SPECIAL_STATUS,SPECIAL_TIME,SPECIAL_BY,DELIVERY_WH_CODE,DELIVERY_WH_LOC_CODE,DELIVERY_DAYS,DELIVERY_TYPE,DELIVERY_DEALER_NO,ADDR_SEND_ID,ADDR_AREA_CODE,ADDR_PROVINCE,ADDR_CITY,ADDR_COUNTY,ADDR_DISTRICT,ADDR_DETAIL,R01_FULL_NAME,R01_CERTIFICATE_NO,R01_TELES,R02_FULL_NAME,R02_CERTIFICATE_NO,R02_TELES,R03_FULL_NAME,R03_CERTIFICATE_NO,R03_TELES,COMMENTS,CREATED_TIME,CREATED_BY,LAST_UPDATED_TIME,LAST_UPDATED_BY,HQ_TRAN_STATUS,HQ_CHECKED_TIME,HQ_CHECKED_BY,HQ_CHECKED_MEMO,HQ_AUDITED_TIME,HQ_AUDITED_BY,HQ_AUDITED_MEMO,HQ_SO_PERIOD,HQ_TRANSPORT_FLAG,APP_PERIOD,RELEASE_STOCK_TIME) VALUES ";

        try {  
            // 保存sql后缀  
            StringBuffer suffix = new StringBuffer();  
            // 设置事务为非自动提交  
            conn.setAutoCommit(false);  
            // Statement st = conn.createStatement();  
            // 比起st，pst会更好些  
            PreparedStatement pst = conn.prepareStatement("");  
            // 外层循环，总提交事务次数  
            int id =100000000;
            int DEALER_NO=1000000;
            String PO_APP_NO="'NO_";
            String PO_NO="'ORDER_";
            String ORDER_DEALER_NO="'1'";
            Date  PO_APP_DATE= new Date();
            String PO_APP_TYPE ="'0'";
            String PO_APP_TRAN_STATUS="'1'";
            String PO_APP_PRICE_GROUP_TYPE="'2'";
            String PO_APP_PRICE_ATTR ="'0'";
            String PO_APP_CARD_ATTR ="'1'";
            String PO_GROUP_NO="'1'";
            String PO_PRE_CONFIG_NO="'测试'";
            String PO_PRE_TRAN_APP_NO="'0000xx'";
            String PO_PROCESS_CODE="'2'";
            String PO_PROM_FLAG ="'1'";
            String PO_WHOLE_PROM_CODE="'no02'";
            BigDecimal PO_TOTAL_POINT= new BigDecimal("100.00"); 
            BigDecimal PO_TOTAL_AMT= new BigDecimal("100.00"); 
            BigDecimal PO_PRODUCT_AMT= new BigDecimal("100.00"); 
            BigDecimal PO_NON_PRODUCT_AMT= new BigDecimal("100.00"); 
            BigDecimal PO_TRANSPORT_AMT= new BigDecimal("100.00"); 
            String PO_ENTRY_CLASS="'1'";
            String PO_ENTRY_DEALER_NO="'chen'";
            String PO_ENTRY_MEMO="'hx'";
            String HOLD_STOCK_STATUS="'1'";
            String HOLD_STOCK_DOC_NO="'000002'";
            Date  HOLD_STOCK_BEGIN_TIME= new Date();
            String PAYMENT_STATUS="'1'";
            Date  PAYMENT_TIME= new Date();
            String PAYMENT_DOC_NO ="'01111'";
            String PAYMENT_EPAY_AGENT_CODE="'02'";
            String PAYMENT_EPAY_TRAN_NO="'1'";
            String PAYMENT_MEMO="'dfasF'";
            String SPECIAL_STATUS="'0'";
            Date  SPECIAL_TIME= new Date();
            String SPECIAL_BY="'chx'";       
            String DELIVERY_WH_CODE="'x2'";
           
            String DELIVERY_WH_LOC_CODE="'1'";
            int DELIVERY_DAYS=02;
            String DELIVERY_TYPE="'y'";
            String DELIVERY_DEALER_NO="'ad655min'";           
            String ADDR_SEND_ID="'adcb555'";
            String    ADDR_AREA_CODE="'xx1'" ;
            String ADDR_PROVINCE="'0xxx4'";
            
            String ADDR_CITY="'0xxx4'";
            String ADDR_COUNTY="'0xxx4'";
            String ADDR_DISTRICT="'0xxx4'";
            String ADDR_DETAIL="'0xxx4'";
            String R01_FULL_NAME="'0xxx4'";
            String R01_CERTIFICATE_NO="'0xxx4'";
            String R01_TELES="'0xxx4'";
            String R02_FULL_NAME="'0xxx4'";
            String R02_CERTIFICATE_NO="'0xxx4'";
            String R02_TELES="'0xxx4'";
            String R03_FULL_NAME="'0xxx4'";
            String R03_CERTIFICATE_NO="'0xxx4'";
            String R03_TELES="'0xxx4'";
            String COMMENTS="'0xxx4'";
            Date CREATED_TIME=new Date();
            String CREATED_BY="'0xxx4'";
            Date LAST_UPDATED_TIME=new Date();
            String LAST_UPDATED_BY="'0xxx4'";
            String HQ_TRAN_STATUS="'1'";
            Date HQ_CHECKED_TIME=new Date();
            String HQ_CHECKED_BY="'0xxx4'";
            String HQ_CHECKED_MEMO="'0xxx4'";
            Date HQ_AUDITED_TIME=new Date();
            String HQ_AUDITED_BY="'0xxx4'";
            String HQ_AUDITED_MEMO="'0xxx4'";
            String HQ_SO_PERIOD="'0xxx4'";
            String HQ_TRANSPORT_FLAG="'1'";
            String APP_PERIOD="'0xxx4'";
            Date RELEASE_STOCK_TIME=new Date();
            
            for (int i = 1; i <= 10000; i++) {  
                // 第次提交步长  
                for (int j = 1; j <= 10000; j++) {  
                    // 构建sql后缀  
                	id =id+1;
                	suffix.append("(" + id + "," + PO_APP_NO+String.format("%09d", id)+"'"+ "," + PO_NO+String.format("%09d", id)+"'"+   "," +"'DNO_"+String.format("%07d", (int)(Math.random()*1000000))+"'" +  ", SYSDATE(), " +PO_APP_TYPE +   "," +PO_APP_TRAN_STATUS +   "," +PO_APP_PRICE_GROUP_TYPE +   "," +PO_APP_PRICE_ATTR +   "," +PO_APP_CARD_ATTR +   "," +PO_GROUP_NO  + ","  +PO_PRE_CONFIG_NO +   "," +PO_PRE_TRAN_APP_NO + ","+PO_PROCESS_CODE + ", " + PO_PROM_FLAG+", " + PO_WHOLE_PROM_CODE+" , " + PO_TOTAL_POINT+" , "+PO_TOTAL_AMT +   "," +PO_PRODUCT_AMT +   "," +PO_NON_PRODUCT_AMT +   "," +PO_TRANSPORT_AMT +   "," +PO_ENTRY_CLASS +   "," +PO_ENTRY_DEALER_NO +   "," +PO_ENTRY_MEMO +   "," +HOLD_STOCK_STATUS +   "," +HOLD_STOCK_DOC_NO  +", SYSDATE(), " +PAYMENT_STATUS + ", SYSDATE(), " +PAYMENT_DOC_NO +   "," +PAYMENT_EPAY_AGENT_CODE +   "," +PAYMENT_EPAY_TRAN_NO +","+ PAYMENT_MEMO+","+ SPECIAL_STATUS+", SYSDATE(), "+ SPECIAL_BY+","+ DELIVERY_WH_CODE+","+ DELIVERY_WH_LOC_CODE+","+ DELIVERY_DAYS+","+ DELIVERY_TYPE+","+ DELIVERY_DEALER_NO+","+ ADDR_SEND_ID+","+ ADDR_AREA_CODE+","+ ADDR_PROVINCE+","+ ADDR_CITY+","+ ADDR_COUNTY+","+ ADDR_DISTRICT+","+ ADDR_DETAIL+","+ R01_FULL_NAME+","+ R01_CERTIFICATE_NO+","+ R01_TELES+","+ R02_FULL_NAME+","+ R02_CERTIFICATE_NO+","+ R02_TELES+","+ R03_FULL_NAME+","+ R03_CERTIFICATE_NO+","+ R03_TELES+","+ COMMENTS+", SYSDATE(), "+ CREATED_BY+", SYSDATE(), "+ LAST_UPDATED_BY+","+ HQ_TRAN_STATUS+", SYSDATE(), "+ HQ_CHECKED_BY+","+ HQ_CHECKED_MEMO+", SYSDATE(), "+ HQ_AUDITED_BY+","+ HQ_AUDITED_MEMO+","+ HQ_SO_PERIOD+","+ HQ_TRANSPORT_FLAG+","+ APP_PERIOD+", SYSDATE()"+"),");  
                //	 System.out.println(suffix);
                }  
                // 构建完整sql  
                String sql = prefix + suffix.substring(0, suffix.length() - 1);  
               // System.out.println(sql);
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
