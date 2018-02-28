import java.util.ArrayList;
import java.util.Vector;

class Calc {
	private ArrayList<Account> array;
	private Vector<Janre> vector;
	private int count;
	
	Calc(ArrayList<Account> array, Vector<Janre> vector){
		this.array = array;
		this.vector = vector;
		initJanre();  //Janre vector 초기화 
	}
	
	private void initJanre(){
		String [] codeArray = {"팝송", "가요", "가극", "째즈"};
		for(int i = 0 ; i < codeArray.length ; i++){
			this.vector.addElement(new Janre());
			this.vector.elementAt(i).setName(codeArray[i]);
		}
	}
	
	void calc(){
		for(int i = 0 ; i < this.array.size() ; i++){
			int bunho = this.array.get(i).getBunho();
			String code = this.array.get(i).getCode();
			int su = this.array.get(i).getSu();
			if(bunho > 0 && bunho <= 35)  this.setKyonggi(code, su);
			else if(bunho > 35 && bunho <= 75)  this.setYoungnam(code, su);
			else if(bunho > 75 && bunho < 100) this.setChoongchung(code, su);
			this.setNum(code, su);
		}
	}
	
	private void setKyonggi(String code, int su){ //경기지역판매액계산
		//49:1, 50:2, 51:3, 52:4
		int kind = code.charAt(1);
		int kyonggi = this.vector.elementAt(kind - 49).getKyongi();
		int danga = getDanga(code);
		kyonggi += su * danga;
		this.vector.elementAt(kind - 49).setKyonggi(kyonggi);
	}
	
	private void setYoungnam(String code, int su){ //영남지역판매액계산
		//49:1, 50:2, 51:3, 52:4
		int kind = code.charAt(1);
		int youngnam = this.vector.elementAt(kind - 49).getYoungnam();
		int danga = getDanga(code);
		youngnam += su * danga;
		this.vector.elementAt(kind - 49).setYoungnam(youngnam);
	}
	
	private void setChoongchung(String code, int su){ //충청지역판매액계산
		//49:1, 50:2, 51:3, 52:4
		int kind = code.charAt(1);
		int choongchung = this.vector.elementAt(kind - 49).getChoongchung();
		int danga = getDanga(code);
		choongchung += su * danga;
		this.vector.elementAt(kind - 49).setChoongchung(choongchung);
	}
	
	private int getDanga(String code){
		//49:1, 50:2, 51:3, 52:4
		int kind = code.charAt(1);
		int danga = 0;
		switch(kind){
			case 49 : danga = 100; break;
			case 50 : danga = 300; break;
			case 51 : danga = 400; break;
			case 52 : danga = 200; break;
		}
		return danga;
	}
	
	private void setNum(String code, int su){  //쟝르별 판매량계산
		//49:1, 50:2, 51:3, 52:4
		int kind = code.charAt(1);
		int num = this.vector.elementAt(kind - 49).getNum();
		this.vector.elementAt(kind - 49).setNum(num + su);
	}
}
