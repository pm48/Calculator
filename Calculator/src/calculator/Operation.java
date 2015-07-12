/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Stack;

/**
 *
 * @author Prerna Manaktala
 */
abstract class Operation
{
  private static int precedence;
  //To check for binary/unary operations
  protected boolean lookahead;
  protected OperationExecutor executor;
  protected Stack<Double> stack;

  public static int getPrecedence(String input)
  {
    switch(input)
    {
      case "+":
        precedence = 1;
        break;
      case "-":
        precedence = 1;
        break;
      case "*":
        precedence = 2;
        break;
      case "/":
        precedence = 2;
        break;
      default:
        throw new RuntimeException("This operation is not supported");
    }
    return precedence;
  }

  protected boolean getLookahead()
  {
    return lookahead;
  }

  /**
   * @param executor
   */
  protected abstract void execute(OperationExecutor executor);

}
