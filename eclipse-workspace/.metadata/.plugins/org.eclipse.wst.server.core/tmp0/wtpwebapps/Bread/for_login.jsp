<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
		Cookie[] cookies = request.getCookies();
		String id = "";
		String pw = "";
		String redirectUrl="";
		if (cookies != null) {
			for (Cookie c : cookies) {
				//��Ű���� �����´�.
				//id��� �̸��� ���� ������ �ִٸ�
				if (c.getValue().equals("admin")) {
					//string id�� �� ���� �������
					redirectUrl = "homelogin.jsp";
					//pw��� �̸��� ���� ������ �ִٸ�
				} else{// if (c.getName().equals("pw")) {
					redirectUrl = "home.jsp";
				}
			}
		}
		response.sendRedirect(redirectUrl);

%>
</body>
</html>