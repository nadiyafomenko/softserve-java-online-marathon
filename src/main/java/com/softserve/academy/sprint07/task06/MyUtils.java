package com.softserve.academy.sprint07.task06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyUtils {
    public Map<String, Stream<String>> phoneNumbers(List<Stream<String>> list) {
        List<String> newList = new ArrayList<>();
        list.stream().forEach(stream -> {
            List<String> temp = stream.collect(Collectors.toList());
            newList.addAll(temp);
        });
        List<String> replaced = newList.stream().map(phone -> phone.replaceAll("[-() ]", "")).collect(Collectors.toList());
        Collection<List<String>> grouped = replaced.stream().collect(Collectors.groupingBy(String::length)).values();
        Map<String, Stream<String>> result = new HashMap<>();

        grouped.stream().forEach(_list -> {
            if (_list.stream().count() == 1) result.put("err", _list.stream());
            if (_list.stream().count() == 2) result.put("loc", _list.stream());
            if (_list.stream().count() > 2) result.put("", _list.stream().map(phone -> phone.substring(3, 10)));
        });
        return result;
    }

    //pnone.toString().replaceAll("\\p{P}", "")
    public static void main(String[] args) {
        List<Stream<String>> list = new ArrayList<>();
        List<String> first = new ArrayList<>();
        first.add("093 987 65 43");
        first.add("(050)1234567");
        first.add("12-345");

        List<String> second = new ArrayList<>();
        second.add("067-21-436-57");
        second.add("050-2345678");
        second.add("0939182736");
        second.add("224-19-28");

        List<String> third = new ArrayList<>();
        third.add("(093)-11-22-334");
        third.add("044 435-62-18");
        third.add("721-73-45");

        list.add(first.stream());
        list.add(second.stream());
        list.add(third.stream());

        System.out.println(new MyUtils().phoneNumbers(list));
    }
}
