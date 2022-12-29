import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class CreatPdf {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int cou=0;
		try {
			for(int i=0; i<101; i++) {
			FileWriter Obj = new FileWriter(cou +"yahya.Pdf");
			
			cou=cou+1;
			}
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
