package com.mytests.springboot.webapp.defaults.freemarker.defaultfreemarkertest1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 8/14/2017.
 * Project: DefaultFreemarker_test0
 * *******************************
 */
@Controller
public class MyController {

    @RequestMapping("/")
    public String Method(ModelMap model) {
        List<Data> data = new ArrayList<>();
        data.add(new Data("jsp_default","+"));
        data.add(new Data("jsp_with_configured_prefix_and_suffix","-"));
        data.add(new Data("beanname_default","+"));
        data.add(new Data("thymeleaf_default","-"));
        data.add(new Data("freemarker_default","-"));
        data.add(new Data("thymeleaf_with_configured_prefix_and_suffix","+-"));
        data.add(new Data("freemarket_with_configured_prefix_and_suffix","-"));
         model.addAttribute("home_attr1", "default freemarker configuration test with explicit path, prefix and suffix");
        model.addAttribute("viewresolversList",data );
        return "home";
    }
}
