package first;
 class Tax {

	public static final double rate =0.05;

	//メソッド名は同じだが、引数がそれぞれ異なるので定義できる(オーバーロード)
	public static int calc(int price) {
		return (int)(price*rate);
	}
	public static int calc(double price) {
		return(int)(((int)price) *rate);
	}
	public static int calc(String price) {
		return(int)(Integer.parseInt(price)*rate);
	}

    public static final double rate1 =1.05;
    public static int total(int price) {
		return (int)(price*rate1);
	}
	public static int total(double price) {
		return(int)(((int)price) *rate1);
	}
	public static int total(String price) {
		return(int)(Integer.parseInt(price)*rate1);
	}


 }
