package study;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liuqingpei1
 * @date 2019/10/30
 */
@Controller
public class HellloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @RequestMapping("/")
    public String i(){
        return "rediret:index";
    }

    @RequestMapping("/index")
    public String index(Model model, Map<String, Object> paramMap){
        model.addAttribute("user","<h1>usercon</h1>");
        model.addAttribute("user","usercon");
        paramMap.put("user","<h1>usercon</h1>");
        return "index";
    }
}
