public class View {

	public static void main(String[] args) {
     Controller controller= new Controller();
     int[] vetor = {1, -1, 1, -1, 1, 1, -1};
     int resultado= controller.vetorNegativo(vetor, vetor.length);
     System.out.println(resultado);
	}

}
