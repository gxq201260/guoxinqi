package triangle;

public class Triangle {
	private int a;
	private int b;
	private int c;
	public Triangle(int a,int b,int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public String isTriangle(){
		if((a+b>c)&&(a+c>b)&&(b+c)>a){
			return "是三角形";
		}else{
			return "不是三角形";
		}
	}
	public String isEquilateral(){
		if(isTriangle().equals("是三角形")){
			if(a==b&&b==c){
				return "是等边三角形";
			}else{
				return "不是等边三角形";
			}
		}else{
			return "不是三角形";
		}
	}
	public String isIsosceles(){
		if(isTriangle().equals("是三角形")){
			if(a==b||a==c||b==c){
				return"是等腰三角形";
			}else{
				return "不是等腰三角形";
			}
		}else{
			return "不是三角形";
		}
		
	}
}

