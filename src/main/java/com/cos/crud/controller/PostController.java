package com.cos.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.crud.model.Post;
import com.cos.crud.repository.PostRepository;

@Controller
@RequestMapping("/post")
public class PostController {
	
	@Autowired
	private PostRepository postRepository;
	
	
	@GetMapping("/test/home")
	public @ResponseBody String home() {
		return "<h1>시현이의 홈페이지에 온것을 환영한다구~(찡긋)</h1>";
	}
	
	
	//GET => http://localhost:8080/post
	//Model은 데이터를  Controller에서 Presentation(View(jsp파일))계층까지 
	@GetMapping("")
	public String postList(Model model) {
		List<Post>posts = postRepository.findAll();
		model.addAttribute("posts", posts);
		//webapp/WEB-INF/views/post/list.jsp
		return "post/list";
	}
	
	//POST => http://localhost:8080/post/update
	@PostMapping("/update")
	public String update(Post post) {//param,form
		try {
			postRepository.update(post);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/post";	//메핑 스티링에 맞춰 함수호출	
	}
	
	
	//@RequestParam("id")
	//@RequestBody=>JSON
	//POST => http://localhost:8080/post/delete/1
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		try {
			postRepository.delete(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/post";
	}
	
	//POST => http://localhost:8080/post/save
	@PostMapping("/save")
	public String save(Post post) {//id = null, createDate = null, userId = 0
		try {
			postRepository.save(post);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/post";
	}
	
	//GET => http://localhost:8080/post/1
	@GetMapping("/{id}")
	public String post(@PathVariable int id, Model model) {
			Post post = postRepository.findById(id);
			model.addAttribute("post", post);
			return "post/detail";
		}
	
	//GET = > http://localhost:8080/post/writeForm
	@GetMapping("/writeForm")
	public String writeForm() {
		return "post/writeForm";
	}
	
	@GetMapping("/updateForm/{id}")
	public String updateForm(@PathVariable int id, Model model) {
		
		Post post = postRepository.findById(id);
		model.addAttribute("post", post);
		return "post/updateForm";
	}
}
