package com.haicao;

import com.haicao.config.DogConfig;
import com.haicao.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigurationfilesApplicationTests {

    @Autowired
    private Person p;

    @Autowired
    private DogConfig dc;

    @Test
    public void contextLoads() {
        //打印: sout
        System.out.println("p: "+p);
        System.out.println("d: "+dc.getDog());
    }

}
