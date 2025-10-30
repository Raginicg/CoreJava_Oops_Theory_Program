package Basic;

class TStudent implements Cloneable{
	int rollNo;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone(); // by default clone method give shallow copy
	}
}
public class ShallowAndDeepCopy {

	public static void main(String[] args) throws CloneNotSupportedException{
		TStudent s=new TStudent();
		s.rollNo=4;
		
		//TStudent s2=s;// reference copy
		//------------------------------------Shallow copy---------------------------------
		TStudent s2=(TStudent)s.clone();  // need to typecast because clone method is taking the object
		s2.rollNo=8;
		
		System.out.println(s.rollNo); // give same value
		System.out.println(s2.rollNo);// give same value because its point same reference address
	}
}

// Shallow copy-->Reference is copy 
// Deep copy--> Value is copied 