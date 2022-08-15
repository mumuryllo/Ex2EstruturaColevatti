
public class Controller {

	public int vetorNegativo(int[] vetor, int index) {
		if(index == 0) {
			return 0;
		}
		
		if(vetor[index - 1] < 0) {
			return 1+vetorNegativo(vetor, index - 1);
		}
		
		return vetorNegativo(vetor, index - 1);
	}
	
}
