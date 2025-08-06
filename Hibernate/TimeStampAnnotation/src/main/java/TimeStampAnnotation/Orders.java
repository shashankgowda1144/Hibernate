package TimeStampAnnotation;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Orders {
	
	public Orders() {
		
	}
	
public Orders(int id, String name, long phone, String adress, LocalDateTime orderDateTime, LocalDateTime deleiverDateTime) {
		this.id =  id;
		this.name = name;
		this.phone = phone;
		this.address = adress;
		this.orderDateTime = orderDateTime;
		this.deleiverDateTime = deleiverDateTime;
	}
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long phone;
	private String address;
	
	@CreationTimestamp
	private LocalDateTime orderDateTime;
	@UpdateTimestamp
	private LocalDateTime deleiverDateTime;



}
