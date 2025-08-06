package Many_To_Many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Course {
	@Id
	@GeneratedValue
		private int id;
		private String name;
		
		@ManyToMany
		List<Student> s;

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

		public List<Student> getS() {
			return s;
		}

		public void setS(List<Student> s) {
			this.s = s;
		}

		public Course(int id, String name, List<Student> s) {
			super();
			this.id = id;
			this.name = name;
			this.s = s;
		}

		public Course() {
			super();
			// TODO Auto-generated constructor stub
		}
}
