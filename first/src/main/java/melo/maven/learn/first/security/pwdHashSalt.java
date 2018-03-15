package melo.maven.learn.first.security;

import melo.maven.learn.first.model.*;
import org.springframework.security.crypto.bcrypt.BCrypt;

public class pwdHashSalt {
	public static User setPwdHashSalt(User user) {
		String salt = BCrypt.gensalt();
		String pwdHash = getPwdHash(user.getPassword(), salt);
		user.setPwdHash(pwdHash);
		user.setPwdSalt(salt);
		return user;
	}
	
	public static String getPwdHash(String pwd, String salt) {
		String pwdHash = BCrypt.hashpw(pwd, salt);
		return pwdHash;
	}
}
