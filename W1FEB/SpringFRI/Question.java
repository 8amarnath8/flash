import java.util.Iterator;  
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;  
public class Question {
	private int id;  
	private String name;  
	private Map<Answer,User> answers;  
	
	public Question() {}  
	public Question(int id, String name,  Map<Answer, User> answers) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.answers = answers;  
	}  
	public void displayInfo(){  
	    System.out.println("question id:"+id);  
	    System.out.println("question name:"+name);  
	    System.out.println("Answers....");  
	    /*
	     * Set<Entry<String , String> set =answers.entrySet();
	     * Iterator<Entry<String,String>> itr=set.iterator();
	     * while(its.hashNext())
	     * {
	     * Entry<String,String> entry=itr.next();
	     * 
	     * }*/
	    Set<Entry<Answer, User>> set=answers.entrySet();  
	    Iterator<Entry<Answer, User>> itr=set.iterator();  
	    while(itr.hasNext()){  
	        Entry<Answer, User> entry=itr.next(); 
	        Answer ans=entry.getKey();  
	        User user=entry.getValue();  
	        System.out.println("Answer Information:");  
	        System.out.println(ans);  
	        System.out.println("Posted By:");  
	        System.out.println(user);  
	         
	    }  
	}  
}
