package lab03_bt2_phanSo;

public class phan_so {
	private int tuSo;
	private int mauSo;
	//Constructor
	phan_so(){
		this.tuSo = 1;
		this.mauSo = 1;
	}
	phan_so(int t,int m){
		if(m<0) {
			m = m * -1;
			t = t *-1;
		}
		this.tuSo = t;
		this.mauSo = m;
		rutGon();
		
	}
	
	//getter/setter
	public int getTuSo() {
		return tuSo;
	}
	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}
	public int getMauSo() {
		return mauSo;
	}
	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}
	
	//Algorithm
	//* * * rut gon
	public void rutGon() {
		int a = this.tuSo;
		int b = this.mauSo;
		int temp;
	    while ( b!= 0) 
	    {
	        temp = a % b;
	        a = b;
	        b = temp;
	    }
	    this.tuSo = this.tuSo / a;
	    this.mauSo = this.mauSo /a;
	}
	
	public phan_so plus(phan_so a) {
		phan_so tmp = new phan_so();
		tmp.setTuSo(this.tuSo * a.getMauSo() + this.mauSo * a.getTuSo());  
		tmp.setMauSo(this.mauSo * a.getMauSo());
		tmp.rutGon();
		return tmp;
	}
	
	public phan_so minus(phan_so a) {
		phan_so tmp = new phan_so();
		tmp.setTuSo(this.tuSo * a.getMauSo() - this.mauSo * a.getTuSo());  
		tmp.setMauSo(this.mauSo * a.getMauSo());
		return tmp;
	}
	
	public phan_so times(phan_so a) {
		phan_so tmp = new phan_so();
		tmp.setTuSo(this.tuSo * a.getTuSo());
		tmp.setMauSo(this.mauSo * a.getMauSo());
		if(tmp.getMauSo() <0) {
			tmp.setTuSo(tmp.getTuSo()* -1);
			tmp.setMauSo(tmp.getMauSo()* -1);
		}
		tmp.rutGon();
		return tmp;
	}
	
	public phan_so divine(phan_so a) {
		phan_so tmp = new phan_so();
		tmp.setTuSo(this.tuSo * a.getMauSo());
		tmp.setMauSo(this.mauSo * a.getTuSo());
		if(tmp.getMauSo() <0) {
			tmp.setTuSo(tmp.getTuSo()* -1);
			tmp.setMauSo(tmp.getMauSo()* -1);
		}
		tmp.rutGon();
		return tmp;
	}
	
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(!(obj instanceof phan_so)) {
			return false;
		}
		phan_so tmp = (phan_so) obj;
		tmp.rutGon();
		if(this.tuSo == tmp.tuSo && this.mauSo == tmp.mauSo) {
			return true;
		}
		return false;
	}
	
	public void PrintThis() {
		System.out.println(this.tuSo + "/" + this.mauSo);
	}
	

}
