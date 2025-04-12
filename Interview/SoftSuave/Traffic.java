package SoftSuave;
import java.util.*;
public class Traffic {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number of signals: ");
        int signals = sc.nextInt();
        int [] signal_duration = new int[signals+1];
        int [] red_light_duration = new int[signals];
        int [] green_light_duration = new int[signals];
        int [] road_way = new int[signals];
        double speed;
        int [] encount_delay = new int[signals];
        double total_time = 0;

        System.out.print("Do the signals have the same time intervals between them? (y or n):");
        switch (sc.next().charAt(0)){
            case 'y' : {
                System.out.print("Enter the time interval between each signal, including the last signal to the destination:");
                int each_duration = sc.nextInt();
                for(int i=0;i<=signals;i++){
                    signal_duration[i] = each_duration;
                }
                break;
            }
            case 'n' : {
                for(int i=0;i<=signals;i++){
                    if(i==signals){
                        System.out.print("Enter the time from signal #"+(i)+" to the destination:");
                        signal_duration[i] = sc.nextInt();
                    }
                    else{
                        System.out.print("Enter the time to signal #"+(i+1)+":");
                        signal_duration[i] = sc.nextInt();
                    }
                }
                break;
            }
            default:{
                System.out.println("Enter the correct value ....!");
                break;
            }
        }//switch end
        System.out.print("Do the signals have the same red and light duration? (y or n):");
        switch (sc.next().charAt(0)){
            case 'y' :{
                System.out.print("Enter the red light duration:");
                int red_light = sc.nextInt();
                for(int i=0;i<signals;i++){
                    red_light_duration[i] = red_light;
                }

                System.out.print("Enter the green light duration:");
                int green_light = sc.nextInt();
                for(int i=0;i<signals;i++){
                    green_light_duration[i] = green_light;
                }

                break;
            }
            case 'n' :{

                for(int i=0;i<signals;i++){
                    System.out.print("Enter the red light duration at signal #"+(i+1)+":");
                    red_light_duration[i] = sc.nextInt();
                    System.out.print("Enter the green light duration at signal #"+(i+1)+":");
                    green_light_duration[i] = sc.nextInt();
                }

                break;
            }
            default:{
                System.out.println("Enter the correct value ....!");
                break;
            }
        }//switch end

        System.out.print("Are all signals two-way roads? (y or n):");

        switch (sc.next().charAt(0)){
            case 'y' :{
                for(int i=0;i<signals;i++){
                    road_way[i] = 2;
                }
                break;
            }
            case 'n' :{
                for(int i=0;i<signals;i++){
                    System.out.print("Enter the number of paths at signal #"+(i+1)+"(2-4):");
                    road_way[i] = sc.nextInt();
                }
                break;
            }
            default:{
                System.out.println("Enter the correct value ....!");
                break;
            }
        }//switch end

        System.out.print("Enter your travel speed multiplier for road conditions (e.g., 1.0 for normal, 0.8 for fast, 1.2 for slow):");
        speed = sc.nextDouble();

        System.out.print("Did you encounter any unexpected delays? (y or n):");
        switch (sc.next().charAt(0)){
            case 'y' :{
                for(int i=0;i<signals;i++){
                    System.out.print("Enter the delay at signal #"+(i+1)+"(in seconds):");
                    encount_delay[i] = sc.nextInt();
                }
                break;
            }
            case 'n' :{
                for(int i=0;i<signals;i++){
                    encount_delay[i] = 0;
                }
                break;
            }
            default:{
                System.out.println("Enter the correct value ....!");
                break;
            }
        }

        //time calculatiion

        for(int i=0;i<signals;i++){
            double time_temp = (signal_duration[i]*speed) + encount_delay[i];
            double time_total_temp = time_temp+total_time;
            double time_minus = time_total_temp;

            int signal_time = green_light_duration[i]+(red_light_duration[i]*(road_way[i]-1));

            while(time_minus>signal_time){
                time_minus-=signal_time;
            }

            if(time_minus>green_light_duration[i]){
                int temp_signal_time = signal_time;
                while(signal_time<time_total_temp){
                    signal_time+=temp_signal_time;
                }
                total_time = signal_time;
                System.out.println("total time : " + total_time);

                continue;
            }
            total_time+=time_temp;
            System.out.println("total time : " + total_time);
        }
        total_time += signal_duration[signals] * speed;
        System.out.println("Total time is : " +(int)total_time);
    }
}
