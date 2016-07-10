// default package
// Generated Jul 10, 2016 7:22:32 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * GroupMembers generated by hbm2java
 */
@Entity
@Table(name = "group_members", catalog = "OAuth")
public class GroupMembers implements java.io.Serializable {

	private Long id;
	private String username;
	private long groupId;

	public GroupMembers() {
	}

	public GroupMembers(String username, long groupId) {
		this.username = username;
		this.groupId = groupId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "username", nullable = false, length = 50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "group_id", nullable = false)
	public long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

}