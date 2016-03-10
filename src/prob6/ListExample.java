package prob6;

import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		BoardDao dao= new BoardDao();
		List<Board> list = dao.getBoardList();
		list.add(new Board("제목1","내용1"));
		list.add(new Board("제목2","내용2"));
		list.add(new Board("제목3","내용3"));
		
		for( Board board : list ) {
			System.out.println( board.getTitle() + "-" + board.getContent() );
		}

	}

}
