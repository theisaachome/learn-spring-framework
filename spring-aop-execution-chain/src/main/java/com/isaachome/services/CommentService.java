package com.isaachome.services;


import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.isaachome.aop.ToLog;
import com.isaachome.model.Comment;

@Service
public class CommentService {
	private Logger logger = Logger.getLogger(CommentService.class.getName());
	@ToLog
	public String pushComment(Comment comment) {
		logger.info("Publishing comment : " + comment.getText());
		return "SUCCESS";
	}
	
}
