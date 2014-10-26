<%@page import="java.sql.*" %>
<%
    String msg = "Unknown error ...", color = "red";
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minestrenght", "root", "root");
        PreparedStatement ps = con.prepareStatement("select user_name from user_login where user_name=? and user_pass=?");
        ps.setString(1, request.getParameter("user"));
        ps.setString(2, request.getParameter("pswd"));
        ResultSet rs  = ps.executeQuery();
        msg = "Login Denied";
        if(rs.next()) {
            msg = "Login Granted";
            color = "green";
        }
        rs.close();
        ps.close();
        con.close();
    } catch (ClassNotFoundException e) {
        msg = "Failed to load driver.";
    } catch (SQLException e) {
        msg = "Server error ...";
    }
    response.sendRedirect(String.format("result.jsp?msg=%s&color=%s", msg, color));
%>