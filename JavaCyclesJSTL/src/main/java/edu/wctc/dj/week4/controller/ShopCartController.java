package edu.wctc.dj.week4.controller;

import edu.wctc.dj.week4.model.LineItem;
import edu.wctc.dj.week4.model.Product;
import edu.wctc.dj.week4.model.ProductService;
import edu.wctc.dj.week4.model.ShoppingCart;
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
public class ShopCartController extends HttpServlet {

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
            out.println("<title>Servlet ShopCartController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ShopCartController at " + request.getContextPath() + "</h1>");
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
        
        ShoppingCart sc = new ShoppingCart("1");
        ProductService ps = new ProductService();
//        BikeService bikeService = new BikeService();
        RequestDispatcher dispatcher = null;
        
        sc.addLineItem(ps.getProduct("1"), 1);
        sc.addLineItem(ps.getProduct("4"), 2);
//        
        String cart = request.getParameter("cart");
//        String search = request.getParameter("search");
//        
        if (cart != null) {
            List<LineItem> productList = sc.getLineItemArrayList();
            request.setAttribute("cart", cart);
            dispatcher = request.getRequestDispatcher("/shoppingCart.jsp");
            // go to shoppingCart.jsp
        } 
////        else if (search != null) {
////            List<Name> nameList = nameService.findNames(search);
////            request.setAttribute("nameList", nameList);
////            dispatcher = request.getRequestDispatcher("/nameList.jsp");
////            // go to nameList.jsp
////        } 
        else {
            List<LineItem> productList = sc.getLineItemArrayList();
            request.setAttribute("cart", productList);
            dispatcher = request.getRequestDispatcher("/shoppingCart.jsp");
            // go to shoppingCart.jsp
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
