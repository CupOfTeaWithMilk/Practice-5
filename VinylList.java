package web.lab3;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Servlet implementation class VinylList
 */
public class VinylList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VinylList() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * 
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */ 
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); // Задание типа кодировки для параметров запроса
	    String name = request.getParameter("name"); // Чтение параметра name из запроса
    	response.setContentType("text/html;charset=UTF-8"); // Задание типа содержимого для ответа (в том числе кодировки)
    	PrintWriter out = response.getWriter(); // Получение потока для вывода ответа
    	try {
    		 // Создание HTML-страницы
    		 out.println("<html>");
    		 out.println("<head><title>Список винила</title></head>");
    		 out.println("<body>");
    		 out.println("<h1>Список винила в магазине " + (name != null ? name : "без названия") + "</h1>");
    		 
    		 out.println("<table border='1'>");
    		 out.println("<tr><td><b>Исполнитель</b></td><td><b>Название пластинки</b></td><td><b>Жанр музыки</b></td><td><b>Цена, руб.</b></td></tr>");
    		 out.println("<tr><td>The Beatles</td><td>Yellow Submarine</td><td>Поп</td><td>4990</td></tr>");
    		 out.println("<tr><td>Queen</td><td>The Game</td><td>Рок</td><td>4490</td></tr>");
    		 out.println("</table>");
    		 out.println("</body>");
    		 out.println("</html>");
    	} finally {
    		 out.close(); // Закрытие потока вывода
    	}
    }
    
	/**
	 * Handles the HTTP <code>GET</code> method.
	 * 
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * Handles the HTTP <code>POST</code> method.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	 @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 processRequest(request, response);
	}
}
