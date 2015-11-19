<%@page import="java.sql.*,java.io.*,java.text.*,java.util.*" %> 
<%@page import="java.util.*" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Connection con = null;
Statement st = null;
ResultSet rs = null;

try {
	Class.forName("com.mysql.jdbc.Driver");
	//con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root","xodh1220");
	con = DriverManager.getConnection("jdbc:mysql://ja-cdbr-azure-west-a.cloudapp.net:3306/javademo", "ba2bbb04cfa31b","73c6cbd1");

	st = con.createStatement();
	if (st.execute("select name from city")) {
		rs = st.getResultSet();
	}

	out.println("<p>도시이름</p>");
	while (rs.next()) {
		String str = rs.getString(1);
		out.println(str + "<br />");
	}
} catch (SQLException sqex) {
	out.println("SQLException: " + sqex.getMessage());
	out.println("SQLState: " + sqex.getSQLState());
} finally {
	if (rs != null) { try { rs.close(); } catch (Exception e) {}}
	if (st != null) { try { st.close(); } catch (Exception e) {}}
	if (con != null) { try {con.close();} catch (Exception e) {}}
}
%>

</body>
</html>