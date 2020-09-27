package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.EvaluatorUI;
import edu.csc413.calculator.evaluator.Operand;

import javax.swing.*;

public class DivideOperator extends Operator{
    @Override
    public int precedence(){
        return 2;
    }

    @Override
    public Operand execute(Operand lhs, Operand rhs){
        Operand result = null;
        try {
            result = new Operand(lhs.getValue() / rhs.getValue());
        }catch(ArithmeticException e){
            System.err.println("Hey, Error: can't divide by 0!!!");
        }
        return result;
    }
}
