<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>Insert title here</title>

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>

        
        <style>
.footer {
    position: fixed;
    bottom: 0;
    width:100%;
    height: 40px;
    background-color: tomato;
}

</style>


    <body>
        
        <header>
 <nav class="navbar navbar-expand-md navbar-dark"
  style="background-color: tomato">
  <div>
   <a href="https://www.javaguides.net" class="navbar-brand"> Todo App</a>
  </div>

  <ul class="navbar-nav navbar-collapse justify-content-end">
   <li><a href="login" class="nav-link">Login</a></li>
   <li><a href="register" class="nav-link">Signup</a></li>
  </ul>
 </nav>
</header>
        <div class="container">

            <h2>User Register Form</h2>
            <div class="col-md-6 col-md-offset-3">
             <div class="alert alert-success center" role="alert">
                    <p>${NOTIFICATION}</p>
                </div>
                <form action="register" method="post">

                    <div class="form-group">
                        <label for="uname">First Name:</label> <input type="text" class="form-control" id="uname" placeholder="First Name" name="firstname" required>
                    </div>

                    <div class="form-group">
                        <label for="uname">Last Name:</label> <input type="text" class="form-control" id="uname" placeholder="last Name" name="lastname" required>
                    </div>

                    <div class="form-group">
                        <label for="uname">User Name:</label> <input type="text" class="form-control" id="username" placeholder="User Name" name="username" required>
                    </div>

                    <div class="form-group">
                        <label for="uname">Password:</label> <input type="password" class="form-control" id="password" placeholder="Password" name="password" required>
                    </div>

                    <button type="submit" class="btn btn-primary">Submit</button>

                </form>
            </div>
        </div>

<footer class="footer font-small black">
    <!-- Copyright -->
  <div class="footer-copyright text-center py-3" style="color: white">© 2019 Copyright:
        <a href="https://www.javaguides.net/" > <strong> Java Guides </strong></a>
      </div>
</footer>
     
    </body>

    </html>