package com.klaus.base;

import com.klaus.base.util.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseApplicationTests {

    @Test
    public void contextLoads() {
        FileUtils.copyFile1("C:\\Users\\60274\\Desktop\\1.txt","C:\\Users\\60274\\Desktop\\2.txt");
        FileUtils.copyFile2("C:\\Users\\60274\\Desktop\\1.txt","C:\\Users\\60274\\Desktop\\3.txt");
    }

}
