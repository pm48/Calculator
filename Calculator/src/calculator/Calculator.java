/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Prerna Manaktala
 */
class Calculator
{

  /**
   * @param args the command line arguments
   */
  public static void main(String args[])
  {
    Calculator calci = new Calculator();
    System.out.println("Output of calculator is " + calci.calculate(args[0]));

  }

  private double calculate(String paramString)
  {
    OperationExecutor executor = new OperationExecutor();
    List<String> operators = new ArrayList<String>();
    operators.add("+");
    operators.add("-");
    operators.add("*");
    operators.add("/");
    executor.setOperators(operators);
    executor.setInputString(paramString);
    return executor.getResult();
  }

}
