/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_Group;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import webservices.GroupingKKNWS_Service;
import webservices.Kelompok;

/**
 *
 * @author greg
 */
@WebServlet(name = "AddDataGroup", urlPatterns = {"/AddDataGroup"})
public class AddDataGroup extends HttpServlet {

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
        String idKelompok = request.getParameter("idKelompok");
        String tingkatanDaerah = request.getParameter("tingkatanDaerah");
        String pedukuhan = request.getParameter("pedukuhan");
        String desa = request.getParameter("desa");
        String kecamatan = request.getParameter("kecamatan");
        String kabupaten = request.getParameter("kabupaten");
        String provinsi = request.getParameter("provinsi");

        Kelompok kelompok = new Kelompok();
        kelompok.setIdKelompok(idKelompok);
        kelompok.setTingkatanDaerah(tingkatanDaerah);
        kelompok.setPedukuhan(pedukuhan);
        kelompok.setDesa(desa);
        kelompok.setKecamatan(kecamatan);
        kelompok.setKabupaten(kabupaten);
        kelompok.setProvinsi(provinsi);
        addDataGroup(kelompok);
        response.sendRedirect("./AddDataGroup_Admin_Success.html");
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

    private void addDataGroup(webservices.Kelompok kelompok) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.GroupingKKNWS port = service.getGroupingKKNWSPort();
        port.addDataGroup(kelompok);
    }

}
