package day13;
abstract class Water{
	public  void water() {};
}
interface Filter{}
interface Buffer {}
interface Heating {}
interface Sugar {}
class Drinks1 extends Water implements Filter,Buffer{}
class Drinks2 extends Water implements Buffer,Heating{}
class Drinks3 extends Water implements Filter,Sugar{}
public class LianXi5 {

}
