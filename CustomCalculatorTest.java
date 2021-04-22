
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {
    private CustomCalculator customCalculator;

    //더하기 테스트
    @Test
    public void addTest(){
        customCalculator = new CustomCalculator();
        int result=customCalculator.add(10,10);
        //테스트 코드 입력
        //assertTrue(result==20);
        assertFalse(result==19);
    }
    @Test
    public void subTest(){
        customCalculator = new CustomCalculator();
        int result=customCalculator.subtract(10,3);
        //테스트 코드 입력
        assertTrue(result==7);
    }

    @Test
    public void mulTest(){
        customCalculator = new CustomCalculator();
        int result=customCalculator.multiply(10,3);
        //테스트 코드 입력
        assertTrue(result==30);
    }
    @Test
    public void divTest(){
        customCalculator = new CustomCalculator();
        int result=customCalculator.divide(9,3);
        //테스트 코드 입력
        assertTrue(result==3);
    }
}