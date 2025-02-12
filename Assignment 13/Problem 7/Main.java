class Main{
	
	public static void main(String[] args){
		SocialMediaFriendConnections l1 = new SocialMediaFriendConnections();
	
		l1.addLast(12, "Kushagra Sharma", 21);
		l1.addLast(23, "Naman Agarwal", 22);
		l1.addLast(42, "Akshat Singh", 20);
		l1.addLast(25, "Vedansh Gautam", 21);
		l1.addLast(85, "Nikhil Agrawal", 24);
		l1.addLast(57, "Rishank Mehrotra", 19);
		
		
		l1.addFriend(12, 23);
		l1.addFriend(12, 25);
		l1.addFriend(12, 85);
		l1.addFriend(12, 57);
		
		l1.addFriend(23, 85);
		
		l1.addFriend(42, 23);
		l1.addFriend(42, 12);
		
		l1.mutualFriends(12, 23);
		l1.mutualFriends(12, 42);
		
		l1.allFriends(12);
		
		l1.removeFriend(12, 42);
		
		l1.allFriends(12);
	
	}

}