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
class SquareRoot extends UnaryOperation
{

  @Override
  protected double executeUnary(double paramValue)
  {
    return Math.sqrt(paramValue);
  }
}
