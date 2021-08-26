package com.example.springaopdemo;

import com.example.springaopdemo.bean.Student;
import com.example.springaopdemo.service.NaiveWaiter;
import com.example.springaopdemo.service.NaughtyWaiter;
import com.example.springaopdemo.service.SmartSeller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringAopDemoApplicationTests {
    @Autowired
    private NaiveWaiter waiter;
    @Autowired
    private NaughtyWaiter naughtyWaiter;
    @Autowired
    private SmartSeller seller;

    @Test
    void contextLoads() {
    }

    @Test
    public void beforeAll(){
        waiter.greetTo("Timo");
        waiter.serveTo("Xin");
        waiter.smile("Zoe",3);

        naughtyWaiter.greetTo("Kimi");
        naughtyWaiter.serveTo("ez");
        naughtyWaiter.joke("Zelas", "4");
        Student student = new Student();
        student.setName("Jim");
        student.setSchool("qh");
        naughtyWaiter.talk(student);

        seller.showGoods("apple");
        seller.sellTo("beer","Tom");
        Double result = seller.sold(34.7);
        System.out.println("Result:" + result);
        try {
            seller.throwing(true);
//            seller.throwing(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
