package com.ccduan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo03 {


    public static void main(String[] args) {
        List<String> list =  Arrays.asList("dfsdf","fgd","gdf","hth","ghhgg");
        
        //使用map转大写
        //List<String> collect = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        //另一种写法
        List<String> collect = list.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect);

        // 打印字符串长度
        Stream.of("dfsdf","fgd","gdf","hth","ghhgg")
                .mapToInt(String::length).forEach(System.out::println);

//map的复杂操作

        Student student1 = new Student("张三",15,"123");
        Student student2 = new Student("李四",14,"123");
        Student student3 = new Student("王五",16,"123");
        List<Student> studentList = Arrays.asList(student1,student2,student3);

        //年龄加一岁
//        List<Object> collect1 = studentList.stream()
//                .map(e -> {
//                    e.setAge(e.getAge()+1);
//                    return e;
//                }).collect(Collectors.toList());

        //用peek简化map,不需要return
                List<Object> collect1 = studentList.stream()
                .peek(e -> {
                    e.setAge(e.getAge()+1);
                  //  return e;
                }).collect(Collectors.toList());
        System.out.println(collect1);

    }
    
}
