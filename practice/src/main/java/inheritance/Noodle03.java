package inheritance;

/* protected保持父类成员对其子类、其自己包中的文件以及另一个包中此类的子类可访问。
 *在父类方法的访问修饰符之前添加final使得任何子类都不能修改该方法 - 它是不可变的。 
 */
public class Noodle03 { 
	
	private double lengthInCentimeters;
	private double widthInCentimeters;
	private String shape;
	protected String ingredients;
	private String texture = "brittle";
	
	Noodle03(double lenInCent,double wthInCent,String shp,String ingr) {
		
		this.lengthInCentimeters = lenInCent;
		this.widthInCentimeters = wthInCent;
		this.shape = shp;
		this.ingredients = ingr;
		
	}
	
	public final boolean isTasy() {
		return true;
	}
	
	public static void main(String[] args) {
		Ramen yasaiRamen = new Ramen();
		
		System.out.println(yasaiRamen.ingredients);
		System.out.println(yasaiRamen.isTasy());
	}
 
}
