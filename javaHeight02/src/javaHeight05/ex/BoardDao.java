package javaHeight05.ex;

import java.util.ArrayList;
import java.util.List;



public class BoardDao {
	
	public List<Board> getBoardList(){
	List<Board> list = new ArrayList<Board>();
	
		
		
	
	list.add(new Board("����1","����1"));
	list.add(new Board("����2","����3"));
	list.add(new Board("����3","����3"));
	return list;
}

}
