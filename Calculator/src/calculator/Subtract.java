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
class Subtract extends AbstractBinaryOperation
{

  @Override
  protected double executeBinary(double paramValue1, double paramValue2)
  {
    return paramValue1 - paramValue2;
  }

}
