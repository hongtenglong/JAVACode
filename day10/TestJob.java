package day10;
/**��ϰ��������*/
abstract class Job{
	private String jobType;
	public String getJobType() {
		return jobType;
	}
	public Job(String jobType) {
		super();
		this.jobType = jobType;
	}
	public Job() {
	}
	public abstract void showJob();//���󷽷�
}
class CodeJob extends Job{
	private int codingLines;
	private int bugs;
	public CodeJob(String jobType, int codingLines, int bugs) {
		super(jobType);//���ø��๹��
		this.codingLines = codingLines;
		this.bugs = bugs;
	}
	@Override
	public void showJob() {
		System.out.println("�������ͣ�"
				+getJobType()
				+",ÿ�����������"
				+codingLines
				+",�����д�������"+bugs);
	}
	
}
public class TestJob {
	public static void main(String[] args) {
		CodeJob code = new CodeJob("���빤��", 1000, 10);
		code.showJob();

	}

}
