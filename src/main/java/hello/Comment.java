package hello;

import java.util.LinkedList;
import java.util.List;

import hello.Post;

public class Comment extends Post {
		
	private String content;
	private String image;
	private List<Comment> comments;
	private int likes;
	private int dislikes;
	
	public Comment(int id, String content, String image, int authorId, Date publishDate) {
		super(id, authorId, publishDate);
		this.content = content;
		this.image = image;
		this.comments = new LinkedList<>();
		this.likes = 0;
		this.dislikes = 0;
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
