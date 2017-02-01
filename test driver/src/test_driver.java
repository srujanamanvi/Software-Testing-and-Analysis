import java.util.Scanner;

public class test_driver {
public static void main(String[] args) {
	int x = 0;
	vending_machine vm = new vending_machine();
	Scanner scanner = new Scanner(System.in);
	while(true){
	System.out.println("select the method you want to call:");
	System.out.println("1.coin()\n2.small_cup\n3.large_cup()\n4.sugar()\n5.tea()\n6.insert_large_cups()"
			+ "\n7.insert_small_cups()\n8.set_price()\n9.cancel()\n10.dispose()\n");
	System.out.println("Other options:\n11. show_variables()\n12. quit\n");	
    int number = scanner.nextInt();
    
	switch(number){
	case 1: x = vm.coin();
	        System.out.println(x);
	        break;
	case 2: x = vm.small_cup();
	        System.out.println(x);
	        break;
	case 3: x = vm.large_cup();
	        System.out.println(x);
	        break;
	case 4: x = vm.sugar();
	        System.out.println(x);
	        break;
	case 5: x = vm.tea();
	        System.out.println(x);
	        break;
	case 6: System.out.println("Enter the number of large cups to be inserted:\n");
	        int n = scanner.nextInt();
		    x = vm.insert_large_cups(n);
		    System.out.println(x);
		    break;
	case 7: System.out.println("Enter the number of small cups to be inserted:\n");
	        int n1 = scanner.nextInt();
	        x = vm.insert_small_cups(n1);
	        System.out.println(x);
	        break;
	case 8: System.out.println("Enter the price to be set for tea:\n");
	        int n2 = scanner.nextInt();
	        x = vm.set_price(n2);
	        System.out.println(x);
	        break;
	case 9: x = vm.cancel();
	        System.out.println(x);
	        break;
	case 10: x = vm.dispose();
	         System.out.println(x);
	         break;
	case 11: show_variables(vm);
	         break;
	case 12: System.exit(0);
	default: System.out.println("invalid condition");
	         break;	
	}
  }		
}

private static void show_variables(vending_machine vm) {
	int price = vm.getpvalue();
	int k = vm.getkvalue();
	int k1 = vm.getk1value();
	int t = vm.gettvalue();
	int s = vm.getsvalue();
	System.out.println("price: "+price+" k: "+k+" k1: "+k1+" s: "+s+" t: "+t);
	// TODO Auto-generated method stub	
	
}
}
