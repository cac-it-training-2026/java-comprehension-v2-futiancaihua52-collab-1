package q01_basic.question06;

import java.io.IOException;

public class SystemMain06 {

	public static void main(String[] args) {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");
		//TODO ここから実装する
		int id = 0;
		String password = "";
		
		  try {
	            System.out.print("input id>>");
	            id = cr.inputNumber();

	            System.out.print("input password>>");
	            password = cr.inputString();

	        } catch (NumberFormatException e) {
	            System.out.println("error!");
	            e.printStackTrace();
	            return;

	        } catch (IOException e) {
	            e.printStackTrace();
	            return;
	        }
	            
	            // 会員作成
	            Member member = new Member(id, password, "Miura Manabu", 28, 2);

	            System.out.println("---SHOW MEMBER---");
	            member.showMember();
	        }
	}


