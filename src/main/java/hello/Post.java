package src.main.java.hello;

public abstract class Post {
	
	private int id;	
	private User author;
	private Date publishDate;
	
	public Post(int id, User author, Date publishDate) {
		this.id = id;
		this.author = author;
		this.publishDate = publishDate;
	}
	
	public int getId() {
		return id;
	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
}
