package com.qx.cfg.controller;

import com.qx.cfg.bean.UserInfo;
import com.qx.cfg.exception.BizException;
import com.qx.cfg.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class UsreInfoController {

	@Autowired
	private UserInfoService userInfoService;
	
	@RequestMapping("/hello")
	public void hello(){
		System.out.println("6666");
		List<UserInfo> list = userInfoService.selectAllUser();
		list.forEach(userInfo -> System.out.println(userInfo.getUserName()));

	}
	
	@RequestMapping("/index")
	public String index(Model m){
		m.addAttribute("name", "heool");
		
		return "index";
	}
	@RequestMapping("/products")
	public String product(){
		return "products";
	}
	@ResponseBody
	@RequestMapping(value = "/user", method = RequestMethod.GET)
    public String index(String name,Model model) {
        model.addAttribute("message", "hello");
        model.addAttribute("name", name);
        int a = 0;
		if(a == 0)
		throw new BizException(200,"ddd");
        return "66";
    }
}
