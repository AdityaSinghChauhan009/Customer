package assignment1.in.ac.kletech;

abstract public class Customer {

	int iCustomerId;
	String sCustomerName;
	long lPhoneNumber;
	float fBillAmount;
	
	
	
	public Customer(int iCustomerId,String sCustomerName,long lPhoneNumber,float fBillAmount){
		this.iCustomerId=iCustomerId;
		this.sCustomerName=sCustomerName;
		this.lPhoneNumber=lPhoneNumber;
		this.fBillAmount=fBillAmount;
	}
	

	abstract void bill();
}	
	class RegularCustomer extends Customer{
		double dDiscount;
		
		RegularCustomer(int iCustomerId,String sCustomerName,long lPhoneNumber,float fBillAmount)
		{
			super(iCustomerId,sCustomerName,lPhoneNumber,fBillAmount);
			
		}
		void bill(){
			dDiscount= fBillAmount-0.05*fBillAmount;
			System.out.println("THE BILL AMOUNT IS"+dDiscount+"\n");
		}
	}
	class PrivilegedCustomer extends Customer{
		String sMemberCardType;
		Double dFinalBill;
		PrivilegedCustomer(int iCustomerId,String sCustomerName,long lPhoneNumber,float fBillAmount,String sMemberCardType)
		{
			super(iCustomerId,sCustomerName,lPhoneNumber,fBillAmount);
			this.sMemberCardType=sMemberCardType;
			
		}
		void bill(){
			if (sMemberCardType=="***"){
				dFinalBill=fBillAmount-fBillAmount*0.4;
				System.out.println("THE BILL AMOUNT IS "+dFinalBill+"\n");
			}
			else if(sMemberCardType=="**"){
				dFinalBill=fBillAmount-fBillAmount*0.3;
			System.out.println("THE BILL AMOUNT IS "+dFinalBill+"\n");
			}
			else{
				dFinalBill=fBillAmount-fBillAmount*0.2;
			System.out.println("THE BILL AMOUNT IS "+dFinalBill+"\n");
			}
				
					

		}
		
	}
	


