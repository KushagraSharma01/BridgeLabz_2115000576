class PenDivide{
	public static void main(String[] args){
		int pens = 14, students = 3;
		//remaining pens which are not distributed
		int remPens = pens%students;
		//pen each student will get
		int penEach = pens/students;
		System.out.print("The Pen Per Student is "+penEach+" and the remaining pen not distributed is "+remPens);
	}
}