package com.isaachome;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.isaachome.model.Comment;
import com.isaachome.services.CommentService;

public class MainApp {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var service = context.getBean(CommentService.class);
		Comment comment = new Comment();
		comment.setText("Wow powerful AOP"); 
		comment.setAuthor("Natasha");
		service.pushComment(comment);
	}
}
