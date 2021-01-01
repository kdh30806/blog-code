
import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ex1
 */
@WebServlet("/ex1")
public class ex1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("num"));
		
		Map<String, String[]> parameter = request.getParameterMap();
		System.out.println("Map의 크기 : " + parameter.size());
		System.out.println("name의 크기 : " + parameter.get("name").length);
		System.out.println("num의 크기 : " + parameter.get("num").length);
		
		String[] strName = parameter.get("name");
		System.out.println(strName[0]);
		System.out.println(strName[1]);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

}
