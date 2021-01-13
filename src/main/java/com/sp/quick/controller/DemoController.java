package com.sp.quick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

	@GetMapping(value = "/test")
	public String test() {
		return "views/home";
	}
	
	@GetMapping(value ="/test2")
	public ModelAndView test2() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/views/home2");
		return mv;
		/**
		 * 리턴되는 값은 리소스아래 views/명칭.html로 리턴되며, 필요의경우 모델에 담아 넘겨주면 된다.
		 * modelandview 대신 리턴해도 무관하다.
		 * 난 갠적으로 /test 처럼 걍 스트링으로 기입하는걸 좋아함.; 굳이 객체를생성해서 저렇게 해야하나싶음.
		 */
	}
	
}
