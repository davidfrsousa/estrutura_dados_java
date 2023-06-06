package arvoreBinaria;

public class Nodo {
	private int dado;
	private Nodo filhoEsq;
	private Nodo filhoDir;
	
	public Nodo(int dado) {
		super();
		this.dado = dado;
	}
	public int getDado() {
		return dado;
	}
	public void setDado(int dado) {
		this.dado = dado;
	}
	public Nodo getFilhoEsq() {
		return filhoEsq;
	}
	public void setFilhoEsq(Nodo filhoEsq) {
		this.filhoEsq = filhoEsq;
	}
	public Nodo getFilhoDir() {
		return filhoDir;
	}
	public void setFilhoDir(Nodo filhoDir) {
		this.filhoDir = filhoDir;
	}
	
	
}
