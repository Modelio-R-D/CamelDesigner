package fr.softeam.cameldesigner.handlers.commands;

import java.util.List;
import fr.softeam.cameldesigner.elementmodel.umlmodel.UmlModelService;
import fr.softeam.cameldesigner.representation.diagrams.CamelDiagramsService;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * @author kchaabouni
 */
public class CreateCamelModelCommand extends DefaultModuleCommandHandler {
     CamelDiagramsService camelDiagramService = new CamelDiagramsService();

    private UmlModelService elementModelService = new UmlModelService();

    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        ModelElement packageOwner = (ModelElement) selectedElements.get(0);
        
        try( ITransaction transaction = module.getModuleContext().getModelingSession().createTransaction("Create Camel Model")){
        
            this.elementModelService.createCamelModel(packageOwner, "CamelModel");
            transaction.commit ();
        }
    }

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
