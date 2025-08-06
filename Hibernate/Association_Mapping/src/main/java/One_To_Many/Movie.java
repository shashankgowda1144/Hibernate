package One_To_Many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Movie {
@Id
@GeneratedValue
	private int id;
	private String name;
	private int year;
	private String director;
	
	@OneToMany
	private List<Song> s;

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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public List<Song> getS() {
		return s;
	}

	public void setS(List<Song> s) {
		this.s = s;
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(int id, String name, int year, String director, List<Song> s) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.director = director;
		this.s = s;
	}
	



}
