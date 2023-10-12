/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.hau.mathutil.core;

import com.hau.math.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ACER
 */
public class MathUtilityTest {
    //Test  case template/ Structure:
    // ID | DESCRIPTION |STEPS/PROCEDURES/EXPECTED VALUE | STATUS (PASSEED/FAILED)
    
    //Test case #1 : Verify the getFactorial() function with n= 0;
    //Steps/Procedures:
    //         1. Given n=0;
    //         2. Call/invoke getFactorial(n)
    //Expected Result
    //        The methods getFactorial(n=0) must return 1
    //                    as the result of 0!==1
    //Status : PASSED| failed đoán xem khi chạy app/hàm/method.
   @Test // dính dáng đến framework
   public void verifyFactorialGivenRightArgument0ReturnOk(){
       assertEquals(1,MathUtility.getFactorial(0));
   }
   
   //Test case #2:
   
    @Test // dính dáng đến framework
   public void verifyFactorialGivenRightArgument1ReturnOk(){
       assertEquals(1,MathUtility.getFactorial(1));
   }
    //Test case #3:
   
    @Test // dính dáng đến framework
   public void verifyFactorialGivenRightArgument6ReturnOk(){
       assertEquals(720,MathUtility.getFactorial(6));
   }
   
    
   
}
