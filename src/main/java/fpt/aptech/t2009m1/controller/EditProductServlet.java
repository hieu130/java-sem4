//package fpt.aptech.t2009m1.controller;
//
//import fpt.aptech.t2009m1.entity.Product;
//import fpt.aptech.t2009m1.model.MySqlProductModel;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//public class UpdateProductServlet extends HttpServlet {
//    private MySqlProductModel mySqlProductModel;
//
//    @Override
//    public void init() throws ServletException {
//        mySqlProductModel = new MySqlProductModel();
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        int id = Integer.parseInt(req.getParameter("id"));
//        Product product = mySqlProductModel.findById(id);
//        req.setAttribute("product",product);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("UTF-8");
//        resp.setContentType("text/html; chartset=UTF-8");
//        resp.setCharacterEncoding("UTF-8");
//        int id = Integer.parseInt(req.getParameter("id"));
//        String name = req.getParameter("name");
//        String description = req.getParameter("description");
//        String detail = req.getParameter("detail");
//        Double price = Double.parseDouble(req.getParameter("price"));
//        String thumbnail = req.getParameter("thumbnail");
//        String manufactureEmail = req.getParameter("manufactureEmail");
//        String manufacturePhone = req.getParameter("manufacturePhone");
//        Product product = new Product(name, description,detail, price,  thumbnail, manufactureEmail, manufacturePhone);
//        if(mySqlProductModel.update(id, product)) {
//            resp.sendRedirect("");
//        }else {
//            req.setAttribute("errors", product.getErrors());
//            req.setAttribute("product", product);
//            req.getRequestDispatcher("/product/list.jsp").forward(req,resp);
//        }
//
//    }
//}
