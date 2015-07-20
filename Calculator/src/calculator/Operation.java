/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.HashMap;
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
  protected Stack<Double> stack;

  protected boolean getLookahead()
  {
    return lookahead;
  }

  /**
   * @param executor
   */
  protected abstract void execute(OperationExecutor executor);

}
