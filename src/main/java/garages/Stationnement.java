package garages;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Stationnement {

	private final Voiture myCar;
	private final Garage myGarage;

	private final Date entree = new Date(); // Aujourd'hui
	private Date fin;

	public Stationnement(Voiture v, Garage g) {
		this.myCar = v;
		this.myGarage = g;
	}

	public Voiture getCar() {
		return this.myCar;
	}

	public Garage getGarage() {
		return this.myGarage;
	}

	public Date getEntree() {
		return this.entree;
	}

	public Date getFin() {
		return this.fin;
	}

	public void terminer() {
		this.fin = new Date();
	}

	public boolean estEnCours() {
		return (this.fin == null);
	}

	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy");
		return String.format("Stationnement{ entree=%s, %s }",
			dateFormat.format(this.entree),
			estEnCours() ? "en cours" : "sortie=" + dateFormat.format(this.fin)
		);
	}

}
