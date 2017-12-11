package com.example.demo.Controller.Product;


import com.example.demo.domain.Product;
import com.example.demo.service.product.ProductSQL;
import com.example.demo.service.ProductService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
@RequestMapping("/search")
public class SearchController {

    //@Autowired
    private ProductService productService;
    //@Source
    //private Logger logger = Logger.getLogger(this.getClass());

    //通过商品名查询商品
    //eg: /search/name=pants 查询pants
    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public String searchByName(Model model, HttpServletRequest str){
        //List<Product> products = productService.getProductByName(str.getParameter("productname"));
        ProductSQL productSQL = new ProductSQL();
        List<Product> products =
                productSQL.findProductsByProductNameMatches(str.getParameter(("productname")));

        model.addAttribute("products",products);
        return "/byffff/search";
    }

    //通过商品类型查询商品
    //eg: /search/type=TV  查询TV
    @RequestMapping(value = "/type",method = RequestMethod.GET)
    public String searchByType(Model model, HttpServletRequest str){
        //List<Product> products = productService.getProductByType(str.getParameter("producttype"));
        ProductSQL productSQL = new ProductSQL();
        List<Product> products = productSQL.findProductsByType(str.getParameter(("type")));

        model.addAttribute("products",products);
        return  "/byffff/search";
    }

}
