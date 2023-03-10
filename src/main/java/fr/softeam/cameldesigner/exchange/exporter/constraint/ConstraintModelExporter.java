package fr.softeam.cameldesigner.exchange.exporter.constraint;

import org.eclipse.emf.cdo.CDOObject;


import camel.constraint.ConstraintFactory;
import fr.softeam.cameldesigner.api.constraintmodel.standard.package_.ConstraintModel;
import fr.softeam.cameldesigner.exchange.exporter.core.SubModelExporter;

public class ConstraintModelExporter <T extends ConstraintModel> extends SubModelExporter<T> {

	public ConstraintModelExporter(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}
	

    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ConstraintFactory.eINSTANCE.createConstraintModel();
    }

    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.core.CamelModel) && (elt instanceof camel.constraint.ConstraintModel)) {
            ((camel.core.CamelModel) context).getConstraintModels().add((camel.constraint.ConstraintModel) elt);
        }else {
            super.attach(elt, context);
        }    
        }


}
