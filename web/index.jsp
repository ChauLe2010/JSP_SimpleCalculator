<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/1/2020
  Time: 9:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Simple Calculator</title>
  </head>
  <body>
  <h1>Simple Calculator</h1>
  <form action="/calculate" method="post">
    <fieldset>
      <legend>Calculator</legend>
      <table>
        <tr>
          <td>First Operand:</td>
          <td><input type="number" name="firstOperand"></td>
        </tr>
        <tr>
          <td>Operator: </td>
          <td>
            <select name="operator">
              <option value="+">+</option>
              <option value="-">-</option>
              <option value="*">*</option>
              <option value="/">/</option>
            </select>
          </td>
        </tr>
        <tr>
          <td>Second Operand: </td>
          <td><input type="number" name="secondOperand"></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><input type="submit" value="Calculate"></td>
        </tr>
      </table>
    </fieldset>
  </form>
  </body>
</html>
