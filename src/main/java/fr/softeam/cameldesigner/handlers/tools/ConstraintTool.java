package fr.softeam.cameldesigner.handlers.tools;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramLink.LinkRouterKind;
import org.modelio.api.modelio.diagram.ILinkPath;
import org.modelio.api.modelio.diagram.tools.DefaultAttachedBoxTool;

public class ConstraintTool extends DefaultAttachedBoxTool {
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic originNode, final LinkRouterKind routerType, final ILinkPath path, final Point point) {
        // TODO implement the ConstraintTool handler. 
        MessageDialog.openInformation(Display.getDefault().getActiveShell(), "ConstraintTool", "Tool not implemented!");
    }

    @Override
    public void actionPerformedInDiagram(final IDiagramHandle diagramHandle, final Rectangle rect) {
        // TODO Auto-generated method stub
    }

}
