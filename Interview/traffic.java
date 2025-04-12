import java.util.Scanner;

public class traffic {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no of signal ");
		int signal=s.nextInt();
		int duration[]=new int[signal+1];
		int redLight[]=new int[signal];
		int greenLight[]=new int[signal];
		int delay[]=new int[signal];
		int path[]=new int[signal];
		double speed;
		double total = 0;
		
		System.out.println("Do the signals have the same time intervals between them? (y or n):");
		switch(s.next().charAt(0)) {
		case 'y':
			System.out.println("Enter the time interval between each signal, including the last signal to the destination:");
			int temp=s.nextInt();
			for(int i=0;i<=signal;i++) {
				duration[i]=temp;
			}
			break;
		case 'n':
			for(int i=0;i<=signal;i++) {
				if(i==signal){
                    System.out.print("Enter the time from signal #"+(i)+" to the destination:");
                    duration[i] = s.nextInt();
                }else {
                	System.out.println("Enter the time to signal "+i+1+":");
                	duration[i]=s.nextInt();
                }
            }
			break;
		default:
			System.out.println("Invalid...");
			break;
		}
		 
		System.out.println("Do the signals have the same red and light duration? (y or n):");
		switch(s.next().charAt(0)) {
		case 'y':
			System.out.println("Enter the red light duration:");
			int temp=s.nextInt();
			for(int i=0;i<signal;i++) {
				redLight[i]=temp;
			}
			System.out.println("Enter the green light duration:");
			int temp1=s.nextInt();
			for(int i=0;i<signal;i++) {
				greenLight[i]=temp1;
			}
			break;
		case 'n':
			for(int i=0;i<signal;i++) {
				System.out.println("Enter the red light duration at signal #"+i+1+":");
				redLight[i]=s.nextInt();
				System.out.println("Enter the green light duration at signal #"+i+1+":");
				greenLight[i]=s.nextInt();
			}
			break;
		default:
			System.out.println("Invalid...");
			break;
		}
		
		System.out.println("Are all signals two-way roads? (y or n):");
		switch(s.next().charAt(0)) {
		case 'y':
			for(int i=0;i<signal;i++) {
				path[i]=2;
			}
			break;
		case 'n':
			for(int i=0;i<signal;i++) {
				System.out.println("Enter the number of paths at signal #"+i+1+"(2-4):");
				path[i]=s.nextInt();
			}
			break;
		default:
			System.out.println("Invalid...");
			break;
		}
		
		System.out.println("Enter your travel speed multiplier for road conditions (e.g., 1.0 for normal, 0.8 for fast, 1.2 for slow):");
		speed=s.nextDouble();
		
		System.out.println("Did you encounter any unexpected delays? (y or n)");
		switch(s.next().charAt(0)) {
		case 'y':
			
			for(int i=0;i<signal;i++) {
				System.out.println("Enter the delay at signal #"+i+1+"(in seconds):");
				delay[i]=s.nextInt();
			}
			break;
		case 'n':
			for(int i=0;i<signal;i++) {
				delay[i]=0;
			}
			break;
		default:
			System.out.println("Invalid...");
			break;
		}
		
		
		for(int i=0;i<signal;i++) {
			
			double timetaken=(duration[i]*speed)+delay[i];
			double totaltime=total+timetaken;
			double totalminus=totaltime;
			
			int signalTime=greenLight[i]+(redLight[i]*(path[i]-1));
			
			while(signalTime<totalminus) {
				totalminus-=signalTime;
			}
			
			if(totalminus>greenLight[i]) {
				int tempSignal=signalTime;
				while(signalTime<totaltime) {
					signalTime+=tempSignal;
				}
				total=signalTime;
				System.out.println("total time : " + total);
				continue;

			}
			total+=timetaken;
			System.out.println("Total time is : " +total);
		}
		total+=duration[signal]*speed;
		System.out.println("Total time is : " +(int)total);
		
	}
	
}
