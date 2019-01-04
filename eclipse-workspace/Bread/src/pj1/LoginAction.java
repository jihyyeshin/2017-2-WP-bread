package pj1;


import java.io.IOException;

import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.catalina.Session;

@WebServlet("/LoginAction")

public class LoginAction extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

request.setCharacterEncoding("UTF-8");
response.setContentType("text/html");
response.setCharacterEncoding("UTF-8");

//PrintWriter out = response.getWriter();
//��û�� �Ű����� "id"�� ������ id �ִ´�

String id = request.getParameter("id");
//��û�� �Ű����� "pw"�� ������ pw �ִ´�

String pw = request.getParameter("pw");

boolean save = false;

//checkbox�� ���� ������
if(request.getParameter("save") != null){
save = true;//save�� true�� �ٲ�
}

//�����Ͻ� ���̾� ȣ��(model layer)

Dao dao = new Dao();

if(dao.login(id, pw)){
	//save check��
if(save){
Cookie idCookie = new Cookie("id", id);
idCookie.setMaxAge(60*60*24);
response.addCookie(idCookie);

Cookie pwCookie = new Cookie("pw", pw);
pwCookie.setMaxAge(60*60*24);
response.addCookie(pwCookie);
}
//save check ���� ��
else
{
    // ��ü ��Ű �����ϱ�
    Cookie[] cookies = request.getCookies() ;
     
    if(cookies != null){
        for(int i=0; i < cookies.length; i++){
             
            // ��Ű�� ��ȿ�ð��� 0���� �����Ͽ� �����Ų��
            cookies[i].setMaxAge(0) ;
             
            // ���� ����� �߰��Ѵ�
            response.addCookie(cookies[i]) ;
        }
    }
}


//id,pw�� �´ٸ� �޼����� success ���
request.setAttribute("msg", id);

RequestDispatcher rd = request.getRequestDispatcher("/login_welcome.jsp");
rd.forward(request, response);

}
else{
//id,pw�� �ƴϴٸ� �޼����� fail ���
RequestDispatcher rd = request.getRequestDispatcher("/login_fail.jsp");
rd.forward(request, response);
}
}
}