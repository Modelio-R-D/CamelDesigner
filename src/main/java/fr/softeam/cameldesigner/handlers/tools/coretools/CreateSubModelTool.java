package fr.softeam.cameldesigner.handlers.tools.coretools;

import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;

/**
 * @author kchaabouni
 */
public abstract class CreateSubModelTool extends DefaultBoxTool {

    public boolean acceptElement(final IDiagramGraphic targetNode) {
        return
                targetNode.getElement() instanceof org.modelio.metamodel.uml.statik.Package
                && ((org.modelio.metamodel.uml.statik.Package) targetNode.getElement())
                .isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelModel.STEREOTYPE_NAME);
    }
}
