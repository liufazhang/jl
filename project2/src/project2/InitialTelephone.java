package project2;
//import com.imooc.telephone;
import project2.telephone;
public class InitialTelephone {

	static int num=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		telephone tl = new telephone();
		telephone tl2 = new telephone(5.5f,2f,3f);
		
		System.out.println(InitialTelephone.num);
		tl2.setScreen(5.8f);
		System.out.println(tl2.getScreen());
	}

}
