package model;

import java.util.regex.Pattern;

public class Loginlogic {
	public boolean execute(User user) {
		AccessUser accessUser = new AccessUser();
		
		// 正規表現でメール表示
		String pattern = "^[a-zA-Z0-9!#$%&'_`/=~\\*\\+\\-\\?\\^\\{\\|\\}]+(\\.[a-zA-Z0-9!#$%&'_`/=~\\*\\+\\-\\?\\^\\{\\|\\}]+)*+(.*)@[a-zA-Z0-9][a-zA-Z0-9\\-]*(\\.[a-zA-Z0-9\\-]+)+$";
		Pattern p = Pattern.compile(pattern);
		if (p.matcher(user.getId()).find()) {
			if (user.getPass().length()>=8) {
				User storedUser = accessUser.getUser(user.getId());
				if(storedUser != null) {
					if(user.getPass().equals(storedUser.getPass())) {
						return true;
					}
				}
			}
		}
		return false;
	}
	/*
	public boolean execute(User user) {
		if(user.getPass().equals("1111") & user.getId().equals("aaaaa@bb.com")) {return true;}
		
	return false;
	}
	*/
}