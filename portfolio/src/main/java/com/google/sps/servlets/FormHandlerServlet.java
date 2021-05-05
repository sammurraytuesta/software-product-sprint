package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String nameValue = request.getParameter("name");
    String emailValue = request.getParameter("email");
    String message = request.getParameter("message");

    // Print the value so you can see it in the server logs.
    System.out.println("name: " + nameValue);
    System.out.println("email: " + emailValue);
    System.out.println("message: " + message);

    // Write the value to the response so the user can see it.
    response.getWriter().println("Hi " + nameValue);
    response.getWriter().println("This is the email you submitted: " + emailValue);
    response.getWriter().println("Thank you for your response!");
    
  }
}
