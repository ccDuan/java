package com.ccduan;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo01 {
    public static void main(String[] args, Stream<String> stream) {
       List<String> list =  Arrays.asList("a诸葛亮","b曹操","c刘备","c关羽","e张飞");
       //  set集合也可以 Set<String> set = new HashSet<>();
//用stream便利，取出c开头的,把字母转大写，排序输出



     List<String> sortedList =   list.stream()
                .filter(str ->str.startsWith("c"))
                .map(String::toUpperCase) //把字母转大写
                .sorted()//排序
                .collect(Collectors.toList());

        System.out.println(sortedList);

        // 文件转换成流

        try {
            Stream<String>  fileStream=   Files.lines(Paths.get("file.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }


        //数组转换成流

       /* String []  strArray = {"avc","djd0","ajdf","fjf"};
        strArray =  Stream.of(strArray).filter().map().collect(Collectors.toList());
*/
    }
}
