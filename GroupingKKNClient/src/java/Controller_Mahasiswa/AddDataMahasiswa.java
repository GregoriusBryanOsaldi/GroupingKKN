/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_Mahasiswa;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;
import webservices.GroupingKKNWS_Service;
import webservices.Mahasiswa;

/**
 *
 * @author greg
 */
@WebServlet(name = "AddDataMahasiswa", urlPatterns = {"/AddDataMahasiswa"})
public class AddDataMahasiswa extends HttpServlet {

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
        String username = (String) session.getAttribute("username");
        String usernameTemp = username.substring(0, 2);

        String nim = request.getParameter("nim");
        String nama = request.getParameter("nama");
        String jenis_kelamin = request.getParameter("jenisKelamin");
        String tanggalLahir = request.getParameter("tanggalLahir");
        String tahun = tanggalLahir.substring(0, 4);
        String bulan = tanggalLahir.substring(5, 7);
        String tanggal = tanggalLahir.substring(8, 10);
        String tanggalLahirFix = tanggal + "/" + bulan + "/" + tahun;
        String prodi = request.getParameter("prodi");
        String fakultas = request.getParameter("fakultas");
        String agama = request.getParameter("agama");
        String totalSks = request.getParameter("totalSks");
        String email = request.getParameter("email");
        String tingkatanPenyakit = request.getParameter("tingkatanPenyakit");
        String golonganDarah = request.getParameter("golonganDarah");
        String tinggiBadan = request.getParameter("tinggiBadan");
        String beratBadan = request.getParameter("beratBadan");
        String alamat = request.getParameter("alamat");
        String noHP = request.getParameter("noHP");

        Mahasiswa mhs = new Mahasiswa();
        mhs.setNim(nim);
        mhs.setNama(nama);
        mhs.setJenisKelamin(jenis_kelamin);
        mhs.setTanggalLahir(tanggalLahirFix);
        mhs.setProdi(prodi);
        mhs.setFakultas(fakultas);
        mhs.setAgama(agama);
        mhs.setTotalSks(totalSks);
        mhs.setEmail(email);
        mhs.setTingkatanPenyakit(tingkatanPenyakit);
        mhs.setGolonganDarah(golonganDarah);
        mhs.setTinggiBadan(tinggiBadan);
        mhs.setBeratBadan(beratBadan);
        mhs.setAlamat(alamat);
        mhs.setNoHP(noHP);

        addDataMahasiswa(mhs);
        if (usernameTemp.equals("P.")) {
            response.sendRedirect("./AddDataMahasiswa_Admin_Success.html");
        } else {
            response.sendRedirect("./AddDataMahasiswa_Mahasiswa_Success");
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

    private void addDataMahasiswa(webservices.Mahasiswa mahasiswa) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.GroupingKKNWS port = service.getGroupingKKNWSPort();
        port.addDataMahasiswa(mahasiswa);
    }

}
