/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.HashMap;

/**
 *
 * @author Prerna Manaktala
 */
class OperationFactory
{
  static final HashMap<String,AbstractBinaryOperation> commandMap = new HashMap<>();
  static final HashMap<String,Integer> precedenceMap = new HashMap<>();
  static{
    commandMap.put("+", new Add());
    commandMap.put("-", new Subtract());
    commandMap.put("*", new Multiply());
    commandMap.put("/", new Divide());
  }

  static{
    precedenceMap.put("+", 1);
    precedenceMap.put("-", 1);
    precedenceMap.put("*", 2);
    precedenceMap.put("/", 2);
  }


}
