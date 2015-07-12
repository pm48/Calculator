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
 abstract class AbstractBinaryOperation extends Operation
{

  public AbstractBinaryOperation()
  {
    this.lookahead = true;
  }

  @Override
  public  void execute(OperationExecutor param)
  {
    this.stack = param.getOperandStack();
    double localValue2 = this.stack.pop();
    double localValue1 = this.stack.pop();
    this.stack.push(executeBinary(localValue1, localValue2));
  }

  protected abstract double executeBinary(double paramValue1, double paramValue2);
}
