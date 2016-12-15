package test;

public class Movie {
	String name;
	String director;
	String actor;
	String screenTime;
	String showTime; //∑≈”≥ ±º‰
	Movie(String name,String director,String actor,String screenTime,String showTime)
	{	this.name =name;
	this.director = director;	
	this.actor = actor;
	this.screenTime=screenTime;
	this.showTime = showTime;
	}
	private String getShowTime(String time)
	{
		return time;
	}
}
