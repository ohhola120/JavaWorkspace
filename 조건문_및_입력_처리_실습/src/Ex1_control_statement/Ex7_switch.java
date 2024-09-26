package Ex1_control_statement;

public class Ex7_switch {
public static void main(String[] args) {
	
	//8월은 31일까지 있습니다.
	
	//2월은 28일까지 있습니다.
	
	// 13월은 없습니다
	//int month = 2;
	
	/*switch( month ) {
	case "1"://조건값
		System.out.println("31일까지 있습니다.");
		break;
	
	case '2' :
		System.out.println("28일까지 있습니다.");
		break;
	
	case "3":
		System.out.println("29일까지 있습니다.");
		break;
	
	case "4":
		System.out.println("30일까지 있습니다.");
		break;
	
	case "5":
		System.out.println("31일까지 있습니다.");
		break;
	
	case "6":
		System.out.println("30일까지 있습니다");
		break;
	
	case "7":
		System.out.println("31일까지 있습니다.");
		break;
	
	case "8":
		System.out.println("31일까지 있습니다.");
		break;
	
	case "9"://조건값
		System.out.println("30일까지 있습니다.");
		break;
	
	case "10":
		System.out.println("31일까지 있습니다.");
		break;
	
	case "11":
		System.out.println("30일까지 있습니다.");
		break;
	
	case "12":
		System.out.println("31일까지 있습니다.");
		break;
		
	//default:
		System.out.println(" "+ "월은 없습니다");
		break;*/
	
		
		//8월은 31일까지 있습니다.
		
		//2월은 28일까지 있습니다.
		
		// 13월은 없습니다
		int month = 13;
		
		switch( month ) {
		
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "월은 31일 까지 있습니다.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month + "월은 30일 까지 있습니다.");
			break;
		case 2:
			System.out.println("2월은 28일까지 있습니다.");
			
		default:
			System.out.println(month + "월은 없습니다.");
			break;
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}//main
}
