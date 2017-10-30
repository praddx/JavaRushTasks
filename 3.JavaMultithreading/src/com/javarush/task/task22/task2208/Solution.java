package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {

        /*Map<String, String> paramsMap = new HashMap<>();
        paramsMap.put("name", "Ivan");
        paramsMap.put("age", "13");
        paramsMap.put("country", "Russia");
        paramsMap.put("city", "Moscow");


        System.out.println(getQuery(paramsMap));*/

    }
    public static String getQuery(Map<String, String> params) {

        StringBuilder query = new StringBuilder("");


        for (Map.Entry<String, String> param : params.entrySet()) {
            if (param.getKey() != null && param.getValue() != null) {
                query.append(param.getKey() + " = \'" + param.getValue() + "\' and ");
            }
        }
        if (query.length() > 0) {
           return query.substring(0, query.length() - 5);
        }

        return query.toString();
    }
}
