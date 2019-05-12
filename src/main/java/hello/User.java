package hello;

import java.util.LinkedList;
import java.util.List;

public class User {
	
	private int id;
	private String username;
	private String name;
	private String email;
	private String password;
	private List<Topic> topics = new LinkedList<Topic>();
	private List<Comment> comments = new LinkedList<Comment>();
	
	public User(int id, String username, String name, String email, String password) {
		this.id = id;
		this.username = username;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getName() {
		return name;
	}

	public void getName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Topic> getTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}

	public void addTopic(Topic topic) { topics.add(topic); }

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
}
