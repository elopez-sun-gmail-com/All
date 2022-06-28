package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HolaMundo")
public class HolaMundo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            
        //response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Las credenciales son invalidas...");
        
        response.sendRedirect("respuesta.jsp");
    }

}
