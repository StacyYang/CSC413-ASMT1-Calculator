package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class PowerOperator extends Operator{
    @Override
    public int precedence(){
        return 3;
    }

    @Override
    public Operand execute(Operand lhs, Operand rhs){
        int result = (int) Math.pow(lhs.getValue(), rhs.getValue());
        return new Operand(result);
    }
}
