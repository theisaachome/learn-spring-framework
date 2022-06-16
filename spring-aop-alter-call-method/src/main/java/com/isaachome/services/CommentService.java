package com.isaachome.services;


import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.isaachome.model.Comment;

@Service
public class CommentService {
	private Logger logger = Logger.getLogger(CommentService.class.getName());
	public void pushComment(Comment comment) {
		logger.info("Publishing comment : " + comment.getText());
	}
	
	public String updateComment(Comment comment) {
		logger.info("Updating comment : " + comment.getText());
		return "SUCCESS";
	}
}
