package oneToone;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class DL {
	@Id
	private int dlNo;
	private LocalDate issueDate;
	private LocalDate exprDate;
	//@Transient
	private String authName;
	@OneToOne
	private Person person;
	public DL() {
		// TODO Auto-generated constructor stub
	}
	public DL(int dlNo, LocalDate issueDate, LocalDate exprDate, String authName) {
		super();
		this.dlNo = dlNo;
		this.issueDate = issueDate;
		this.exprDate = exprDate;
		this.authName = authName;
	}
	public int getDlNo() {
		return dlNo;
	}
	public void setDlNo(int dlNo) {
		this.dlNo = dlNo;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
	public LocalDate getExprDate() {
		return exprDate;
	}
	public void setExprDate(LocalDate exprDate) {
		this.exprDate = exprDate;
	}
	public String getAuthName() {
		return authName;
	}
	public void setAuthName(String authName) {
		this.authName = authName;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "DL [dlNo=" + dlNo + ", issueDate=" + issueDate + ", exprDate=" + exprDate + ", authName=" + authName
				+ "]";
	}
	
	
}
