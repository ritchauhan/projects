package com.dev.controller;

import com.dev.domain.Topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		return Arrays.asList(
			new Topic("Java", "Tech", "Programming language"),
			new Topic("JS", "Scripting", "Web scripting tech")
		);
	}
}
