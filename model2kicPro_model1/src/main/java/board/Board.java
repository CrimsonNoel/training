package board;

import java.util.Date;

public class Board {
	private int num;
	private String boardid;
	private String name;
	private String pass;
	private String subject;
	private String content;
	private String file1;
	private Date regdate;
	private int reflevel;
	private int readcnt;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getBoardid() {
		return boardid;
	}
	public void setBoardid(String boardid) {
		this.boardid = boardid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFile1() {
		return file1;
	}
	public void setFile1(String file1) {
		this.file1 = file1;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getReflevel() {
		return reflevel;
	}
	public void setReflevel(int reflevel) {
		this.reflevel = reflevel;
	}
	public int getReadcnt() {
		return readcnt;
	}
	public void setReadcnt(int readcnt) {
		this.readcnt = readcnt;
	}
	@Override
	public String toString() {
		return "Board [num=" + num + ", " + (boardid != null ? "boardid=" + boardid + ", " : "")
				+ (name != null ? "name=" + name + ", " : "") + (pass != null ? "pass=" + pass + ", " : "")
				+ (subject != null ? "subject=" + subject + ", " : "")
				+ (content != null ? "content=" + content + ", " : "") + (file1 != null ? "file1=" + file1 + ", " : "")
				+ (regdate != null ? "regdate=" + regdate + ", " : "") + "reflevel=" + reflevel + ", readcnt=" + readcnt
				+ "]";
	}
	
	
	

	
}
