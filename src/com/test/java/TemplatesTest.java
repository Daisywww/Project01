package com.test.java;

import com.test.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @auther Daisy
 * @date 2020/6/5 - 15:38
 *
 * IDEA中代码模板所处的位置：
 * setting - Editor - Live Templates / Postfix Completion
 */
public class TemplatesTest {

    //模板六: prsf 生成 private static final
    //添加module1内的依赖可用
    private static final Customer cust = new Customer();
    //变形: psf public static final
    public static final int NUM = 1;
    //变形: psfi public static final int
    public static final int NUM2 = 2;
    //变形: psfs public static final String
    public static final String NATION = "CHINA";


    //模板1：psvm main
    public static void main(String[] args) {
        int a = 10;
        //模板二: sout
        System.out.println("");
        //soutp /soutm/ soutv -> 就近打印变量 / xxx.sout -> 打印xxx
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        System.out.println("a = " + a);
        System.out.println(a);

        //模板三: for循环
        //fori
        String[] arr = new String[]{"bjt","some","test"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形iter
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }


        //模板四: list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        for (Object o : list) {

        }
        //变形 list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形 list.forr 逆序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }


        //模板5:ifn
        if (list == null) {

        }
        //变形 inn
        if (list != null) {

        }
        //变形 xxx.nn / xxx.null
        if (list != null) {

        }
        if (list == null) {

        }



    }


}
