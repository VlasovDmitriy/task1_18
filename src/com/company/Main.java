package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) throws MyMap.MapException {

	/*
	Словарь (ключ – объект, значение – объект/набор объектов). Словарь, кроме
стандартных, должен содержать методы:
– получить список ключей для заданного объекта,
– удалить заданный объект для любых значений ключа,
– удалить заданный объект для заданного ключа.
	 */

MyMap<String,String> map = new MyMap<>();
map.addLast("тупой","Дмитрий");
map.addLast("лох","Коля");
map.addLast("красивый","Женек");
map.addLast("некрасивый","Михаил");
        List<String> keys = map.getKeys();
        for(String key: keys){
            System.out.println(key);
        }
        System.out.println();
String key1 = "Женек";
/*String key2 = "красивый";*/
        map.removeByValue(key1);

       for(String key: keys) {

           System.out.println(key + " - " + map.getValue(key));
       }


    }
}
