package com.ccduan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMap {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "word");

        //把两个字符串拆成单个字符
        //输出两个数组
        strings.stream()
                .map(c-> c.split(""))
                .forEach(System.out::println);

        //类似双层for嵌套
        strings.stream()

                .flatMap(w -> Arrays.stream(w.split("")))
                .forEach(System.out::println);

//  *** 重点 Stream 中间操作
        //无状态操作 ，filter ，map, flatmap
        // 有状态操作 distlnct (去重) limit(2)  取前面两个  skip 跳过  sorted(排序)
        //  parallel() 并行操作  不要用有状态操作
      //   sequential()  //串行操作，默认就是串行
        strings.stream()
                //parallel() 并行操作
               // .parallel()
              //  .sequential()  //串行操作，默认就是串行
                .flatMap(w -> Arrays.stream(w.split("")))
                .forEach(System.out::println);


    }
}
