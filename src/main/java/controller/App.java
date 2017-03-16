package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import utils.PageData;

/**
 * Created with IntelliJ IDEA.
 * User: wangxindong
 * Date: 2017/3/14
 * Time: 20:41classpath:mapper/*.xml
 */
@Controller
@EnableAutoConfiguration
public class App extends BaseController {

    @RequestMapping(value = "/")
    @ResponseBody
    String home() {
        return "hello spring boot";
    }

    @RequestMapping(value = "/hi")
    @ResponseBody
    String home(String name) {
        PageData pd = getPageData();
        System.out.println(pd);
        return "hello" + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }

}
