package springmvcapp.o2formData;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {

	private long id;

	@NotBlank(message = "{error.name.empty}")
	@Size(min = 2, max = 20, message = "{error.name.size}")
	@Pattern(regexp="^[\\p{Alnum}\\s]+$", message="{error.name.characters}")
	@CapitalizedConstraint(message = "{error.name.capitalization}")
	private String name;


	public User(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public User() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
