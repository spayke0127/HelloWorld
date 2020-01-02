package Classes;

public class FriendUniv extends Friend {
	private String univ;
	private String major;

	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public FriendUniv(String name, String phone, String univ, String major) {
		super(name, phone);
		this.univ = univ;
		this.major = major;
	}

	@Override
	public void introduce() { // public String toString() {
		System.out
				.println("이름은 : " + super.getName() + "연락처는: " + super.getPhone() + "학교: " + univ + " 전공은 : " + major);

	}
}
