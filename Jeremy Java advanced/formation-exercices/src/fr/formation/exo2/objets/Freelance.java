package fr.formation.exo2.objets;

import java.util.ArrayList;
import java.util.List;

import fr.formation.exo2.Constants;



public class Freelance implements Payroll {
	
	private String name;
	private String siren;
	private List<Invoice> invoices;
	
	
	// Ne sert � rien de d�clarer un constructeur par d�faut car il existe implicitement
	public Freelance () {
		this.invoices = new ArrayList<>();
	}
	
	// Accesseurs
	public String getName() {
		return "L'ind�pendant " + name;
		//covariance: on utilise un type parent commune � tous les objets (ici l'interface)
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSiren() {
		return siren;
	}

	public void setSiren(String siren) {
		this.siren = siren;
	}

	public List<Invoice> getInvoices() {
		return invoices;
	}

	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}



	/**
	 * {@inheritDoc}
	 * H�rite de la Javadoc de Payroll
	 */
	
	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		int result = 0;
		for (final Invoice invoice : this.invoices) {
			if (!invoice.getLabel().startsWith(Constants.TRAVEL_FEES)) {
				result += invoice.getTotal();
			}
		}
		return result;
	} 
	
	

}
