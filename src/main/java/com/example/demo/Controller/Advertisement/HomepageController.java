package com.example.demo.Controller.Advertisement;

import java.util.*;

import com.example.demo.domain.ProductAdvertisement;
import com.example.demo.domain.ShopAdvertisement;
import com.example.demo.service.product.ProductAdvertisementSQL;
import com.example.demo.service.product.ShopAdvertisementSQL;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class HomepageController {


    //@Autowired
    //private ShopAdvertisementService shopAdvertisementService;
    //@Resource
   // private ShopAdvertisementRepository advertisementRepository;
    //private Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping(value = "/homepage", method = RequestMethod.GET)
    public String homepage(Model model){
        //List<ShopAdvertisement> ads = advertisementService.getAdvertisement();

        ShopAdvertisementSQL shopAdvertisementSQL = new ShopAdvertisementSQL();
        ProductAdvertisementSQL productAdvertisementSQL = new ProductAdvertisementSQL();

        List<ShopAdvertisement> shop_ads = shopAdvertisementSQL.findAllads();
        model.addAttribute("shop_ads", shop_ads);//返回商铺广告的list，前端解析

        List<ProductAdvertisement> pro_ads_head = productAdvertisementSQL.findByPlace(1);
        model.addAttribute("pro_ads_head",pro_ads_head);//动态轮转商品广告

        List<ProductAdvertisement> pro_ads = productAdvertisementSQL.findByPlace(2);
        model.addAttribute("pro_ads", pro_ads);//商品广告
        return "byffff/homepage";
    }
}
