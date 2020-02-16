package _07_tea_party;

public class TeaParty {
	private String name;
	private boolean isWoman;
	private boolean isKnighted;
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setIsWoman(boolean isWoman) {
		this.isWoman = isWoman;
	}
	public void setIsKnighted(boolean isKnighted) {
		this.isKnighted = isKnighted;
	}
	public String getName() {
		return name;
	}
	public boolean getIsKnighted() {
		return isKnighted;
	}
	public boolean getIsWoman() {
		return isWoman;
	}
	
}
