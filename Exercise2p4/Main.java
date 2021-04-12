package Exercise2p4;

public class Main {

	public static void main(String[] args) {
		Computer c = new Computer();
		
		c.setBrand("Acer");
		c.setModel("Aspire 5");
		c.setScRslt("1920 * 1080");
		c.setEdu("Do assignment");
		c.setWork("Complete the project");
		c.setEntertain("Play games, listen to music and watch movie");
		
		System.out.println("Brand                 : "+ c.getBrand());
		System.out.println("Model                 : "+ c.getModel());
		System.out.println("Screen Resolution     : "+ c.getScRslt());
		System.out.println("Function for school   : "+ c.getEdu());
		System.out.println("Function for work     : "+ c.getWork());
		System.out.println("Function for entertain: "+ c.getEntertain());
	}

}
