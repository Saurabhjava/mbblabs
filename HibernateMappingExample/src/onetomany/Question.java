package onetomany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int qid;
	private String questionName;
	private String postedBy;
	@OneToMany(cascade = CascadeType.ALL)
	//@JoinTable(name="Question_Answer", joinColumns = {@JoinColumn(name="qid")},
	//inverseJoinColumns = {@JoinColumn(name="aid")})
	private Set<Answer> answers;
	
	public Question() {
		// TODO Auto-generated constructor stub
	}
	public Question(String questionName, String postedBy) {
		super();
		this.questionName = questionName;
		this.postedBy = postedBy;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestionName() {
		return questionName;
	}
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}
	public String getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
	public Set<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(Set<Answer> answers) {
		this.answers = answers;
	}
	
	
	
}
