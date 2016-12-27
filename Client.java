package movie_manager;

import java.util.ArrayList;

public class Client {
	ArrayList<Movie> repository = new ArrayList<Movie>();
	public Client(){
	}
	public void searchByShowTime(String input) {
		int count = 0;
		for (int i = 0;i<repository.size();i++) {
			if (input.equals(repository.get(i).getShowTime())) {
				count++;
				repository.get(i).show();
				System.out.println("------------");
			}
		}
		if(count==0)
			System.out.println("no this media,please search another");
	}
	
	public void searchByName(String input){
		for(Movie m : repository){
			if(m.getName().equals(input)){
				m.show();
				System.out.println("-----------");
			}
		}
	}
	
	public void purchase(String movieName,int ticket_num){
		for(Movie m : repository){
			if(m.getName().equals(movieName)){
				Movie temp = repository.get(repository.indexOf(m));
				if( temp.getTickets() != 0 && temp.getTickets()-ticket_num < 0 ) {
					System.out.println("票数不足，请修改票数重新购买");
				}
				if(temp.getTickets()==0){
					System.out.println("电影票已售空");
				}
				if( temp.getTickets()!=0 && temp.getTickets()-ticket_num>=0 ){
					temp.tickets -= ticket_num;
					System.out.print(temp.getName()+" ");
					System.out.println("购买成功");
					System.out.println("票数: "+ticket_num);
					System.out.println("欢迎下次光临");
				}
			}
		}
	}

}
