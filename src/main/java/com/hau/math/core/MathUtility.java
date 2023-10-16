/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hau.math.core;

/**
 *
 * @author ACER
 */
public class MathUtility {
    public static final double PI = 3.14;
    //C# public const double PI = 3.24; static hiểm ngầm luôn
    
    //Hàm tính n! = 1.2.3.4....n
    //không tính được giai thừa số âm!!!
    //0! = 1! quy ước 0! = 1
    //vì giai thừa tăng rất nhanh, 21! kiể long chứa không nổi(vượt 18 số 0)
    //do dó hàm getF() của chúng ta chỉ chơi với n 0..20
//    public static long getFactorial(int n){
//        if(n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n. n must be 0..20");
//        if(n == 0 || n == 1)
//            return 1;
//        long result = 1; //sống sót đến lệnh này , sure n= 2..20
//        for (int i = 2; i <= n; i++) 
//            result *= i;
//        
//        return result;
//    }
    
       public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be 0..20");
        if(n == 0 || n == 1)
            return 1;
        
        return n*getFactorial(n-1);
        // tối ưu code, thau ruột của cái hàm để chạy ngon hơn
        //Nhanh hơn, hoặc code viết đẹp hơn
        //hoặc fix bug thì phải sửa code
        // DÙ BẠN SỬA CODE VỚI LÍ DO GÌ THÌ CODE PHẢI ĐƯỢC TEST LẠI
        // VÀ TEST LẠI ĐỂ ĐẢM BẢO RẰNG NÓ VẪN XANH NHƯ LẦN TRƯỚC 
        // NẾU TA VIẾT CODE ĐI KÈM THEO TEST SCRIPT THÌ VIỆC TEST LẠI CÁI
        // HÀM SẼ CỰC NHANH, KHÔNG CẦN DÙNG MẮT ĐỂ DÒ TỪNG DÒNG LỆNH ĐÚNG
        // SAI, MÀ CHỈ CẦN NHÌN MÀU XANH LÀ ĐỦ - VÌ HÀM TRẢ VỀ NHƯ EXPECTED
        //                                             Kiểm thử hồi quy
        // Kiểm thử lại hàm cực nhanh, vì github actions lo giùm
        // Ta chỉ cần màu xanh, hoặc nhận email chửi vì code đỏ
        
        //5!=1.2.3.4! X5
        //..
        //..
        //..
        
        
        
    }
    
    
    
    
}
