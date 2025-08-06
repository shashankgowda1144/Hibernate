package Many_To_Many;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
		private int id;
		private String name;
		
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
		public Student(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
