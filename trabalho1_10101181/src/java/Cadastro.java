/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Controle.Evento;
import Controle.EventoPersistencia;

/**
 *
 * @author infotv
 */
public class Cadastro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            if (!request.getParameter("senha").equals(request.getParameter("senah2"))) {
                out.println("As senahs devem ser iguais");
                out.println("<a href='registro.jsp'>Voltar</a>");
            } else if (Evento.usuario_existe(request.getParameter("login"))) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet Cadastro</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<div id='corpo'>");
                out.println("<h1>Usuario  " + request.getParameter("login") + " já registrado, favor escolher um novo login</h1>");
                out.println("<a href='registro.jsp'>Voltar</a>");
                out.println("<a href='index.html'>Inicial</a>");
                out.println("</div>");
                out.println("</body>");
                out.println("</html>");
            } else {
                EventoPersistencia.cadastra_usuario(request.getParameter("login"), request.getParameter("senha"));
                response.sendRedirect(response.encodeRedirectURL("index.jsp"));
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
