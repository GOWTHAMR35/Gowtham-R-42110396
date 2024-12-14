package trialanderror;

public class Payment {
	void processpayment()
	{
		System.out.println("Payment process appeared here");
	}
}
class CashPayment extends Payment
{
	void processpayment()
	{
		System.out.println("Cash Payment");
	}
}
class CardPayment extends Payment
{
	void processpayment()
	{
		System.out.println("Card Payment");
	}
}
