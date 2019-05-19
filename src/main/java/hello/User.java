package hello;

import java.util.LinkedList;
import java.util.List;

public class User {
	
	private int id;
	private String username;
	private String name;
	private String email;
	private String password;
	private List<Topic> topics;
	private List<Comment> comments;
	private List<Integer> followersIds;
	private List<Integer> followingsIds;

	public User(int id, String username, String name, String email, String password) {
		this.id = id;
		this.username = username;
		this.name = name;
		this.email = email;
		this.password = password;
		this.topics = new LinkedList<>();
		this.comments = new LinkedList<>();
		this.followersIds = new LinkedList<>();
		this.followingsIds = new LinkedList<>();
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

	public List<Integer> getFollowersIds() {
		return followersIds;
	}

	public void setFollowersIds(List<Integer> followers) {
		this.followersIds = followers;
	}

	public List<Integer> getFollowingsIds() {
		return followingsIds;
	}

	public void setFollowingsIds(List<Integer> followings) {
		this.followingsIds = followings;
	}

	public void addFollowingId(int id) {
		this.followingsIds.add(id);
	}

	public void addFollowerId(int id) {
		this.followersIds.add(id);
	}
}
