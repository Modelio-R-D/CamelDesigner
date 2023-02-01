package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.ControlFlowRelation;

public class ControlFlowRelationPropertyPage  <T extends ControlFlowRelation> extends ComponentRelationPropertyPage<T>{

	public ControlFlowRelationPropertyPage(T elt) {
		super(elt);
	}

}
