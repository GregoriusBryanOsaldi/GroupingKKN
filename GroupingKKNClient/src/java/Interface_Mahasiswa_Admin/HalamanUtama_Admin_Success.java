/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_Mahasiswa_Admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;
import webservices.GroupingKKNWS_Service;

/**
 *
 * @author greg
 */
@WebServlet(name = "HalamanUtama_Admin_Success", urlPatterns = {"/HalamanUtama_Admin_Success"})
public class HalamanUtama_Admin_Success extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/GroupingKKNWS/GroupingKKNWS.wsdl")
    private GroupingKKNWS_Service service;

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
        HttpSession session = request.getSession(false);
        if (session != null) {
            String username = (String) session.getAttribute("username");
            String usernameTemp = username.substring(0, 2);
            if (usernameTemp.equals("P.")) {
                String informasi = bacaInformasiKKN();
                try (PrintWriter out = response.getWriter()) {
                    /* TODO output your page here. You may use following sample code. */
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<meta charset=\"utf-8\">\n"
                            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n"
                            + "    <title>Sistem Pembagian Kelompok KKN</title>\n"
                            + "    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n"
                            + "    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Amarante\">\n"
                            + "    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Arima+Madurai\">\n"
                            + "    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto\">\n"
                            + "    <link rel=\"stylesheet\" href=\"assets/css/Data-Table-1.css\">\n"
                            + "    <link rel=\"stylesheet\" href=\"assets/css/Data-Table.css\">\n"
                            + "    <link rel=\"stylesheet\" href=\"assets/css/header.css\">\n"
                            + "    <link rel=\"stylesheet\" href=\"assets/css/header1.css\">\n"
                            + "    <link rel=\"stylesheet\" href=\"assets/css/header2.css\">\n"
                            + "    <link rel=\"stylesheet\" href=\"assets/css/Highlight-Blue.css\">\n"
                            + "    <link rel=\"stylesheet\" href=\"https://cdn.datatables.net/1.10.15/css/dataTables.bootstrap.min.css\">\n"
                            + "    <link rel=\"stylesheet\" href=\"assets/css/Login-Form-Dark.css\">\n"
                            + "    <link rel=\"stylesheet\" href=\"assets/css/Pretty-Registration-Form.css\">\n"
                            + "    <link rel=\"stylesheet\" href=\"assets/css/Navigation-Menu-1.css\">\n"
                            + "    <link rel=\"stylesheet\" href=\"assets/css/Navigation-Menu.css\">\n"
                            + "    <link rel=\"stylesheet\" href=\"assets/css/Navigation-with-Search.css\">\n"
                            + "    <link rel=\"stylesheet\" href=\"assets/css/Sidebar-Menu.css\">\n"
                            + "    <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n"
                            + "    <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n"
                            + "    <link rel=\"stylesheet\" href=\"assets/css/untitled.css\">");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<div class=\"alert alert-warning beautiful\" role=\"alert\"><strong>Success!</strong> Information successfully updated.</div>\n");
                    out.println("<div>\n"
                            + "            <div class=\"text-left\" id=\"sidebar-wrapper\" style=\"height: 100%;margin: 0px;padding: 0px;margin-left: -250px;margin-top: -30px;\">\n"
                            + "                <a href=\"./HalamanUtama_Admin\"><img src=\"assets/img/logousd.png\" style=\"width: 130px;height: 130px;margin-top: 25px;margin-left: 55px;\"></a>\n"
                            + "                <h1 class=\"text-center\" style=\"color: rgb(255,255,255);font-size: 20px;margin-top: 20px;\">\n"
                            + "                    <strong>SISTEM PEMBAGIAN KELOMPOK KKN</strong>\n"
                            + "                </h1>\n"
                            + "                <h1 class=\"text-center\" style=\"color: rgb(255,255,255);font-size: 60px;margin-top: -55px;line-height: 72px;\">\n"
                            + "                    <strong>________</strong>\n"
                            + "                </h1>\n"
                            + "                <ul class=\"sidebar-nav\" style=\"color: rgb(255,255,255);padding: -36px;margin-top: 252px;width: 250px;height: 300px;\">\n"
                            + "                    <li> <a href=\"./HalamanUtama_Admin\" style=\"font-size: 16px;margin-top: 6px;\">Home </a>\n"
                            + "                    </li>\n"
                            + "                    <li class=\"text-center\" style=\"font-size: 16px;\"><strong>Manage Data Mahasiswa</strong>\n"
                            + "                    </li>\n"
                            + "                    <li> <a href=\"./AddDataMahasiswa_Admin.html\">Add Data Mahasiswa</a>\n"
                            + "                    </li>\n"
                            + "                    <li> <a href=\"./DeleteDataMahasiswa_Admin\">Delete Data Mahasiswa</a>\n"
                            + "                    </li>\n"
                            + "                    <li> <a href=\"./EditDataMahasiswa_Admin\">Edit Data Mahasiswa</a>\n"
                            + "                    </li>\n"
                            + "                    <li> <a href=\"./CreateGroupKKN_Admin\">Create Group KKN</a>\n"
                            + "                    </li>\n"
                            + "                    <li> <a href=\"./ViewGroupKKN_Admin\">View Group KKN</a>\n"
                            + "                    </li>\n"
                            + "                    <li class=\"text-center\" style=\"font-size: 16px;\"><strong>Manage Data Group KKN</strong>\n"
                            + "                    </li>\n"
                            + "                    <li> <a href=\"./AddDataGroup_Admin.html\">Add Data Group KKN</a>\n"
                            + "                    </li>\n"
                            + "                    <li> <a href=\"./DeleteDataGroup_Admin\">Delete Data Group KKN</a>\n"
                            + "                    </li>\n"
                            + "                    <li> <a href=\"./EditDataGroup_Admin\">Edit Data Group KKN</a>\n"
                            + "                    </li>\n"
                            + "                    <li> <a href=\"./ViewDataGroup_Admin\">View Data Group KKN</a>\n"
                            + "                    </li>\n"
                            + "                </ul>\n"
                            + "            </div>\n"
                            + "            <h1 class=\"text-right\" style=\"font-size: 20px;margin-top: 30px;margin-bottom: 20px;margin-right: 30px;filter: brightness(100%);\">\n"
                            + "                <span style=\"text-decoration: underline;\">Admin Page</span></h1>\n"
                            + "            <a href=\"./Logout\" style=\"position: absolute;right: 30px;top: 110px;\">Logout</a>\n"
                            + "        </div>");
                    out.println("<div>\n"
                            + "            <h1 class=\"text-right\" style=\"width: 538px;font-size: 30px;\"><strong>INFORMASI KKN</strong></h1>\n"
                            + "            <div class=\"row\" style=\"height: 700px;width: 1000px;margin-left: 300px;\">\n"
                            + "                <div class=\"col\" style=\"margin-top: 25px;\">");
                    out.println("<h1 style=\"font-size: 16px;\">" + informasi + "</h1>");
                    out.print("<a class=\"text-right\" style=\"margin-top: 25px;\" href=\"./FormEditInformasiKKN_Admin\"><i class=\"material-icons\" style=\"size: 10px\">&#xe22b;</i> Edit Information</a>");
                    out.println("</div>\n"
                            + "            </div>\n"
                            + "        </div>\n"
                            + "        <script src=\"assets/js/jquery.min.js\"></script>\n"
                            + "        <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n"
                            + "        <script src=\"https://cdn.datatables.net/1.10.15/js/jquery.dataTables.min.js\"></script>\n"
                            + "        <script src=\"https://cdn.datatables.net/1.10.15/js/dataTables.bootstrap.min.js\"></script>\n"
                            + "        <script src=\"assets/js/Sidebar-Menu.js\"></script>");
                    out.println("</body>");
                    out.println("</html>");
                }
            } else {
                response.sendRedirect("./index.html");
            }
        } else {
            response.sendRedirect("./index.html");
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

    private String bacaInformasiKKN() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.GroupingKKNWS port = service.getGroupingKKNWSPort();
        return port.bacaInformasiKKN();
    }

}
