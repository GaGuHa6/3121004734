package com.azhu.main;

import com.azhu.utils.HammingUtils;
import com.azhu.utils.SimHashUtils;
import com.azhu.utils.TxtIOUtils;
import org.junit.Test;

public class MainTest {

    @Test
    public void origAndAllTest(){
        String[] str = new String[6];
        str[0] = TxtIOUtils.readTxt("E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/orig.txt");
        str[1] = TxtIOUtils.readTxt("E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/orig_0.8_add.txt");
        str[2] = TxtIOUtils.readTxt("E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/orig_0.8_del.txt");
        str[3] = TxtIOUtils.readTxt("E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/orig_0.8_dis_1.txt");
        str[4] = TxtIOUtils.readTxt("E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/orig_0.8_dis_10.txt");
        str[5] = TxtIOUtils.readTxt("E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/orig_0.8_dis_15.txt");
        String ansFileName = "E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/ansAll.txt";
        for(int i = 0; i <= 5; i++){
            double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str[0]), SimHashUtils.getSimHash(str[i]));
            TxtIOUtils.writeTxt(ans, ansFileName);
        }
    }

    @Test
    public void origAndOrigTest(){
        String str0 = TxtIOUtils.readTxt("E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/orig.txt");
        String str1 = TxtIOUtils.readTxt("E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/orig.txt");
        String ansFileName = "E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/ansOrigAndOrigTest.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtils.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndAddTest(){
        String str0 = TxtIOUtils.readTxt("E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/orig.txt");
        String str1 = TxtIOUtils.readTxt("E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/orig_0.8_add.txt");
        String ansFileName = "E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/ansOrigAndAddTest.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtils.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDelTest(){
        String str0 = TxtIOUtils.readTxt("E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/orig.txt");
        String str1 = TxtIOUtils.readTxt("E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/orig_0.8_del.txt");
        String ansFileName = "E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/ansOrigAndDelTest.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtils.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis1Test(){
        String str0 = TxtIOUtils.readTxt("E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/orig.txt");
        String str1 = TxtIOUtils.readTxt("E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/orig_0.8_dis_1.txt");
        String ansFileName = "E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/ansOrigAndDis1Test.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtils.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis10Test(){
        String str0 = TxtIOUtils.readTxt("E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/orig.txt");
        String str1 = TxtIOUtils.readTxt("E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/orig_0.8_dis_10.txt");
        String ansFileName = "E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/ansOrigAndDis10Test.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtils.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis15Test(){
        String str0 = TxtIOUtils.readTxt("E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/orig.txt");
        String str1 = TxtIOUtils.readTxt("E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/orig_0.8_dis_15.txt");
        String ansFileName = "E:/IntelliJ IDEA Community Edition 2023.1.1/java_works/PaperCheck1/src/main/resources/testTxt/ansOrigAndDis15Test.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtils.writeTxt(ans,ansFileName);
    }

}