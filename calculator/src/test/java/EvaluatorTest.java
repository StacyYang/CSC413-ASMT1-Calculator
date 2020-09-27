import edu.csc413.calculator.evaluator.Evaluator;
import edu.csc413.calculator.exceptions.InvalidExpressionException;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class EvaluatorTest {
    //unit tests for evaluateSimpleExpression
    @Test
    public void simpleExpression1() throws InvalidExpressionException {
        String simpleExpression = "1 + 6";
        Evaluator tester = new Evaluator();
        int result = tester.evaluateSimpleExpression(simpleExpression);
        assertThat(7, equalTo(result));
    }

    @Test
    public void simpleExpression2() throws InvalidExpressionException {
        String simpleExpression = "1 / 6";
        Evaluator tester = new Evaluator();
        int result = tester.evaluateSimpleExpression(simpleExpression);
        assertThat(0, equalTo(result));
    }

    @Test
    public void simpleExpression3() throws InvalidExpressionException {
        String simpleExpression = "1 + 6*2";
        Evaluator tester = new Evaluator();
        int result = tester.evaluateSimpleExpression(simpleExpression);
        assertThat(13, equalTo(result));
    }

    @Test
    public void simpleExpression4() throws InvalidExpressionException {
        String simpleExpression = "3^5";
        Evaluator tester = new Evaluator();
        int result = tester.evaluateSimpleExpression(simpleExpression);
        assertThat(243, equalTo(result));
    }

    @Test
    public void simpleExpression5() throws InvalidExpressionException {
        String simpleExpression = "1 + 6*2/3^2";
        Evaluator tester = new Evaluator();
        int result = tester.evaluateSimpleExpression(simpleExpression);
        assertThat(2, equalTo(result));
    }

    @Test
    public void simpleExpression6() throws InvalidExpressionException {
        String simpleExpression = "8/5+ 6*3";
        Evaluator tester = new Evaluator();
        int result = tester.evaluateSimpleExpression(simpleExpression);
        assertThat(19, equalTo(result));
    }




    //unit tests for evaluatorExpression
    @Test
    public void evaluateExpression1() throws InvalidExpressionException {
        String evaluateExpression = "(2+3)*6";
        Evaluator tester = new Evaluator();
        int result = tester.evaluateExpression(evaluateExpression);
        assertThat(30, equalTo(result));
    }

    @Test
    public void evaluateExpression2() throws InvalidExpressionException {
        String evaluateExpression = "9/(2+3)*6";
        Evaluator tester = new Evaluator();
        int result = tester.evaluateExpression(evaluateExpression);
        assertThat(6, equalTo(result));
    }

    @Test
    public void evaluateExpression3() throws InvalidExpressionException {
        String evaluateExpression = "2^3/4*(6-1)";
        Evaluator tester = new Evaluator();
        int result = tester.evaluateExpression(evaluateExpression);
        assertThat(10, equalTo(result));
    }

    @Test
    public void evaluateExpression4() throws InvalidExpressionException {
        String evaluateExpression = "3^(2+3)*6/8";
        Evaluator tester = new Evaluator();
        int result = tester.evaluateExpression(evaluateExpression);
        assertThat(182, equalTo(result));
    }

    @Test
    public void evaluateExpression5() throws InvalidExpressionException {
        String evaluateExpression = "3^(2+3)*3/2*(7/(3+1))";
        Evaluator tester = new Evaluator();
        int result = tester.evaluateExpression(evaluateExpression);
        assertThat(364, equalTo(result));
    }
}
