package movie_manager;

import java.util.ArrayList;

public class MovieSet {
	MovieSet(){}
	ArrayList<Movie>repository=new ArrayList<Movie>();
	public boolean movieAdd(String name,String director,String actor,String screenTime,String showTime,String video_hall){
		repository.add(new Movie(name,director,actor,screenTime,showTime,video_hall));
		return true;
	}
	public boolean moveRemove(String name,String showTime){
		for(Movie m:repository){
			if(m.getName().equals(name)&&m.getShowTime().equals(showTime)){
				m.show();
				System.out.println("�Ƿ���Ҫɾ��");
				//�˴�����¼���׽��
				//if(��)
					repository.remove(m);
					return true;
			}
			else{
				System.out.println("û�иõ�Ӱ");
			}
		}
		return false;
	}
}

