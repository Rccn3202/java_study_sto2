package javaHeight03;

public class Animal {
	private String kind; //동물종류
	private int lifespan; //수명
	
	public Animal(String kind, int lifespan) {
		this.kind = kind;
		this.lifespan = lifespan;
	}
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getLifespan() {
		return lifespan;
	}
	public void setLifespan(int lifespan) {
		this.lifespan = lifespan;
	}

	@Override
	public int hashCode() {
		
		return kind.hashCode()+lifespan;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Animal) {
			Animal target = (Animal) obj;
			return target.kind.equals(this.kind) && target.lifespan==this.lifespan;
		}
		return false;
	}
	
}


