package com.mytests.springboot.webapp.defaults.freemarker.defaultfreemarkertest1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
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

    @ModelAttribute("listGlobalAttr1")
    public List<? extends MyDataType> listGlobalAttr1(){

        List<MyDataTypeImpl> mylist = new ArrayList<>();
        mylist.add(new MyDataTypeImpl("aaa"));
        mylist.add(new MyDataTypeImpl("bbb"));
        mylist.add(new MyDataTypeImpl("ccc"));
        return mylist;
    }

    @RequestMapping("/")
    public String Method(ModelMap model) {

        List <Data> data = new ArrayList <>();
        data.add(new Data("jsp_default", "+"));
        data.add(new Data("jsp_with_configured_prefix_and_suffix", "-"));
        data.add(new Data("beanname_default", "+"));
        data.add(new Data("thymeleaf_default", "-"));
        data.add(new Data("freemarker_default", "-"));
        data.add(new Data("thymeleaf_with_configured_prefix_and_suffix", "+-"));
        data.add(new Data("freemarket_with_configured_prefix_and_suffix", "-"));
        model.addAttribute("home_attr1", "default freemarker configuration test with explicit path, prefix and suffix");
        model.addAttribute("viewresolversList", data);
        return "home";
    }

    @RequestMapping("/test2")
    public String test2Method(ModelMap model) {
        model.addAttribute("test2_attr1", "test2_attr1");
        return "test2";
    }

    @RequestMapping("/test3")
    public String test3Method(ModelMap model) {
        List <String> data = new ArrayList <>();
        data.add("d1");
        data.add("");
        data.add("d3");
        data.add("d4");
        model.addAttribute("data", data);
        model.addAttribute("test3_attr1", "test3_attr1_");
        return "test3";
    }

}
