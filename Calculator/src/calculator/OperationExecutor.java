/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.List;
import java.util.Stack;

/**
 *
 * @author Prerna Manaktala
 * @param <Double>
 */
class OperationExecutor
{
  private final Stack<Double> operandStack;
  private final Stack<String> operatorStack;
  private List<String> operators;
  private Double result;
  private String inputString;

  public void setInputString(String inputString)
  {
    this.inputString = inputString;
  }

  public Double getResult()
  {
    execute();
    return result;
  }

  public void setOperators(List<String> operators)
  {
    this.operators = operators;
  }

  public OperationExecutor()
  {
    this.operandStack = new Stack<>();
    this.operatorStack = new Stack<>();
  }

  private void execute()
  {
    for (int i = 0; i < inputString.length(); i++) {
      String input = inputString.charAt(i) + "";
      if (!operators.contains(input)) {
        operandStack.push(Double.valueOf(input));
      }
      else {
        int precedence = Operation.getPrecedence(input);
        if (operatorStack.isEmpty()) {
          operatorStack.push(input);
        }
        else {
          int prevPrecedence = Operation.getPrecedence(operatorStack.peek());
          if (precedence <= prevPrecedence) {
            String op = operatorStack.pop();
            evaluateOp(op);
            operatorStack.push(input);
          }
          else {
            operatorStack.push(input);
          }

        }
      }
    }
    while (!operandStack.isEmpty() && !operatorStack.isEmpty()) {
      evaluateOp(operatorStack.pop());
    }
    result = operandStack.pop();

  }

  public Stack<Double> getOperandStack()
  {
    System.out.println("stack is" + operandStack.peek());
    return this.operandStack;
  }

  private void evaluateOp(String op)
  {

    switch (op) {
      case "+":
        Add add = new Add();
        add.execute(this);
        break;
      case "-":
        Subtract sub = new Subtract();
        sub.execute(this);
        break;
      case "*":
        Multiply mul = new Multiply();
        mul.execute(this);
        break;
      case "/":
        Divide div = new Divide();
        div.execute(this);
        break;
      default:
        throw new RuntimeException("This operation is not supported");
    }
  }

}
