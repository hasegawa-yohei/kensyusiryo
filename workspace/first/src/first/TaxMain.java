package first;

public class TaxMain {

	public static void main(String[] args) {

		int priceInt =100;
		double priceDouble =200.0;
		String priceString="300";

		//static定義されているのでインスタンス化せずにメソッドが使える（Tax.calc(priceInt)）
		System.out.println(priceInt+"円の消費税は"+Tax.calc(priceInt)+
				"円です。税込み"+(priceInt+Tax.calc(priceInt))+"円です");

		System.out.println((int)priceDouble+"円の消費税は"+Tax.calc(priceDouble)+
        		"円です。税込み"+((int)priceDouble+Tax.calc(priceDouble))+"円です");

        System.out.println(priceString+"円の消費税は"+Tax.calc(priceString)+
                "円です。税込み"+(Integer.parseInt(priceString)+Tax.calc((priceString))+"円です"));
	}

}
