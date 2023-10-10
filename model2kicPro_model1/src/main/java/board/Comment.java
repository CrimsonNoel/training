package board;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Comment {
	private int ser;
	private int num;
	private Date regdate;
	private String content;
	private SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
	
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getSer() {
		return ser;
	}
	public void setSer(int ser) {
		this.ser = ser;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "Comment [ser=" + ser + ", num=" + num + ", " + (regdate != null ? "regdate=" + regdate + ", " : "")
				+ (content != null ? "content=" + content : "") + "]";
	}
	
	public String toHtml() {
		return "<p>"+content+"<span class='w3-right'>"+ sd.format(regdate)+"</p>"; 
	}
	
	
}
