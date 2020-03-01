import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet",urlPatterns = "/calculate")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float firstOperand=Float.parseFloat(request.getParameter("firstOperand"));
        float secondOperand=Float.parseFloat(request.getParameter("secondOperand"));
        Character operator=request.getParameter("operator").charAt(0);
        Calculator calculator=new Calculator();

        PrintWriter printWriter=response.getWriter();

        try{
            float result=calculator.calculate(firstOperand,secondOperand,operator);
            printWriter.println("<h1>"+firstOperand+" "+operator+" "+secondOperand+" = "+result);

        }catch(RuntimeException ex){
            printWriter.println("Error "+ex.getMessage());
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
