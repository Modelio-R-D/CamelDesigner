package fr.softeam.cameldesigner.handlers.tools.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;

@objid ("46e2895f-3385-43ac-84bc-bc23d2b13ee6")
public class OptimisationRequirement extends DefaultBoxTool {
    @objid ("83511f85-32d7-4985-b45b-94292a724ac3")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        // TODO Auto-generated method stub
        return false;
    }

    @objid ("80dc4042-2047-47e5-91db-a40471cfdcdb")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        // TODO implement the OptimisationRequirement handler. 
        MessageDialog.openInformation(Display.getDefault().getActiveShell(), "OptimisationRequirement", "Tool not implemented!");
    }

}
