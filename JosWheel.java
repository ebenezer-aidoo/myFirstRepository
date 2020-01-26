package org.amalitech.javarecap;
import java.util.Scanner;
public class JosWheel {

	public static void main(String[] args) {
		
		//Initializations
				boolean program_Running_bool = false;
				String code_trigger_stater_str = "start";
				String code_trigger_ender_str = "end";

				re_run_kybd_input(code_trigger_stater_str);
				//We need a trigger to end the code

				}

				static String code_trigger_ender_str = "end";

				private static void re_run_kybd_input(String code_trigger_stater_str) {
				boolean program_Running_bool;
				Scanner kybd_input = new Scanner (System.in);
				String kybd_input_str = kybd_input.nextLine();

				if (kybd_input_str.equalsIgnoreCase(code_trigger_stater_str)) {

				program_Running_bool = true;

				int x=0;
				int y=5;

				//We need a trigger to start the code
				while (program_Running_bool == true) {
				//the immediate code above is the same as
				//this very code below
				//while (program_Running_bool == true) {
				if(x<y) {


				System.out.println("We are still in the while: "
				//+x
				//the best way to do this is:
				+ Integer.toString(x));
				x= x + 1; //can also be written as x++
				}
				//x= x + 1;
				//we needed to move the code above
				//into the if (x<y) (..) code block

				else {
				program_Running_bool =false;
				System.out.println("we are still in the while loop");
				}
				//2. we need a trigger to the end the code
				}

				System.out.println("hurray!! we out are still in the while loop");
				}
				else if (kybd_input_str.equalsIgnoreCase(code_trigger_ender_str)) {
				System.out.println("The program has ended");
				
				System.exit(0);
				}
				else {
				System.out.println(// the user entered the wrong number
				"Please restart" + " and enter start to run code");
				re_run_kybd_input(code_trigger_stater_str);

				}

				re_run_kybd_input(code_trigger_stater_str);
				}

			}
