package usst.zhc_lzw_ws_wjz.movieticketsale;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Movie {
	/**
	 * 电影的属性
	 */
	String name;
	String directorName;
	String type;
	String timeLength;
	String[] actor = new String[10];
	
	/**
	 * 电影对象的构造方法
	 * 用来构造一部或者若干部电影。
	 */
	Movie(String name,String directorName,String type){
		this.name = name;
		this.directorName = directorName;
		this.type = type;
	}
	
	Movie(){
		
	}
	
	/**
	 * 构造好电影以后，传入电影对象的时长
	 */
	public void setTimeLength(String timeLength){
		this.timeLength = timeLength;
	}
	
	/**
	 * 设置单独属性值的方法
	 * @return
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String[] getActor() {
		return actor;
	}
	public String[] setActor(String[] actor) {
		return this.actor = actor;
	}
	public String getTimeLength() {
		return timeLength;
	}
	
	
}
