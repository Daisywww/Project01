package com.test.java;

import java.util.HashMap;

/**
 * @auther Daisy
 * @date 2020/6/9 - 11:00
 */
public class DebugTest {

    public static void main(String[] args) {
        //条件断点示例
        //i == 60
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        /*
        step over 进入下一步，如果当前行断点是一个方法，则不进入当前方法体内
        step into 进入下一步，如果当前行断点是一个方法，则进入当前方法体内
        force step into 进入下一步，如果当前行断点是要给方法，则进入当前方法体内
        step out 跳出
        resume program 恢复程序运行，但如果该断点下面代码还有断点，则停在下一个断点上
        stop 停止
        mute breakpoints 点中，使得所有的断点失效
        view breakpoints 查看所有断点

        条件断点
        查看表达式的值 ALT + F8
         */

        HashMap<String,String> map = new HashMap<>();
        map.put("name","Tom");
        map.put("age","12");
        System.out.println(map);
        map.put("school","Tsinghua");
        map.put("major","computer");

        String age = map.get("age");
        System.out.println(age);
        System.out.println("age = " + age);
        map.remove("major");
        System.out.println(map);
    }
}
