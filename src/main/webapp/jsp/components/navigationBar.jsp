<%@ page import="java.util.Random"%> 
<%@ page import="javax.servlet.http.HttpSession"%>


<nav class="navbar navbar-fixed-top navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">

          <a class="navbar-brand active firstblob" href="intro">H�meen Election Machine 2021</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav blob">

           <%  
           session = request.getSession(false);
           if (session.getAttribute("role") == null) {
        	   out.print("<li class='nav-item'>");
        	   out.print("<a class='nav-link' aria-current='page' href='login'><i class='fas fa-sign-in-alt'></i>Log in </a>");
        	   out.print("</li>");
        	   
           } else if (session.getAttribute("role").equals("interviewer")) {
        	   out.print("<li class='nav-item'>");
        	   out.print("<a class='nav-link' href='statistics_servlet'><i class='fab fa-slack-hash'></i>Statistics</a>");
        	   out.print("</li>");
        	   out.print("<li class='nav-item'>");
        	   out.print("<a class='nav-link' href='dashboard'><i class='fab fa-slack-hash'></i>Profile</a>");
        	   out.print("</li>");
        	   out.print("<li class='nav-item'>");
        	   //out.print("<form id='signoutblob' action='logingout' method ='POST'>");
        	   out.print("<a class='nav-link' href='logingout'><i class='fas fa-sign-out-alt'></i>Sign out </a>");
        	  // out.print("</form>");
        	   out.print("</li>");
           } else  {
        	   out.print("<li class='nav-item'>");
        	   out.print("<a class='nav-link' href='dashboard'><i class='fab fa-slack-hash'></i>Profile</a>");
        	   out.print("</li>");
        	   out.print("<li class='nav-item'>");
        	   //out.print("<form id='signoutblob' action='logingout' method ='POST'>");
        	   out.print("<a class='nav-link' href='logingout'><i class='fas fa-sign-out-alt'></i>Sign out </a>");
        	  // out.print("</form>");
        	   out.print("</li>");
        	   
           }
           
          
           %> 

              
            </ul>
          </div>
        </div>
      </nav>
      
      
      