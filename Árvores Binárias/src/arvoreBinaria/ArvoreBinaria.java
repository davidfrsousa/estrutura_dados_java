package arvoreBinaria;

public class ArvoreBinaria {
	private Nodo raiz;

	public ArvoreBinaria() {
		this.raiz = null;
	}
	
	public Nodo getRaiz() {
		return this.raiz;
	}
	
	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}
	
	public void imprime_preFixado() {
		preFixado(this.getRaiz());
	}
	
	private void preFixado(Nodo raiz) {
		if(raiz == null) {
			return;
		}
		System.out.println(raiz.getDado() + " ");
		preFixado(raiz.getFilhoEsq());
		preFixado(raiz.getFilhoDir());
	}
	
	public Nodo pesquisa(int valor) {
		Nodo resultado = pesquisaRecursivo(this.getRaiz(), valor);
		return resultado;
	}
	
	private Nodo pesquisaRecursivo(Nodo raiz, int valor) {
		if(raiz != null) {
			if(valor == raiz.getDado()) {
				return raiz;
			}else if(valor < raiz.getDado()) {
				return pesquisaRecursivo(raiz.getFilhoEsq(), valor);
			}else {
				return pesquisaRecursivo(raiz.getFilhoDir(), valor);
			}
		}
		return null;
	}
	
	public void inserir(int valor) {
		if(this.getRaiz() == null) {
			this.setRaiz(new Nodo(valor));
		}else {
			insere(this.getRaiz(), valor);
		}
	}
	
	public void insere(Nodo raiz,int valor) {
		if(raiz.getDado() > valor) {
			if(raiz.getFilhoEsq() == null) {
				Nodo novo = new Nodo(valor);
				raiz.setFilhoEsq(novo);
			}else {
				insere(raiz.getFilhoEsq(), valor);
			}
		}else if(raiz.getDado() < valor) {
			if(raiz.getFilhoDir() == null) {
				Nodo novo = new Nodo(valor);
				raiz.setFilhoDir(novo);
			}else {
				insere(raiz.getFilhoDir(), valor);
			}
		}
	}
	
	public void remover(int valor) {
		Nodo nodo = pesquisa(valor);
		if(nodo == null) {
			System.out.println("O valor" + valor + " não está na árvore");
		}else if(nodo.getFilhoEsq() == null && nodo.getFilhoDir() == null) {
			removeFolha(nodo);
		}else if(nodo.getFilhoEsq() != null && nodo.getFilhoDir() != null) {
			removeDoisFilhos(nodo);
		}else {
			removeUmFilho(nodo);
		}
	}
	
	private Nodo buscaPai(Nodo raiz, int valor) {
		if(raiz != null) {
			if(valor < raiz.getDado()) {
				if(raiz.getFilhoEsq() != null && raiz.getFilhoEsq().getDado() == valor) {
					return raiz;
				}else {
					return buscaPai(raiz.getFilhoEsq(), valor);
				}
			}else if(valor > raiz.getDado()) {
				if(raiz.getFilhoDir() != null && raiz.getFilhoDir().getDado() == valor) {
					return raiz;
				}else {
					return buscaPai(raiz.getFilhoDir(), valor);
				}
			}
		}
		return null;
	}

	private void removeFolha(Nodo nodo) {
		Nodo pai = buscaPai(this.getRaiz(), nodo.getDado());
		if(pai == null) {
			this.setRaiz(null);
		}else if(pai.getFilhoEsq() != null && pai.getFilhoEsq() == nodo) {
			pai.setFilhoEsq(null);
		}else {
			pai.setFilhoDir(null);
		}
	}

	private void removeUmFilho(Nodo nodo) {
		Nodo pai = buscaPai(this.getRaiz(), nodo.getDado());
		if(pai == null) {
			if(nodo.getFilhoEsq() != null) {
				this.setRaiz(nodo.getFilhoEsq());
			}else {
				this.setRaiz(nodo.getFilhoEsq());
			}
		}else if(nodo.getFilhoEsq() != null){
			if(nodo == pai.getFilhoEsq()) {
				pai.setFilhoEsq(nodo.getFilhoEsq());
			}else {
				pai.setFilhoDir(nodo.getFilhoEsq());
			}
		}else if(nodo.getFilhoDir() != null) {
			if(pai.getFilhoEsq() == nodo) {
				pai.setFilhoEsq(nodo.getFilhoDir());
			}else {
				pai.setFilhoDir(nodo.getFilhoDir());
			}
		}
	}
	
	private Nodo max(Nodo raiz) {
		if(raiz.getFilhoDir() == null) {
			return raiz;
		}else {
			return max(raiz.getFilhoDir());
		}
	}
	
	private void removeDoisFilhos(Nodo nodo) {
		Nodo pai = buscaPai(this.getRaiz(), nodo.getDado());
		Nodo max = max(nodo.getFilhoEsq());
		Nodo paiMax = buscaPai(nodo, max.getDado());
		
		nodo.setDado(max.getDado());
		if(max.getFilhoEsq() == null) {
			if(paiMax == nodo) {
				paiMax.setFilhoEsq(null);
			}else {
				paiMax.setFilhoDir(null);
			}
		}else {
			paiMax.setFilhoDir(max.getFilhoEsq());
		}
	}
	
}
