package com.course.proxy;

public class TwitterServiceStub implements TwitterService {

	public String getTimeline(String screenName) {
		return "My neato timeline";
	}

	public void postTotimeline(String screenName, String message) {
		
	}

}
