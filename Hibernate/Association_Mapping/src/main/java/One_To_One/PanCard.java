package One_To_One;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PanCard {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int PNo;
	
	public PanCard() {
		
	}
	public PanCard(int id,String name,int PNo) {
		this.id = id;
		this.name = name;
		this.PNo = PNo;
	}
	
	
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
	public int getPNo() {
		return PNo;
	}
	public void setPNo(int pNo) {
		PNo = pNo;
	}
	
	
	








}
