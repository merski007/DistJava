package edu.wctc.dj.week4.controller;

import edu.wctc.dj.week4.model.Bike;
import edu.wctc.dj.week4.model.BikeService;
import edu.wctc.dj.week4.model.Product;
import edu.wctc.dj.week4.model.ProductService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mjmersenski
 */
public class ProductController extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProductController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProductController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        ProductService productService = new ProductService();
        //BikeService bikeService = new BikeService();
        RequestDispatcher dispatcher = null;
        
        String id = request.getParameter("id");
        String type = request.getParameter("type");
        //String search = request.getParameter("search");
        
        if (id != null) {
            Product product = productService.getProduct(id);
            //Bike bike = bikeService.getBike(id);
            request.setAttribute("product", product);
            dispatcher = request.getRequestDispatcher("/productDetails.jsp");
            // go to productDetail.jsp
        } 
//        else if (search != null) {
//            List<Name> nameList = nameService.findNames(search);
//            request.setAttribute("nameList", nameList);
//            dispatcher = request.getRequestDispatcher("/nameList.jsp");
//            // go to nameList.jsp
//        } 
        else if (type != null) {
            List<Product> productList = productService.getAllLikeProducts(type);
            request.setAttribute("productList", productList);
            dispatcher = request.getRequestDispatcher("/products.jsp");
        }
        else {
            List<Product> productList = productService.getAllProducts();
            request.setAttribute("productList", productList);
            dispatcher = request.getRequestDispatcher("/products.jsp");
            // go to products.jsp
        }

        dispatcher.forward(request, response);
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
