package com.course.proxy;

public interface TwitterService {
	
	public String getTimeline(String screenName);
	public void postTotimeline(String screenName, String message);

}
