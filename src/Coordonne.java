
public class Coordonne {
	
	//final indique qu'un �l�ment ne peut �tre chang� dans la suite du programme
	private final int x;
	private final int y;
	
	public Coordonne(int x,int y) {
		this.x=x;
		this.y=y;
		
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordonne other = (Coordonne) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

}
