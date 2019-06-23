package exercises;

import java.util.Arrays;

/* 
 * 1. Make the JobCandidate class implement Comparable.  
 * 2. Add a JobCandadate instance that represents yourself, and use compareTo() to see who should be given the job.
 * 
 */

import java.util.List;

public class JobCandidate implements Comparable<JobCandidate> {

	private List<String> personalityTraits;
	private int hoursSpentCoding;
	private String teacherName;
	private int salaryRequired;

	public JobCandidate(List<String> personalityTraits, int hoursSpentCoding, String teacherName, int salaryRequired) {
		super();
		this.personalityTraits = personalityTraits;
		this.hoursSpentCoding = hoursSpentCoding;
		this.teacherName = teacherName;
		this.salaryRequired = salaryRequired;
	}

	public static void main(String[] args) {
		JobCandidate june = new JobCandidate(Arrays.asList(new String[] { "adaptable", "scatty", "curious" }), 650,
				"Vinny Wade", 1200000);
		JobCandidate marko = new JobCandidate(Arrays.asList(new String[] { "loyal", "friendly","hardworker"}),40,
				"Andrija and June", 2000);

		if (june.compareTo(marko) == 1) {
			System.out.println(june.compareTo(marko));
			System.out.println("June is a better candidate than Marko");
		} else if (june.compareTo(marko) == -1) {
			System.out.println("Marko is a better candidate than June");
		} else {
			System.out.println("Both candidates are equally good for this positiion.");
		}
		
		
		
	}

	@Override
	public int compareTo(JobCandidate candidate) {
		
		final int BEFORE = -1;
		final int EQUAL = 0;
		final int AFTER = 1;
		
				
		if (this.hoursSpentCoding>candidate.hoursSpentCoding) return AFTER;
		if (this.hoursSpentCoding<candidate.hoursSpentCoding) return BEFORE;
		if (this.hoursSpentCoding == candidate.hoursSpentCoding) return EQUAL;
		
		if (this.salaryRequired>candidate.salaryRequired) return AFTER;
		if (this.salaryRequired<candidate.salaryRequired) return BEFORE;
		if (this.salaryRequired == candidate.salaryRequired) return EQUAL;
		
		if (this.personalityTraits.size()>candidate.personalityTraits.size()) return AFTER;
		if (this.personalityTraits.size()<candidate.personalityTraits.size()) return BEFORE;
		if (this.personalityTraits.size()==candidate.personalityTraits.size()) return EQUAL;
		
		return EQUAL;
		
	}

	
	

}
