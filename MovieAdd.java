package movie_manager;

public class MovieAdd {
	public MovieAdd(){
		
	}
	public void movieadd(){
		Backstage h1 = new Backstage();
		h1.movieAdd("123", "������", "����ľ", "2015-10-8", "2017-9-7", "1�ŷ�ӳ��", 50);
		h1.movieAdd("456", "������", "����ľ", "2015-10-8", "2017-9-8", "2�ŷ�ӳ��", 50);
		h1.movieAdd("789", "������", "����ľ", "2015-10-8", "2017-9-8", "1�ŷ�ӳ��", 50);
		h1.movieAdd("0000", "������", "����ľ", "2015-10-8", "2017-9-7", "1�ŷ�ӳ��", 50);
		Client q = new Client();
		q.repository = h1.repository;
	}

}
