package top.heyuantao.manager.pojo;

public class User {
	
   private Integer id;
   private String name;
   private String pwd;
   private String dianhua;
   private String dizhi;
   
public User() {
	super();
}
public User(Integer id, String name, String pwd, String dianhua, String dizhi) {
	super();
	this.id = id;
	this.name = name;
	this.pwd = pwd;
	this.dianhua = dianhua;
	this.dizhi = dizhi;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getDianhua() {
	return dianhua;
}
public void setDianhua(String dianhua) {
	this.dianhua = dianhua;
}
public String getDizhi() {
	return dizhi;
}
public void setDizhi(String dizhi) {
	this.dizhi = dizhi;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", pwd=" + pwd + ", dianhua=" + dianhua + ", dizhi=" + dizhi + "]";
}
}
