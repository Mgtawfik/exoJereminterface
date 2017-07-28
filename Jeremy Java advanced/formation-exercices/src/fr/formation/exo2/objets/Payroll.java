/**
 * 
 */
package fr.formation.exo2.objets;


public interface Payroll {
	
	/** M�thode permettant de calculer le salaire de l'employ�.
	 * Cette m�thode est abstraite car elle n'est pas impl�ment�e dans cette classe, mais sera impl�ment�e par les classes enfants
	 * (qui utilisent "extends Emploee").
	 * @return int le montant du salaire mensuel de l'employ�
	 * @throws pour documenter les exceptions
	 * @author tk
	 *
	 */
	
	public int calculateSalary();

	
	/** 
	 * 
	 *  
	 * @return String permet de r�cup�rer le nom complet de la m�thode associ�e � la paye.
	 */
	
	public String getName();
	
	

}
