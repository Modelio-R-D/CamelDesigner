package fr.softeam.cameldesigner.handlers.tools.constraint;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramLink.LinkRouterKind;
import org.modelio.api.modelio.diagram.ILinkPath;
import org.modelio.api.modelio.diagram.tools.DefaultAttachedBoxTool;

@objid ("a550c4bf-453f-49da-a6b5-f42bb3c0bec6")
public class LogicalConstraintTool extends DefaultAttachedBoxTool {
    @objid ("40bae848-c77a-4f82-b432-a1d3c9f30902")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        // TODO Auto-generated method stub
        return false;
    }

    @objid ("dcb67dbf-0ad1-4274-bc9d-1ea9f9b89469")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic originNode, final LinkRouterKind routerType, final ILinkPath path, final Point point) {
        // TODO implement the LogicalConstraintTool handler. 
        MessageDialog.openInformation(Display.getDefault().getActiveShell(), "LogicalConstraintTool", "Tool not implemented!");
    }

    @objid ("cbe27121-91ff-4d5c-9157-db33cb52da21")
    @Override
    public void actionPerformedInDiagram(final IDiagramHandle diagramHandle, final Rectangle rect) {
        // TODO Auto-generated method stub
    }

}
