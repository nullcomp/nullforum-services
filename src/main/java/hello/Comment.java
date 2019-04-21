package src.main.java.hello;

import java.util.List;

public class Comment extends Post {
		
	private String content;
	private String image;
	private List<Comment> comments;
	private int likes;
	private int dislikes;
	
	public Comment(int id, String content, String image, User author, List<Comment> comments, int likes, int dislikes,
			Date publishDate) {
		super(id, author, publishDate);
		this.content = content;
		this.image = image;
		this.comments = comments;
		this.likes = likes;
		this.dislikes = dislikes;
	}
	
	public void addDislike(int dislikes) {
		this.dislikes++;
	}
	public void addLike(int likes) {
		this.likes++;
	}	
	public void unDislike(int dislikes) {
		this.dislikes--;
	}
	public void unLike(int likes) {
		this.likes--;
	}
	public int getRate() {
		return likes - dislikes;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public int getLikes() {
		return likes;
	}
	public int getDislikes() {
		return dislikes;
	}
}
