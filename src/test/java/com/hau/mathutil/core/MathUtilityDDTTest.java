/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.hau.mathutil.core;

import com.hau.math.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ACER
 */
public class MathUtilityDDTTest {
    //ta tách bộ data kiểm thử ra khỏi câu lệnh so sánh
    // kĩ thuật này gọi là ddt- Data Driven Testing
    // Kiểm thử hàm, app mà tách riêng bộ data 1 chooxddeer dễ kiểm
    // soát sự thiếu đủ của các test case, các test data
    // data test ta để rieengh ra 1 chỗ , thường là mảng, hay file Excel
    // hoặc Table
    // 0! -> 1
    // 1!-> 1
    // 5! -> 120
    
    public static Object[][] initData(){
        Object[][] testData ={{0,1},{1,1},{2,2},{4,24},{5,120}};
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource("initData")
    
   public void verifyFactorialGiveRightArgumentReturnsOk(int n, long expected){
       assertEquals(expected, MathUtility.getFactorial(n));
   }
}
