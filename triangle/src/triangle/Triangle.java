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
			return "��������";
		}else{
			return "����������";
		}
	}
	public String isEquilateral(){
		if(isTriangle().equals("��������")){
			if(a==b&&b==c){
				return "�ǵȱ�������";
			}else{
				return "���ǵȱ�������";
			}
		}else{
			return "����������";
		}
	}
	public String isIsosceles(){
		if(isTriangle().equals("��������")){
			if(a==b||a==c||b==c){
				return"�ǵ���������";
			}else{
				return "���ǵ���������";
			}
		}else{
			return "����������";
		}
		
	}
}

