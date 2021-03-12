package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import com.google.gson.Gson;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    ArrayList<String> AList = new ArrayList<String>();
    AList.add("Hello World!");
    AList.add("How are you?");
    AList.add("How's it going?");

    Gson gson = new Gson();
    String json = gson.toJson(AList);

    response.setContentType("application/json;");
    response.getWriter().println(json);
  }
}
