package fr.softeam.cameldesigner.handlers.tools.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;

/**
 * @author kchaabouni
 */
@objid ("bc88f7ef-e788-4de4-aeec-8a42935e60d8")
public abstract class CreateSubModelTool extends DefaultBoxTool {
    @objid ("af2b339a-4f9c-4d67-b8f7-5ca301eb6362")
    public boolean acceptElement(final IDiagramGraphic targetNode) {
        return
                targetNode.getElement() instanceof org.modelio.metamodel.uml.statik.Package
                && ((org.modelio.metamodel.uml.statik.Package) targetNode.getElement())
                .isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelModel.STEREOTYPE_NAME);
    }

}
