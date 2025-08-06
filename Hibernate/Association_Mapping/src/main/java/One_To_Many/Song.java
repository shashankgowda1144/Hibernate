package One_To_Many;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Song {
@Id
@GeneratedValue
	private int id;
	private String name;
	private String duration;
	private String singer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public Song(int id, String name, String duration, String singer) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.singer = singer;
	}
	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
