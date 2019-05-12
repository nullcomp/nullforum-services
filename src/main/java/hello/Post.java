package hello;

public abstract class Post {
	
	private int id;	
	private int authorId;
	private Date publishDate;
	
	public Post(int id, int authorId, Date publishDate) {
		this.id = id;
		this.authorId = authorId;
		this.publishDate = publishDate;
	}
	
	public int getId() {
		return id;
	}
	public int getAuthorId() {
		return authorId;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
}
