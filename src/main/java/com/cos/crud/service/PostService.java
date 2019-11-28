package com.cos.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cos.crud.model.Post;
import com.cos.crud.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository mRepo;

	// GET => http://localhost:8080/post
	// Model은 데이터를 Controller에서 Presentation(View(jsp파일))계층까지

	public List<Post> postList() {
		List<Post> posts = mRepo.findAll();
		return posts;
	}

	// POST => http://localhost:8080/post/update

	public int update(Post post) {// param,form
		try {
			mRepo.update(post);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1; // 메핑 스티링에 맞춰 함수호출
	}

	// @RequestParam("id")
	// @RequestBody=>JSON
	// POST => http://localhost:8080/post/delete/1

	public int delete(int id) {
		try {
			mRepo.delete(id);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	// POST => http://localhost:8080/post/save

	public int save(Post post) {// id = null, createDate = null, userId = 0
		try {
			mRepo.save(post);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	// GET => http://localhost:8080/post/1

	public Post post(int id) {
		Post post = mRepo.findById(id);

		return post;
	}

	// GET = > http://localhost:8080/post/writeForm

	public Post updateForm(int id) {

		Post post = mRepo.findById(id);

		return post;
	}
}
