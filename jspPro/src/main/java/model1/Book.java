package model1;

import java.sql.Date;

public class Book {
		String writer;
		String title;
		String content;
		Date rdate;
		public Book(String writer, String title, String content) {
			super();
			this.writer = writer;
			this.title = title;
			this.content = content;
		}
		public String getWriter() {
			return writer;
		}
		public void setWriter(String writer) {
			this.writer = writer;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public Date getRdate() {
			return rdate;
		}
		public void setRdate(Date rdate) {
			this.rdate = rdate;
		}
		@Override
		public String toString() {
			return "Book [" + (writer != null ? "writer=" + writer + ", " : "")
					+ (title != null ? "title=" + title + ", " : "")
					+ (content != null ? "content=" + content + ", " : "") + (rdate != null ? "rdate=" + rdate : "")
					+ "]";
		}
		
		
}
