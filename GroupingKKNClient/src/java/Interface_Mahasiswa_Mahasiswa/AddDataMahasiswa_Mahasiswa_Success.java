/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_Mahasiswa_Mahasiswa;

import Interface_Mahasiswa_Admin.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author greg
 */
@WebServlet(name = "AddDataMahasiswa_Mahasiswa_Success", urlPatterns = {"/AddDataMahasiswa_Mahasiswa_Success"})
public class AddDataMahasiswa_Mahasiswa_Success extends HttpServlet {

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
            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<meta charset=\"utf-8\">\n"
                        + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n"
                        + "        <title>Sistem Pembagian Kelompok KKN</title>\n"
                        + "        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n"
                        + "        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Amarante\">\n"
                        + "        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Arima+Madurai\">\n"
                        + "        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto\">\n"
                        + "        <link rel=\"stylesheet\" href=\"assets/css/Data-Table-1.css\">\n"
                        + "        <link rel=\"stylesheet\" href=\"assets/css/Data-Table.css\">\n"
                        + "        <link rel=\"stylesheet\" href=\"assets/css/header.css\">\n"
                        + "        <link rel=\"stylesheet\" href=\"assets/css/header1.css\">\n"
                        + "        <link rel=\"stylesheet\" href=\"assets/css/header2.css\">\n"
                        + "        <link rel=\"stylesheet\" href=\"assets/css/Highlight-Blue.css\">\n"
                        + "        <link rel=\"stylesheet\" href=\"https://cdn.datatables.net/1.10.15/css/dataTables.bootstrap.min.css\">\n"
                        + "        <link rel=\"stylesheet\" href=\"assets/css/Login-Form-Dark.css\">\n"
                        + "        <link rel=\"stylesheet\" href=\"assets/css/Pretty-Registration-Form.css\">\n"
                        + "        <link rel=\"stylesheet\" href=\"assets/css/Navigation-Menu-1.css\">\n"
                        + "        <link rel=\"stylesheet\" href=\"assets/css/Navigation-Menu.css\">\n"
                        + "        <link rel=\"stylesheet\" href=\"assets/css/Navigation-with-Search.css\">\n"
                        + "        <link rel=\"stylesheet\" href=\"assets/css/Sidebar-Menu.css\">\n"
                        + "        <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n"
                        + "        <link rel=\"stylesheet\" href=\"assets/css/untitled.css\">");
                out.println("</head>");
                out.println("<body>");
                out.println("<div>\n"
                        + "<div class=\"alert alert-warning beautiful\" role=\"alert\"><strong>Success!</strong> Data successfully inserted.</div>"
                        + "            <div class=\"text-left\" id=\"sidebar-wrapper\" style=\"height: 100%;margin: 0px;padding: 0px;margin-left: -250px;margin-top: -30px;\">\n"
                        + "                <a href=\"./HalamanUtama_Mahasiswa\"><img src=\"assets/img/logousd.png\" style=\"width: 130px;height: 130px;margin-top: 25px;margin-left: 55px;\"></a>\n"
                        + "                <h1 class=\"text-center\" style=\"color: rgb(255,255,255);font-size: 20px;margin-top: 20px;\">\n"
                        + "                    <strong>SISTEM PEMBAGIAN KELOMPOK KKN</strong>\n"
                        + "                </h1>\n"
                        + "                <h1 class=\"text-center\" style=\"color: rgb(255,255,255);font-size: 60px;margin-top: -55px;line-height: 72px;\">\n"
                        + "                    <strong>________</strong>\n"
                        + "                </h1>\n"
                        + "                <ul class=\"sidebar-nav\" style=\"color: rgb(255,255,255);padding: -36px;margin-top: 252px;width: 250px;height: 300px;\">\n"
                        + "                    <li><a href=\"./HalamanUtama_Mahasiswa\">Home</a>\n"
                        + "                    </li>\n"
                        + "                    <li class=\"text-center\" style=\"font-size: 16px;\"><strong>Manage Data Mahasiswa</strong>\n"
                        + "                    </li>\n"
                        + "                    <li><a href=\"./AddDataMahasiswa_Mahasiswa\">Add Data Mahasiswa</a>\n"
                        + "                    </li>\n"
                        + "                    <li> <a href=\"./ViewGroupKKN_Mahasiswa\">View Group KKN</a>\n"
                        + "                    </li>\n"
                        + "                </ul>\n"
                        + "            </div>\n"
                        + "            <h1 class=\"text-right\" style=\"font-size: 20px;margin-top: 30px;margin-bottom: 20px;margin-right: 30px;filter: brightness(100%);\">\n"
                        + "                <span style=\"text-decoration: underline;\">Mahasiswa Page</span>\n"
                        + "            </h1>\n"
                        + "            <a href=\"./Logout\" style=\"position: absolute;right: 30px;top: 60px;\">Logout</a></div>");
                out.println("<form action=\"./AddDataMahasiswa\" method=\"post\">\n"
                        + "            <div>\n"
                        + "                <div>\n"
                        + "                    <h1 class=\"text-center\" style=\"margin-top: 20px;padding-right: 0px;font-size: 20px;margin-bottom: 0px;padding-left: 215px;\">ADD DATA MAHASISWA</h1>\n"
                        + "                    <div style=\"margin-left: 350px;margin-top: 30px;\">\n"
                        + "                        <table class=\"table\">\n"
                        + "                            <tbody>\n"
                        + "                                <tr>\n"
                        + "                                    <td style=\"width:151px;\">NIM</td>\n"
                        + "                                    <td>\n"
                        + "                                        <input class=\"border rounded-0\" type=\"number\" style=\"width: 300px;\" name=\"nim\" required=\"\" readonly=\"readonly\" value=\"" + username + "\">\n"
                        + "                                    </td>\n"
                        + "                                </tr>\n"
                        + "                                <tr>\n"
                        + "                                    <td>Nama</td>\n"
                        + "                                    <td>\n"
                        + "                                        <input class=\"border rounded-0\" type=\"text\" style=\"width: 600px;\" name=\"nama\" required=\"\">\n"
                        + "                                    </td>\n"
                        + "                                </tr>\n"
                        + "                                <tr>\n"
                        + "                                    <td>Jenis Kelamin</td>\n"
                        + "                                    <td>\n"
                        + "                                        <div class=\"custom-control custom-radio\">\n"
                        + "                                            <input class=\"custom-control-input\" name=\"jenisKelamin\" type=\"radio\" id=\"formCheck-1\" value=\"Laki-Laki\" required=\"\">\n"
                        + "                                            <label class=\"custom-control-label\" for=\"formCheck-1\">Laki-laki</label>\n"
                        + "                                        </div>\n"
                        + "                                        <div class=\"custom-control custom-radio\">\n"
                        + "                                            <input class=\"custom-control-input\" name=\"jenisKelamin\" type=\"radio\" id=\"formCheck-2\" value=\"Perempuan\" required=\"\">\n"
                        + "                                            <label class=\"custom-control-label\" for=\"formCheck-2\">Perempuan</label>\n"
                        + "                                        </div>\n"
                        + "                                    </td>\n"
                        + "                                </tr>\n"
                        + "                                <tr>\n"
                        + "                                    <td>Tanggal Lahir</td>\n"
                        + "                                    <td>\n"
                        + "                                        <input class=\"border rounded-0\" type=\"date\" required=\"\" name=\"tanggalLahir\" required=\"\">\n"
                        + "                                    </td>\n"
                        + "                                </tr>\n"
                        + "                                <tr>\n"
                        + "                                    <td>Prodi</td>\n"
                        + "                                    <td>\n"
                        + "                                        <div class=\"dropdown\">\n"
                        + "                                            <select class=\"border rounded-0 \" name=\"prodi\" required=\"\">\n"
                        + "                                                <option>--Program Studi--</option>\n"
                        + "                                                <option value=\"Akutansi\">Akuntansi</option>\n"
                        + "                                                <option value=\"Ekonomi\">Ekonomi</option>\n"
                        + "                                                <option value=\"Manajemen\">Manajemen</option>\n"
                        + "                                                <option value=\"Farmasi\">Farmasi</option>\n"
                        + "                                                <option value=\"Bimbingan dan Konseling\">Bimbingan dan Konseling\n"
                        + "                                                <br>\n"
                        + "                                                </option>\n"
                        + "                                                <option value=\"Pendidikan Bahasa dan Sastra Indonesia\">Pendidikan Bahasa dan Sastra Indonesia\n"
                        + "                                                <br>\n"
                        + "                                                </option>\n"
                        + "                                                <option value=\"Pendidikan Bahasa Inggris\">Pendidikan Bahasa Inggris\n"
                        + "                                                <br>\n"
                        + "                                                </option>\n"
                        + "                                                <option value=\"Pendidikan Biologi\">Pendidikan Biologi\n"
                        + "                                                <br>\n"
                        + "                                                </option>\n"
                        + "                                                <option value=\"Pendidikan Ekonomi Bidang Keahlian Khusus Pendidikan Akuntansi\">Pendidikan Ekonomi Bidang Keahlian Khusus Pendidikan Akuntansi\n"
                        + "                                                <br>\n"
                        + "                                                </option>\n"
                        + "                                                <option value=\"Pendidikan Ekonomi Bidang Keahlian Khusus Pendidikan Ekonomi\">Pendidikan Ekonomi Bidang Keahlian Khusus Pendidikan Ekonomi\n"
                        + "                                                <br>\n"
                        + "                                                </option>\n"
                        + "                                                <option value=\"Pendidikan Fisika\">Pendidikan Fisika\n"
                        + "                                                <br>\n"
                        + "                                                </option>\n"
                        + "                                                <option value=\"Pendidikan Guru Sekolah Dasar\">Pendidikan Guru Sekolah Dasar\n"
                        + "                                                <br>\n"
                        + "                                                </option>\n"
                        + "                                                <option value=\"endidikan Keagamaan Katolik\">Pendidikan Keagamaan Katolik\n"
                        + "                                                <br>\n"
                        + "                                                </option>\n"
                        + "                                                <option value=\"Pendidikan Kimia\">Pendidikan Kimia\n"
                        + "                                                <br>\n"
                        + "                                                </option>\n"
                        + "                                                <option value=\"Pendidikan Matematika\">Pendidikan Matematika\n"
                        + "                                                <br>\n"
                        + "                                                </option>\n"
                        + "                                                <option value=\"Pendidikan Sejarah\">Pendidikan Sejarah\n"
                        + "                                                <br>\n"
                        + "                                                </option>\n"
                        + "                                                <option value=\"Psikologi\">Psikologi\n"
                        + "                                                <br>\n"
                        + "                                                </option>\n"
                        + "                                                <option value=\"Informatika\">Informatika\n"
                        + "                                                <br>\n"
                        + "                                                </option>\n"
                        + "                                                <option value=\"Matematika\">Matematika</option>\n"
                        + "                                                <option value=\"Teknik Elektro\">Teknik Elektro</option>\n"
                        + "                                                <option value=\"Teknik Mesin\">Teknik Mesin</option>\n"
                        + "                                                <option value=\"Sastra Indonesia\">Sastra Indonesia</option>\n"
                        + "                                                <option value=\"Sastra Inggris\">Sastra Inggris</option>\n"
                        + "                                                <option value=\"Sejarah\">Sejarah</option>\n"
                        + "                                                <option value=\"Filsafat Keilahian Program Sarjana\">Filsafat Keilahian Program Sarjana\n"
                        + "                                                <br>\n"
                        + "                                                </option>\n"
                        + "                                            </select>\n"
                        + "                                        </div>\n"
                        + "                                    </td>\n"
                        + "                                </tr>\n"
                        + "                                <tr>\n"
                        + "                                    <td>Fakultas</td>\n"
                        + "                                    <td>\n"
                        + "                                        <div class=\"dropdown\">\n"
                        + "                                            <select class=\"border rounded-0 \" name=\"fakultas\" required=\"\">\n"
                        + "                                                <option>--Fakultas--</option>\n"
                        + "                                                <option value=\"Ekonomi\">Ekonomi</option>\n"
                        + "                                                <option value=\"Farmasi\">Farmasi</option>\n"
                        + "                                                <option value=\"Keguruan dan Ilmu Pendidikan\">Keguruan dan Ilmu Pendidikan</option>\n"
                        + "                                                <option value=\"Psikologi\">Psikologi</option>\n"
                        + "                                                <option value=\"Sains dan Teknologi\">Sains dan Teknologi</option>\n"
                        + "                                                <option value=\"Sastra\">Sastra</option>\n"
                        + "                                                <option value=\"Teologi\">Teologi</option>\n"
                        + "                                            </select>\n"
                        + "                                        </div>\n"
                        + "                                    </td>\n"
                        + "                                </tr>\n"
                        + "                                <tr>\n"
                        + "                                    <td>Agama</td>\n"
                        + "                                    <td>\n"
                        + "                                        <div class=\"dropdown\">\n"
                        + "                                            <select class=\"border rounded-0 \" name=\"agama\" required=\"\">\n"
                        + "                                                <option>--Agama--</option>\n"
                        + "                                                <option value=\"Islam\">Islam</option>\n"
                        + "                                                <option value=\"Kristen\">Kristen</option>\n"
                        + "                                                <option value=\"Katolik\">Katolik</option>\n"
                        + "                                                <option value=\"Hindu\">Hindu</option>\n"
                        + "                                                <option value=\"Budha\">Budha</option>\n"
                        + "                                                <option value=\"Khonghucu\">Khonghucu</option>\n"
                        + "                                            </select>\n"
                        + "                                        </div>\n"
                        + "\n"
                        + "                                    </td>\n"
                        + "                                </tr>\n"
                        + "                                <tr>\n"
                        + "                                    <td>Total SKS</td>\n"
                        + "                                    <td>\n"
                        + "                                        <input class=\"border rounded-0\" type=\"number\" name=\"totalSks\" style=\"width: 70px;\" required=\"\">\n"
                        + "                                    </td>\n"
                        + "                                </tr>\n"
                        + "                                <tr>\n"
                        + "                                    <td>Email</td>\n"
                        + "                                    <td>\n"
                        + "                                        <input class=\"border rounded-0\" type=\"text\" name=\"email\" style=\"width: 400px;\" required=\"\">\n"
                        + "                                    </td>\n"
                        + "                                </tr>\n"
                        + "                                <tr>\n"
                        + "                                    <td>Tingkatan Penyakit</td>\n"
                        + "                                    <td>\n"
                        + "                                        <div class=\"custom-control custom-radio\">\n"
                        + "                                            <input name=\"tingkatanPenyakit\" value=\"1\" class=\"custom-control-input\" type=\"radio\" id=\"formCheck-3\" required=\"\">\n"
                        + "                                            <label class=\"custom-control-label\" for=\"formCheck-3\">Grade 1</label><small> (Untuk penyakit berat, misal : disabilitas, epilepsi, dll.)</small>\n"
                        + "                                        </div>\n"
                        + "                                        <div class=\"custom-control custom-radio\">\n"
                        + "                                            <input name=\"tingkatanPenyakit\" value=\"2\" class=\"custom-control-input\" type=\"radio\" id=\"formCheck-4\" required=\"\">\n"
                        + "                                            <label class=\"custom-control-label\" for=\"formCheck-4\">Grade 2</label><small> (Untuk penyakit sedang, misal : asma, maag, dll.)</small>\n"
                        + "                                        </div>\n"
                        + "                                        <div class=\"custom-control custom-radio\">\n"
                        + "                                            <input name=\"tingkatanPenyakit\" value=\"3\" class=\"custom-control-input\" type=\"radio\" id=\"formCheck-5\" required=\"\">\n"
                        + "                                            <label class=\"custom-control-label\" for=\"formCheck-5\">Grade 3</label><small> (Untuk penyakit ringan, misal : batuk, pilek, dll.)</small>\n"
                        + "                                        </div>\n"
                        + "                                        <div class=\"custom-control custom-radio\">\n"
                        + "                                            <input name=\"tingkatanPenyakit\" value=\"0\" class=\"custom-control-input\" type=\"radio\" id=\"formCheck-6\" required=\"\">\n"
                        + "                                            <label class=\"custom-control-label\" for=\"formCheck-6\">Tidak ada</label>\n"
                        + "                                        </div>\n"
                        + "                                    </td>\n"
                        + "                                </tr>\n"
                        + "                                <tr>\n"
                        + "                                    <td>Golongan Darah</td>\n"
                        + "                                    <td>\n"
                        + "                                        <div class=\"custom-control custom-radio\">\n"
                        + "                                            <input name=\"golonganDarah\" value=\"A\" class=\"custom-control-input\" type=\"radio\" id=\"formCheck-7\" required=\"\">\n"
                        + "                                            <label class=\"custom-control-label\" for=\"formCheck-7\">A</label>\n"
                        + "                                        </div>\n"
                        + "                                        <div class=\"custom-control custom-radio\">\n"
                        + "                                            <input name=\"golonganDarah\" value=\"B\" class=\"custom-control-input\" type=\"radio\" id=\"formCheck-8\" required=\"\">\n"
                        + "                                            <label class=\"custom-control-label\" for=\"formCheck-8\">B</label>\n"
                        + "                                        </div>\n"
                        + "                                        <div class=\"custom-control custom-radio\">\n"
                        + "                                            <input name=\"golonganDarah\" value=\"O\" class=\"custom-control-input\" type=\"radio\" id=\"formCheck-9\" required=\"\">\n"
                        + "                                            <label class=\"custom-control-label\" for=\"formCheck-9\">O</label>\n"
                        + "                                        </div>\n"
                        + "                                        <div class=\"custom-control custom-radio\">\n"
                        + "                                            <input name=\"golonganDarah\" value=\"AB\" class=\"custom-control-input\" type=\"radio\" id=\"formCheck-10\" required=\"\">\n"
                        + "                                            <label class=\"custom-control-label\" for=\"formCheck-10\">AB</label>\n"
                        + "                                        </div>\n"
                        + "                                    </td>\n"
                        + "                                </tr>\n"
                        + "                                <tr>\n"
                        + "                                    <td>Tinggi Badan</td>\n"
                        + "                                    <td>\n"
                        + "                                        <input class=\"border rounded-0\" type=\"number\" name=\"tinggiBadan\" style=\"width: 70px;\" required=\"\">\n"
                        + "                                        <label style=\"margin-left: 10px\">CM</label>\n"
                        + "                                    </td>\n"
                        + "                                </tr>\n"
                        + "                                <tr>\n"
                        + "                                    <td>Berat Badan</td>\n"
                        + "                                    <td>\n"
                        + "                                        <input class=\"border rounded-0\" type=\"number\" name=\"beratBadan\" style=\"width: 70px;\" required=\"\">\n"
                        + "                                        <label style=\"margin-left: 10px\">KG</label>\n"
                        + "                                    </td>\n"
                        + "                                </tr>\n"
                        + "                                <tr>\n"
                        + "                                    <td>Alamat di Yogyakarta</td>\n"
                        + "                                    <td>\n"
                        + "                                        <input class=\"border rounded-0\" name=\"alamat\" type=\"text\" style=\"width: 600px;\" required=\"\">\n"
                        + "                                    </td>\n"
                        + "                                </tr>\n"
                        + "                                <tr>\n"
                        + "                                    <td>Nomor HP</td>\n"
                        + "                                    <td>\n"
                        + "                                        <input class=\"border rounded-0\" name=\"noHP\" type=\"number\" style=\"width: 300px;\" required=\"\">\n"
                        + "                                    </td>\n"
                        + "                                </tr>\n"
                        + "                            </tbody>\n"
                        + "                        </table>\n"
                        + "                    </div>\n"
                        + "                    <button class=\"btn btn-primary\" type=\"submit\" style=\"margin-left: 700px;margin-bottom: 50px;margin-top: 10px;width: 95px;height: 40px;\">Submit</button>\n"
                        + "                </div>\n"
                        + "            </div>\n"
                        + "        </form>");
                out.println("<script src=\"assets/js/jquery.min.js\"></script>\n"
                        + "    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n"
                        + "    <script src=\"https://cdn.datatables.net/1.10.15/js/jquery.dataTables.min.js\"></script>\n"
                        + "    <script src=\"https://cdn.datatables.net/1.10.15/js/dataTables.bootstrap.min.js\"></script>\n"
                        + "    <script src=\"assets/js/Sidebar-Menu.js\"></script>");
                out.println("</body>");
                out.println("</html>");
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

}
