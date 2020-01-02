package test;

import Classes.Friend;

public class SwimmingMember extends SwimmingExe {
private String member;
private String major;



public String getMember() {
	return member;
}



public void setMember(String member) {
	this.member = member;
}



public String getMajor() {
	return major;
}



public void setMajor(String major) {
	this.major = major;
}



@Override
public String toString() {
	return "Swimming [member=" + member + ", major=" + major + "]";
}

}
