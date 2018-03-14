package melo.maven.learn.first.model;

public class User {
	private String username, password;
    private Group group;

    /*
     * Many frameworks doing serialization/deserialization unfortunately requires this
     */
    public User() {
    }

    public User(String username, String password, Group group) {
        this.username = username;
        this.password = password;
        this.group = group;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
