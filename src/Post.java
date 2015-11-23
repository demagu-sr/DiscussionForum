import interfaces.PostMethods;

import java.util.Date;


public class Post implements PostMethods {
	
	public int id;
	public int groupId;
	public int createdBy;
	public String content;
	public Date createdDate;
	public boolean isPinned;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public boolean isPinned() {
		return isPinned;
	}
	public void setPinned(boolean isPinned) {
		this.isPinned = isPinned;
	}
	
	//definitions incomplete
	
	@Override
	public void updatePost() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deletePost() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
