package com.nicekkong.ex00;


import com.nicekkong.domain.ProductVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.*;


/**
 * Created by nicekkong on 2016. 1. 18..
 */

@Controller
public class SampleController {

    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);



    @RequestMapping("/doA")
    public void daA() {
        logger.debug("doA called............");
    }

    @RequestMapping("/doB")
    public void daB() {
        logger.debug("doB called............");
    }

    @RequestMapping("doC")
    public String doC(@ModelAttribute("msg") String msg1){
        logger.debug("doC called..............");

        System.out.println("msg1 : " + msg1);

        return "result";
    }

    @RequestMapping("/doD")
    public String doD(Model model){

        ProductVO product = new ProductVO("Sample Product", 100000);
        logger.info("doD");
        model.addAttribute("product", product);

        return "productDetail";
    }

    @RequestMapping("/doE")
    public String doE(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("msg","This is the Message!! with redirect");

        return "redirect:/doF";
    }

    @RequestMapping("/doF")
    public void doF(@ModelAttribute("msg") String msg) {
        System.out.println(msg);
        logger.info("doF called................" + msg);
    }

    @RequestMapping("/doJSON")
    public @ResponseBody List<ProductVO> doJson() {
        ProductVO vo1 = new ProductVO("생활용품", 30000);
        ProductVO vo2 = new ProductVO("가전제품" , 1000000);

        List<ProductVO> list = new ArrayList<ProductVO>();
        list.add(vo1);
        list.add(vo2);

        return list;
    }
}
