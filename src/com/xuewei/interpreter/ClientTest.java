package com.xuewei.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ClientTest {

    public static void main(String[] args) throws IOException{
        String expStr = getExpStr();
        Map<String,Integer> integerMap = getValue(expStr);

        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果:"+expStr+"="+calculator.run(integerMap));
        
    }

    /**
     * 获取表达式
     * @return
     * @throws IOException
     */
    public static String getExpStr() throws IOException {
        System.out.println("请输入表达式:");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }
    
    public static Map<String,Integer> getValue(String expStr) throws IOException{
        Map<String,Integer> integerMap = new HashMap<>();

        for (char ch : expStr.toCharArray()) {
            if(ch != '+' && ch != '-'){
                if(!integerMap.containsKey(String.valueOf(ch))){
                    System.out.println("请输入"+ch+"的值:");
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    integerMap.put(String.valueOf(ch),Integer.valueOf(in));
                }
            }
        }

        return integerMap;
    }
}
