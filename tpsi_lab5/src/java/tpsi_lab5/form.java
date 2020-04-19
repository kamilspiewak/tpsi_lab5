/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsi_lab5;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "form", urlPatterns = {"/form"})
public class form extends HttpServlet {

    private void incCounter(HttpServletRequest request) {
        HttpSession session = request.getSession();

        if(session.getAttribute("licznik")==null){
            session.setAttribute("licznik",1);
        }
        else{
            int temp = (int)session.getAttribute("licznik") +1;
            session.setAttribute("licznik",temp);
        }
    }
    
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        incCounter(request);

        request.getRequestDispatcher("table.jsp").forward(request, response);
    }
    
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        incCounter(request);

        HttpSession session = request.getSession();

        List<Student> students = (List<Student>) session.getAttribute("students");
        students = (students == null ? new ArrayList<>() : students);

        String imie = request.getParameter("firstName");
        String nazwisko = request.getParameter("lastName");
        String email = request.getParameter("email");

        students.add(new Student(imie, nazwisko, email));

        session.setAttribute("students", students);

        request.getRequestDispatcher("table.jsp").forward(request, response);
    }
}
