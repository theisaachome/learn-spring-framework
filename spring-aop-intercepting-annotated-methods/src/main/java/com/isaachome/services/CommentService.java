package com.isaachome.services;


import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.isaachome.aop.ToLog;
import com.isaachome.model.Comment;

@Service
public class CommentService {
	private Logger logger = Logger.getLogger(CommentService.class.getName());
	public void pushComment(Comment comment) {
		logger.info("Publishing comment : " + comment.getText());
	}
	
	@ToLog
	public void deleteComment(Comment comment) {
		logger.info("Deleting comment : " + comment.getText());
	}
	public void editingComment(Comment comment) {
		logger.info("Editing comment : " + comment.getText());
	}
}
