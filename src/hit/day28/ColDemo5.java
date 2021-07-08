package hit.day28;

//import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ColDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColDemo5 obj=new  ColDemo5();
		Set<Question> qset= obj.getQuestionSet();
		
		System.out.println(qset);

	}
	public Set<Question> getQuestionSet(){
		
		//Set<Question> questionSet= new TreeSet<Question>(new MyQuestionComparator());
//		//Set<Question> questionSet=new TreeSet<Question>(new Comparator<Question>() {@Override
//		
//		public int compare(Question o1, Question o2) {
//			// TODO Auto-generated method stub
//			return o1.compareTo(o2);
//		}
//		});
		Set<Question> questionSet=new TreeSet<Question>((q1,q2)->{return q2.qid.compareTo(q1.qid);});
		Question Q1=new Question("1", "Who is CM", "Chief MINISTER", "Central Minister", "Cabinet Minister", "1");
		Question Q2=new Question("2", "Who is PM", "Prime MINISTER", "Central Minister", "Cabinet Minister", "1");
		Question Q3=new Question("3", "Who is HM", "Home MINISTER", "Central Minister", "Cabinet Minister", "1");
		
		questionSet.add(Q1);
		questionSet.add(Q2);
		questionSet.add(Q3);
		
		return questionSet;
	}
}
//class MyQuestionComparator implements Comparator<Question>{
//	@Override
//	public int compare(Question o1, Question o2) {
//		// TODO Auto-generated method stub
//		return o1.qid.compareTo(o2.qid);
//	}
//	
//}
class Question implements Comparable<Question>{
	String qid,question,option1,option2,option3,answer;

	public Question(String qid, String question, String option1, String option2, String option3, String answer) {
		
		this.qid = qid;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [qid=" + qid + ", question=" + question + ", option1=" + option1 + ", option2=" + option2
				+ ", option3=" + option3 + ", answer=" + answer + "]\n";
	}
	@Override
	public int compareTo(Question o) {
		// TODO Auto-generated method stub
		return this.qid.compareTo(o.qid);
	}
	
}