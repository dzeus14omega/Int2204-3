package lab03_bt2_phanSo;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phan_so a = new phan_so(45,23);
		phan_so b = new phan_so(49,20);
		phan_so tmp = new phan_so();
		
		tmp = a.plus(b);
		System.out.print("Tong hai phan so a va b la: \n");
		tmp.PrintThis();
		
		tmp = a.minus(b);
		System.out.println("Hieu 2 phan so a va b la: ");
		tmp.PrintThis();
		
		tmp = a.times(b);
		System.out.println("Tich 2 phan so a va b la: ");
		tmp.PrintThis();
		
		tmp = a.divine(b);
		System.out.println("Thuong 2 phan so a va b la: ");
		tmp.PrintThis();
		
		if(a.equals(b)) {
			System.out.println("a va b bang nhau!");
		} else {
			System.out.println("a va b khong bang nhau!");
		}
	}

}
