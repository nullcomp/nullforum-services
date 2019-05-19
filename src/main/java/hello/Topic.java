package hello;

import java.util.List;

public class Topic extends Comment {
	
	private String title;

	public Topic(int id, String content, String title, String image, int authorId, Date publishDate) {
		super(id, content, image, authorId,publishDate);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
