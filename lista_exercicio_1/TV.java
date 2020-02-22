package lista_exercicio_1;

public class TV {
	private int canal;
	private int volume;
	
	public TV(int canal, int volume) {
		this.canal = canal;
		this.volume = volume;
	}
	
	public void mudarCanal(int canal) {
		this.canal = canal;
		if (this.canal > 250) {
			this.canal = 250;
		}
		if (this.canal < 0) {
			this.canal = 1;
		}
		System.out.println("Canal: "+this.canal);
	}
	
	public void aumentarVolume() {
		this.volume ++;
		if (this.volume > 100) {
			this.volume = 100;
		}
		System.out.println("Volume: "+this.volume);
	}
	
	public void diminuirVolume() {
		this.volume --;
		if (this.volume < 0) {
			this.volume = 0;
		}
		System.out.println("Volume: "+this.volume);
	}
	
	
}
