package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Blog;
//import model.TouristPlace;

public class CRUDOperations {
	static List<Blog> list = new ArrayList<Blog>(); // Store the blog in the list

	public List<Blog> addBlog(Blog blog) {
		list.add(blog);
		list.forEach(System.out::println);
		return list;
	}

	public List<Blog> viewBlog(Blog blog) throws IOException {

		list.sort((b1, b2) -> b1.getBlogTitle().compareTo(b2.getBlogTitle()));
		list.sort((b1, b2) -> b1.getDate().compareTo(b2.getDate()));
		list.forEach(System.out::println);
		return list;

	}

	public List<Blog> createBlog(Blog blog) throws IOException {
		list.add(blog);
		return list;
	}

	public List<Blog> updateBlog(Blog blog) throws IOException {
		return null;

	}

	public List<Blog> deleteBlog(Blog blog) throws IOException {
		return null;

	}
}
