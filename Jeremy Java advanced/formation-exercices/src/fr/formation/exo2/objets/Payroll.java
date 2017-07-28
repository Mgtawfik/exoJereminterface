/**
 * 
 */
package fr.formation.exo2.objets;


public interface Payroll {
	
	/** Méthode permettant de calculer le salaire de l'employé.
	 * Cette méthode est abstraite car elle n'est pas implémentée dans cette classe, mais sera implémentée par les classes enfants
	 * (qui utilisent "extends Emploee").
	 * @return int le montant du salaire mensuel de l'employé
	 * @throws pour documenter les exceptions
	 * @author tk
	 *
	 */
	
	public int calculateSalary();

	
	/** 
	 * 
	 *  
	 * @return String permet de récupérer le nom complet de la méthode associée à la paye.
	 */
	
	public String getName();
	
	

}
