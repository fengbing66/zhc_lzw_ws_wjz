package movie_manager;

public class MovieAdd {
	public MovieAdd(){
		
	}
	public void movieadd(){
		Backstage h1 = new Backstage();
		h1.movieAdd("123", "王加正", "王三木", "2015-10-8", "2017-9-7", "1号放映厅", 50);
		h1.movieAdd("456", "王加正", "王三木", "2015-10-8", "2017-9-8", "2号放映厅", 50);
		h1.movieAdd("789", "王加正", "王三木", "2015-10-8", "2017-9-8", "1号放映厅", 50);
		h1.movieAdd("0000", "王加正", "王三木", "2015-10-8", "2017-9-7", "1号放映厅", 50);
		Client q = new Client();
		q.repository = h1.repository;
	}

}
