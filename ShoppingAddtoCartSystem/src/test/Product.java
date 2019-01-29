package test;
public class Product {
	String Code,Name;
	double Qty;
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getQty() {
		return Qty;
	}
	public void setQty(double qty) {
		Qty = qty;
	}
	public boolean equals(Object o) {
		if(o instanceof Product)
			return((Product)o).Code.equals(Code);
		else
			return false;
	}
}
