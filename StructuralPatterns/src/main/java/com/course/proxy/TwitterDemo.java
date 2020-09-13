package com.course.proxy;

public class TwitterDemo {

	public static void main(String[] args) {
		
		//TwitterService service = (TwitterService)SecurityProxy.newInstance(new TwitterServiceStub());
		TwitterService service = (TwitterService)SecurityProxy.newInstance(new TwitterServiceImpl());
		
		System.out.println(service.getTimeline("b"));
		
		service.postTotimeline("b", "some message that shoudn't go through.");
	}
}
