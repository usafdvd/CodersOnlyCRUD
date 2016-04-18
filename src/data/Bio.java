package data;

public class Bio {
	private String id;
	private String name;
	private String like1;
	private String like2;
	private String like3;
	private String animal;
	private String sign;
	private String quote;
	private String image;
	
	public Bio() {
	}

	public Bio(String id, String name, String like1, String like2, String like3, String animal, String sign, String quote, String image) {
		this.id = id;
		this.name = name;
		this.like1 = like1;
		this.like2 = like2;
		this.like3 = like3;
		this.animal = animal;
		this.sign = sign;
		this.quote = quote;
		this.image = image;

	}
	public String getImage() {
		return image;
	}
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public String getLike1() {
		return like1;
	}

	public String getLike2() {
		return like2;
	}

	public String getLike3() {
		return like3;
	}
	public String getAnimal() {
		return animal;
	}
	public String getSign() {
		return sign;
	}

	public String getQuote() {
		return quote;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLike1(String like1) {
		this.like1 = like1;
	}

	public void setLike2(String like2) {
		this.like2 = like2;
	}

	public void setLike3(String like3) {
		this.like3 = like3;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}
	
	@Override
	public String toString() {
		return "Bio [name=" + name + ", like1=" + like1 + ", like2=" + like2 + ", like3=" + like3 + ", animal=" + animal
				+ ", sign=" + sign + ", quote=" + quote + "]";
	}
}