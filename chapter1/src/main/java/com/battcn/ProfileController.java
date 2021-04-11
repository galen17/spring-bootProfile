package com.battcn;

import com.battcn.config.MyProperties2;
import com.battcn.config.Properes1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/properties")
@RestController
public class ProfileController {
    private static final Logger log = LoggerFactory.getLogger(ProfileController.class);
    private final MyProperties2 myProperties2;
    private final Properes1 properes1;

    @Value("${server.zhoudao}")
    private String my1Name;

    @Autowired
    public ProfileController(Properes1 properes1, MyProperties2 myProperties2) {
        this.properes1 = properes1;
        this.myProperties2 = myProperties2;
    }

    @RequestMapping("/getProperties1")
    public void getProperties1() {
        Integer duorou = properes1.getDuorou();

        String zhoudao = properes1.getZhoudao();
        System.out.println("properties:" + duorou);
        System.out.println("buhouzhuidezhi:" + zhoudao);
    }

    @RequestMapping("/getProperties2")
    public MyProperties2 getProperties2() {
        log.info("=================================================================================================");
        log.info(myProperties2.toString());
        log.info("=================================================================================================");
        return myProperties2;
    }
}
