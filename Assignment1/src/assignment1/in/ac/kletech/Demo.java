package assignment1.in.ac.kletech;

public class Demo {

	public static void main(String[] args) {
	
		Customer[] c=new Customer[5];
		for(int i=0; i<c.length; i++){
            if(i%4==0)
             c[i]=new RegularCustomer(1+i, "Regular_Customer"+i,5678,1000);
            else
             c[i]=new PrivilegedCustomer(1+i,"Privilged_Customer"+i,3453,200*(i+1),"**");
        }
		for(int j=0;j<c.length;j++){
		System.out.println("NAME : "+c[j].sCustomerName);
		System.out.println("BASE BILL: "+c[j].fBillAmount);
		c[j].bill();
		}
		

	}

}
