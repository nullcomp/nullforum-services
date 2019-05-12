package hello;

import java.util.List;

public class Topic extends Comment {
	
	private String title;

	public Topic(int id, String content, String title, String image, int authorId, List<Comment> comments, int likes, int dislikes,
			Date publishDate) {
		super(id, content, image, authorId, comments, likes, dislikes, publishDate);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
