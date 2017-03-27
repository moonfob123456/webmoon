package org.zerock.web;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.anno.GetMapping;

public class BoardController {
	
	@GetMapping("register.do")
	public void registerGet(HttpServletRequest request, HttpServletResponse response)throws Exception{
		System.out.println("register get");
	}
	
	@GetMapping("list.do")
	public void list(HttpServletRequest request, HttpServletResponse response)throws Exception{
		System.out.println("list get");
	}
	
	public String registerPost(HttpServletRequest request, HttpServletResponse response)throws Exception{
		System.out.println("register Post");
		
		return "/board/list.do?msg=success";
	}

//	public static void main(String[] args) throws Exception{
//		
//		String target = "/register";
//		String method = "GET";
//		
//		String className = "org.zerock.web.BoardController";
//		Class clz = Class.forName(className);
//		Object obj = clz.newInstance();
//		
//		Method[] methods = clz.getDeclaredMethods();
//		
//		for (Method method2 : methods) {
//			if(method.equals("GET")){
//				
//				GetMapping mapping = method2.getAnnotation(GetMapping.class); //어노테이션으로 찾음?
//				
//				if(mapping != null){
//					String annoValue = mapping.value();
//					
//					if(annoValue.equals(target)){
//						
//						method2.invoke(obj, null);
//						
//					}
//				}
//				
//				
//			}
//		}	
//	}

}
