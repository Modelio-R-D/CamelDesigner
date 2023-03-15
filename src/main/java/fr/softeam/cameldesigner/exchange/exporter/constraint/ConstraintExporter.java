package fr.softeam.cameldesigner.exchange.exporter.constraint;

import camel.constraint.ConstraintFactory;
import camel.constraint.ConstraintModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CamelConstraint;
import fr.softeam.cameldesigner.exchange.exporter.core.ExpendableElementExporter;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EObject;

@objid ("44e78fd3-bef1-4e93-a138-f63c2edbc1e7")
public abstract class ConstraintExporter<T extends CamelConstraint> extends ExpendableElementExporter<T> {
    @objid ("bc7f210a-0930-4bf6-aab8-461c4514d4fb")
    public ConstraintExporter(T elt) {
        super(elt);
    }

    @objid ("b6311091-d68c-4b86-9392-3aeb47008ed0")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("eb3a3a4a-e3b9-4139-8efa-65b482988723")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("5b27b170-a730-4454-8aa5-8857dd06ac08")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if (elt instanceof camel.constraint.Constraint) {
            ConstraintModel constraintModel = searchConstraintModel(context);
            if (constraintModel != null) {
                constraintModel.getConstraints().add((camel.constraint.Constraint) elt);
            }
        }
    }

    @objid ("ff733e29-8ff0-4638-8a39-bffb1bd0a84f")
    private ConstraintModel searchConstraintModel(CDOObject context) {
        //Looking for CamelModel
        EObject root = context;
        while (!(root instanceof camel.core.CamelModel)) {
            root = root.eContainer();
        }
        
        
        //Searching for Constraint Model
        ConstraintModel constraintModel = null;
        camel.core.CamelModel camelModel = (camel.core.CamelModel) root;
        
        if (camelModel.getConstraintModels().size() >0 ) {
            constraintModel = camelModel.getConstraintModels().get(0);
        }
        
        //Creating a new Constraint Model
        if (constraintModel == null) {
            constraintModel = ConstraintFactory.eINSTANCE.createConstraintModel();
            constraintModel.setName("ConstraintModel");
            camelModel.getConstraintModels().add(constraintModel);
        }
        return constraintModel;
    }

}
