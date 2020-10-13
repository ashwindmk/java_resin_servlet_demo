package com.ashwin.java;

import java.io.*;

import javax.servlet.http.*;
import javax.servlet.*;

public class HelloServlet extends HttpServlet {
    /*public static void main(String... args) {
        System.out.println("Hello world");
    }*/

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        out.println("Hello, world!");
        out.close();
    }
}
