package day10;
/**练习：抽象类*/
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
	public abstract void showJob();//抽象方法
}
class CodeJob extends Job{
	private int codingLines;
	private int bugs;
	public CodeJob(String jobType, int codingLines, int bugs) {
		super(jobType);//调用父类构造
		this.codingLines = codingLines;
		this.bugs = bugs;
	}
	@Override
	public void showJob() {
		System.out.println("工作类型："
				+getJobType()
				+",每天代码行数："
				+codingLines
				+",代码行错误数："+bugs);
	}
	
}
public class TestJob {
	public static void main(String[] args) {
		CodeJob code = new CodeJob("编码工作", 1000, 10);
		code.showJob();

	}

}
