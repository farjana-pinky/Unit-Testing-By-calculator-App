import org.testng.Assert;
import org.testng.annotations.Test;




//unit testing
@Test
public class calculatorTesr {

   @Test
   void addTest(){


        int expectResult = 20;
        int actualResult = calculator.add();

        Assert.assertEquals(expectResult, actualResult);

        System.out.println(expectResult);
       System.out.println(actualResult);
       System.out.println(" all good, the system work perfectly");

    }
  @Test
    void subtractionTest(){

      int expectResult = 5;
        int actualResult = calculator.subtraction(10, 5);

        Assert.assertEquals(expectResult, actualResult);

      System.out.println(expectResult);
      System.out.println(actualResult);
      System.out.println(" all good, the system work perfectly");


    }
@Test
    static void multiplicationTest(){

       int expectResult = 60;
        int actualResult = calculator.multiplication(10, 6);
        Assert.assertEquals(expectResult, actualResult);
    System.out.println(expectResult);
    System.out.println(actualResult);
    System.out.println(" all good, the system work perfectly");

    }


}
