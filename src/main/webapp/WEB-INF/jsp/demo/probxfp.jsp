<%@ page contentType="text/html; charset=utf-8"%>
<%@ page language="java" import="java.sql.Statement" import="java.sql.*" %>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%
    String code = request.getParameter("fp");
    int id = Integer.parseInt(request.getParameter("id"));
    //out.print(id);
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    String url = "jdbc:mysql://127.0.0.1:3306/joy-test";
    String user = "root";
    String pass = "root";
    String sql = "select fp,fp1,fp2 from bxaply where code=" + code + "";
    try {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, pass);
        Statement stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);
        rs.next();
        byte[] bs = rs.getBytes("fp");
        byte[] bs1 = rs.getBytes("fp1");
        byte[] bs2 = rs.getBytes("fp2");
        //改成PDF类型 application/pdf;charset=UTF-8
        //response.setContentType("application/pdf;charset=UTF-8");
        response.setContentType("image/jpeg");
        //response.setHeader("Pragma", "no-cache");
        //response.setDateHeader("Expires", 0);
        //response.addHeader("Cache-Control", "no-cache");//浏览器和缓存服务器都不应该缓存页面信息
        //response.addHeader("Cache-Control", "no-store");//请求和响应的信息都不应该被存储在对方的磁盘系统中；
        //response.addHeader("Cache-Control", "must-revalidate");
        if (id == 0) {
            response.getOutputStream().write(bs);
        }
        if (id == 1) {
            response.getOutputStream().write(bs1);
        }
        if (id == 2) {
            response.getOutputStream().write(bs2);
        }
        out.clear();
    }catch (Exception e){
        System.out.println(e);
    }finally {
        try {
            rs.close();
        } catch (Exception e) {
        }
        try {
            st.close();
        } catch (Exception e) {
        }
        try {
            conn.close();
        } catch (Exception e) {
        }
    }
%>