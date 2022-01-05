package fr.softeam.cameldesigner.handlers.commands;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.elementmodel.umlmodel.UmlModelService;
import fr.softeam.cameldesigner.handlers.commands.createsubmodel.CreateSubModelCommand;
import fr.softeam.cameldesigner.representation.diagrams.CamelDiagramsService;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * @author kchaabouni
 */
@objid ("334a8866-11b6-455d-9c4f-9359ee400879")
public class CreateCamelModelCommand extends CreateSubModelCommand {
    @objid ("27d3cbc5-273b-4761-8e86-925c79bd7b45")
     CamelDiagramsService camelDiagramService = new CamelDiagramsService();

    @objid ("901d19bd-72a6-45a6-a479-8dd44ba6ef8c")
    private UmlModelService elementModelService = new UmlModelService();

    @objid ("abfb9318-43b7-4aa3-adc9-54a27a861a44")
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        ModelElement packageOwner = (ModelElement) selectedElements.get(0);
        
        try( ITransaction transaction = module.getModuleContext().getModelingSession().createTransaction("Create Camel Model")){
        
            this.elementModelService.createCamelModel(packageOwner, "CamelModel");
            transaction.commit ();
        }
    }

    @objid ("7fd71815-4bbb-40c1-ba4d-9ca3061f9a04")
    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        if ((selectedElements != null) && (selectedElements.size() == 1)){
            MObject selectedElt = selectedElements.get(0);
            return (
                    (((selectedElt instanceof Package)
                            && !(selectedElt instanceof Profile)
                            && selectedElt.getStatus().isModifiable()))
                    && ((Package) selectedElt).getExtension().isEmpty());
        }
        return false;
    }

}
