package One_To_One;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
@Id
@GeneratedValue
	private int id;
	private String name;
	
	
	public Person() {
		
	}
	
	public Person(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	@OneToOne
	private PanCard pc;

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

	public PanCard getPc() {
		return pc;
	}

	public void setPc(PanCard pc) {
		this.pc = pc;
	}
}
