package src.main.java.hello;

import java.util.List;

public class Topic extends Comment {
	
	private String title;

	public Topic(int id, String content, String title, String image, User author, List<Comment> comments, int likes, int dislikes,
			Date publishDate) {
		super(id, content, image, author, comments, likes, dislikes, publishDate);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
