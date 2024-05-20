package fatec;

import java.util.ArrayList;
import java.util.List;

public class Person{
	private int id;
    private String name;
    private int age;
    private List<Email> emails;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.emails = new ArrayList<>();
    }

    public void addEmail(Email email) {
        this.emails.add(email);
        email.setPerson(this); // Configurando a referência da pessoa no email
    }

    public List<Email> getEmails() {
        return this.emails;
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

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

   
}
