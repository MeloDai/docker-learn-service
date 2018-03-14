package melo.maven.learn.first.model;

import melo.maven.learn.first.model.Group;
import melo.maven.learn.first.model.Session;
import melo.maven.learn.first.model.User;
import melo.maven.learn.first.security.*;

import java.util.ArrayList;
import java.util.List;

public class MockDao {
	private static MockDao instance = new MockDao();
    private List<User> users = new ArrayList<>();
    private List<Session> sessions = new ArrayList<>();

    private MockDao() {
        users.add(new User("a", "b", Group.ADMIN));
        users.add(new User("c", "d", Group.USER));

        sessions.add(new Session("a", "Asteroid B-612"));
        sessions.add(new Session("b", "the lamplighter"));
    }

    public void addUser(String username, String password) {
    	users.add(new User(username, password, Group.USER));
    	String token = new TokenProcessor().generateToken("Vicky",true); 
    	sessions.add(new Session(username, token));
    }
    
    public static MockDao getInstance() {
        return instance;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Session> getSessions() {
        return sessions;
    }
}
