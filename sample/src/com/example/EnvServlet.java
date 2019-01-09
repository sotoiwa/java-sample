package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EnvServlet
 */
@WebServlet("/env")
public class EnvServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public EnvServlet() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head>");
    out.println("<title>info</title>");
    out.println("</head>");
    out.println("<body>");

    out.println("<a href=\"./\">top</a>");

    // 環境変数を表示する
    out.println("<h4>Environment Variables</h4>");
    Map<String, String> envMap = System.getenv();
    if (envMap != null) {
      out.println("<table border=1>");
      for (Map.Entry<String, String> env : envMap.entrySet()) {
        out.println("<tr>");
        out.println("<td>" + env.getKey() + "</td>");
        out.println("<td>" + env.getValue() + "</td>");
        out.println("</tr>");
      }
      out.println("</table>");
    }

    out.println("</body>");
    out.println("</html>");
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // TODO Auto-generated method stub
    doGet(request, response);
  }

}
