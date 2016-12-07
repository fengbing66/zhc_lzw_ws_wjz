package usst.zhc_lzw_ws_wjz.movieticketsale;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Movie {
	/**
	 * ��Ӱ������
	 */
	String name;
	String directorName;
	String type;
	String timeLength;
	String[] actor = new String[10];
	
	/**
	 * ��Ӱ����Ĺ��췽��
	 * ��������һ���������ɲ���Ӱ��
	 */
	Movie(String name,String directorName,String type){
		this.name = name;
		this.directorName = directorName;
		this.type = type;
	}
	
	Movie(){
		
	}
	
	/**
	 * ����õ�Ӱ�Ժ󣬴����Ӱ�����ʱ��
	 */
	public void setTimeLength(String timeLength){
		this.timeLength = timeLength;
	}
	
	/**
	 * ���õ�������ֵ�ķ���
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
