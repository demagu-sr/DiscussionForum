import interfaces.UserMethods;


public class User implements UserMethods {
	
	public int id;
	public String username;
	public String password;
	public String email;
	public String image_url;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	
	//// Write definition for unimplemented methods
	
	
	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addNewPost() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deletePost() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void browseThroughGroups() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void upvotePost() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void downvotePost() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
