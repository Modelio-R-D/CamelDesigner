package fr.softeam.cameldesigner.handlers.commands;

import java.util.List;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.elementmodel.umlmodel.UmlModelService;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * @author kchaabouni
 */
public abstract class CreateCamelSubModelCommand extends DefaultModuleCommandHandler {
    private String subModelName;

    private String subModelStereotype;

    private String subModelDiagramName;

    private String subModelDiagramStereotype;

    private UmlModelService elementModelService = new UmlModelService();

    public CreateCamelSubModelCommand(String subModelName, String subModelStereotype, String subModelDiagramName, String subModelDiagramStereotype) {
        super();
        this.subModelName = subModelName;
        this.subModelStereotype = subModelStereotype;
        this.subModelDiagramName = subModelDiagramName;
        this.subModelDiagramStereotype = subModelDiagramStereotype;
    }

    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        Package owner = (Package) selectedElements.get(0);
        try( ITransaction transaction = module.getModuleContext().getModelingSession().createTransaction("Create Camel SubModel")){
        
            this.elementModelService.createSubModel(owner, this.subModelName, this.subModelStereotype, this.subModelDiagramName, this.subModelDiagramStereotype);
            transaction.commit ();
        }
    }

    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        if ((selectedElements != null) && (selectedElements.size() == 1)){
            MObject selectedElement = selectedElements.get(0);
            return (
                    ((selectedElement instanceof Package
                            && ((Package)selectedElement).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel.STEREOTYPE_NAME)
                            && selectedElement.getStatus().isModifiable())));
        }
        return false;
    }

}
