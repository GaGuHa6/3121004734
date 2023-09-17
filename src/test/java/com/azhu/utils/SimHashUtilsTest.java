package com.azhu.utils;

import org.junit.Test;

public class SimHashUtilsTest {

    @Test
    public void getHashTest(){
        String[] strings = {"余华", "是", "一位", "真正", "的", "作家"};
        for (String string : strings) {
            String stringHash = SimHashUtils.getHash(string);
            System.out.println(stringHash.length());
            System.out.println(stringHash);
        }
    }

    @Test
    public void getSimHashTest(){
        String str0 = TxtIOUtils.readTxt("E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/orig.txt");
        String str1 = TxtIOUtils.readTxt("E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/orig_0.8_add.txt");
        System.out.println(SimHashUtils.getSimHash(str0));
        System.out.println(SimHashUtils.getSimHash(str1));
    }

}
