package com.example.demo.Controller.Product;

import com.example.demo.domain.Product;
import com.example.demo.service.product.ProductSQL;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop")
public class ShopsProductsController {

    private ProductSQL productSQL;
    //@Autowired
    //private ProductService productService;

    //@Source
    //private Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping("/shopsproduct")
    public String ShopsProduct(Model model, HttpServletRequest req){
        Product product =
                productSQL.findProductbyProductID(Integer.parseInt(req.getParameter("productid")));
        model.addAttribute(product);
        return "/byffff/productdetail";
    }

}
