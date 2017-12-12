/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Exception.UsuarioNaoEncontradoException;
import Controle.Evento;
import Controle.EventoPersistencia;
import Modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author infotv
 */
@WebServlet(urlPatterns = {"/Autenticacao"})
public class Autenticacao extends HttpServlet {

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
            throws ServletException, IOException, UsuarioNaoEncontradoException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Autenticacao</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet Autenticacao at " + request.getContextPath() + "</h1>");//request.getParameter("login")
//            out.println("<h1>Servlet Autenticacao at " + request.getParameter("login") + " - " + request.getParameter("senha") + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//            EventoPersistencia.populadados();

            try {

                String login = request.getParameter("login");
                String senha = request.getParameter("senha");
                String senha2 = request.getParameter("senha2");

                Usuario usuario = Evento.get_usuario(request.getParameter("login"));

                if (usuario.getSenha().equals(senha)) {
                    HttpSession session = request.getSession();
                    session.setAttribute("login", usuario.getLogin());

                    response.sendRedirect(response.encodeRedirectURL("http://localhost:8080/trabalho1_10101181/intranet/index.jsp"));
                }else{
                    out.println("Senha Incorreta");
                }

            } catch (UsuarioNaoEncontradoException e) {
                out.println(e.getMessage());
            }

            out.println("<a href='index.jsp'>Voltar</a>");

            //session.setAttribute(“Identificador”, objeto);
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

        try {
            processRequest(request, response);
        } catch (UsuarioNaoEncontradoException ex) {
            Logger.getLogger(Autenticacao.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (UsuarioNaoEncontradoException ex) {
            Logger.getLogger(Autenticacao.class.getName()).log(Level.SEVERE, null, ex);
        }
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
