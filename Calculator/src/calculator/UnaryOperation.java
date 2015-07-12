/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Prerna Manaktala
 */
abstract class UnaryOperation
  extends Operation
{

  @Override
  public void execute(OperationExecutor param)
  {
     this.stack = param.getOperandStack();
     this.stack.push(executeUnary(Double.valueOf(this.stack.pop())));

  }

  protected abstract double executeUnary(double paramValue);

}