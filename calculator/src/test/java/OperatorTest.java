import edu.csc413.calculator.evaluator.Operand;
import edu.csc413.calculator.operators.*;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OperatorTest {
    //unit tests for create method
    @Test
    public void create_test(){
        Operator addOperator = Operator.create("+");
        assertTrue(addOperator instanceof AddOperator);

        Operator subtractOperator = Operator.create("-");
        assertTrue(subtractOperator instanceof SubtractOperator);

        Operator multiplyOperator = Operator.create("*");
        assertTrue(multiplyOperator instanceof MultiplyOperator);

        Operator divideOperator = Operator.create("/");
        assertTrue(divideOperator instanceof DivideOperator);

        Operator powerOperator = Operator.create("^");
        assertTrue(powerOperator instanceof PowerOperator);
    }



    //unit tests for AddOperator class
    @Test
    public void addOperator_precedence(){
        Operator addOperator = Operator.create("+");
        assertThat(addOperator.precedence(), equalTo(1));
    }

    @Test
    public void addOperator_execute1(){
        Operator addOperator = Operator.create("+");
        Operand lhs = new Operand(8);
        Operand rhs = new Operand(9);
        Operand result = new Operand(17);
        assertThat(addOperator.execute(lhs, rhs).getValue(), equalTo(result.getValue()));
    }
    @Test
    public void addOperator_execute2(){
        Operator addOperator = Operator.create("+");
        Operand lhs = new Operand(9);
        Operand rhs = new Operand(8);
        Operand result = new Operand(17);
        assertThat(addOperator.execute(lhs, rhs).getValue(), equalTo(result.getValue()));
    }

    @Test
    public void addOperator_execute3(){
        Operator addOperator = Operator.create("+");
        Operand lhs = new Operand(8);
        Operand rhs = new Operand(-9);
        Operand result = new Operand(-1);
        assertThat(addOperator.execute(lhs, rhs).getValue(), equalTo(result.getValue()));
    }

    @Test
    public void addOperator_execute4(){
        Operator addOperator = Operator.create("+");
        Operand lhs = new Operand(-9);
        Operand rhs = new Operand(8);
        Operand result = new Operand(-1);
        assertThat(addOperator.execute(lhs, rhs).getValue(), equalTo(result.getValue()));
    }



    //unit tests for SubtractOperator class
    @Test
    public void subtractOperator_precedence(){
        Operator subtractOperator = Operator.create("-");
        assertThat(subtractOperator.precedence(), equalTo(1));
    }

    @Test
    public void subtractOperator_execute1(){
        Operator subtractOperator = Operator.create("-");
        Operand lhs = new Operand(8);
        Operand rhs = new Operand(9);
        Operand result = new Operand(-1);
        assertThat(subtractOperator.execute(lhs, rhs).getValue(), equalTo(result.getValue()));
    }

    @Test
    public void subtractOperator_execute2(){
        Operator subtractOperator = Operator.create("-");
        Operand lhs = new Operand(9);
        Operand rhs = new Operand(8);
        Operand result = new Operand(1);
        assertThat(subtractOperator.execute(lhs, rhs).getValue(), equalTo(result.getValue()));
    }

    @Test
    public void subtractOperator_execute3(){
        Operator subtractOperator = Operator.create("-");
        Operand lhs = new Operand(-8);
        Operand rhs = new Operand(9);
        Operand result = new Operand(-17);
        assertThat(subtractOperator.execute(lhs, rhs).getValue(), equalTo(result.getValue()));
    }

    @Test
    public void subtractOperator_execute4(){
        Operator subtractOperator = Operator.create("-");
        Operand lhs = new Operand(-9);
        Operand rhs = new Operand(8);
        Operand result = new Operand(-17);
        assertThat(subtractOperator.execute(lhs, rhs).getValue(), equalTo(result.getValue()));
    }



    //unit tests for MultiplyOperator class
    @Test
    public void multiplyOperator_precedence(){
        Operator multiplyOperator = Operator.create("*");
        assertThat(multiplyOperator.precedence(), equalTo(2));
    }

    @Test
    public void multiplyOperator_execute1(){
        Operator subtractOperator = Operator.create("*");
        Operand lhs = new Operand(8);
        Operand rhs = new Operand(9);
        Operand result = new Operand(72);
        assertThat(subtractOperator.execute(lhs, rhs).getValue(), equalTo(result.getValue()));
    }

    @Test
    public void multiplyOperator_execute2(){
        Operator subtractOperator = Operator.create("*");
        Operand lhs = new Operand(9);
        Operand rhs = new Operand(8);
        Operand result = new Operand(72);
        assertThat(subtractOperator.execute(lhs, rhs).getValue(), equalTo(result.getValue()));
    }

    @Test
    public void multiplyOperator_execute3(){
        Operator subtractOperator = Operator.create("*");
        Operand lhs = new Operand(-8);
        Operand rhs = new Operand(9);
        Operand result = new Operand(-72);
        assertThat(subtractOperator.execute(lhs, rhs).getValue(), equalTo(result.getValue()));
    }

    @Test
    public void multiplyOperator_execute4(){
        Operator subtractOperator = Operator.create("*");
        Operand lhs = new Operand(-9);
        Operand rhs = new Operand(8);
        Operand result = new Operand(-72);
        assertThat(subtractOperator.execute(lhs, rhs).getValue(), equalTo(result.getValue()));
    }




    //unit tests for DivideOperator class
    @Test
    public void divideOperator_precedence(){
        Operator divideOperator = Operator.create("/");
        assertThat(divideOperator.precedence(), equalTo(2));
    }

    @Test
    public void divideOperator_execute1(){
        Operator divideOperator = Operator.create("/");
        Operand lhs = new Operand(16);
        Operand rhs = new Operand(9);
        Operand result = new Operand(1);
        assertThat(divideOperator.execute(lhs, rhs).getValue(), equalTo(result.getValue()));
    }

    @Test
    public void divideOperator_execute2(){
        Operator divideOperator = Operator.create("/");
        Operand lhs = new Operand(9);
        Operand rhs = new Operand(16);
        Operand result = new Operand(0);
        assertThat(divideOperator.execute(lhs, rhs).getValue(), equalTo(result.getValue()));
    }

    @Test
    public void divideOperator_execute3(){
        Operator divideOperator = Operator.create("/");
        Operand lhs = new Operand(-18);
        Operand rhs = new Operand(9);
        Operand result = new Operand(-2);
        assertThat(divideOperator.execute(lhs, rhs).getValue(), equalTo(result.getValue()));
    }

    @Test
    public void divideOperator_execute4(){
        Operator divideOperator = Operator.create("/");
        Operand lhs = new Operand(18);
        Operand rhs = new Operand(9);
        Operand result = new Operand(2);
        assertThat(divideOperator.execute(lhs, rhs).getValue(), equalTo(result.getValue()));
    }





    //unit tests for powerOperator class
    @Test
    public void powerOperator_precedence(){
        Operator powerOperator = Operator.create("^");
        assertThat(powerOperator.precedence(), equalTo(3));
    }

    @Test
    public void powerOperator_execute1(){
        Operator powerOperator = Operator.create("^");
        Operand lhs = new Operand(2);
        Operand rhs = new Operand(5);
        Operand result = new Operand(32);
        assertThat(powerOperator.execute(lhs, rhs).getValue(), equalTo(result.getValue()));
    }

    @Test
    public void powerOperator_execute2(){
        Operator powerOperator = Operator.create("^");
        Operand lhs = new Operand(-2);
        Operand rhs = new Operand(5);
        Operand result = new Operand(-32);
        assertThat(powerOperator.execute(lhs, rhs).getValue(), equalTo(result.getValue()));
    }

    @Test
    public void powerOperator_execute3(){
        Operator powerOperator = Operator.create("^");
        Operand lhs = new Operand(-3);
        Operand rhs = new Operand(4);
        Operand result = new Operand(81);
        assertThat(powerOperator.execute(lhs, rhs).getValue(), equalTo(result.getValue()));
    }

    @Test
    public void powerOperator_execute4(){
        Operator powerOperator = Operator.create("^");
        Operand lhs = new Operand(-3);
        Operand rhs = new Operand(5);
        Operand result = new Operand(-243);
        assertThat(powerOperator.execute(lhs, rhs).getValue(), equalTo(result.getValue()));
    }
}
