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

@objid ("0c6d0b34-59a3-479b-9218-71d4b599022e")
public class IfThenConstraintTool extends DefaultAttachedBoxTool {
    @objid ("2699b536-e62d-4398-8a1d-0fa99c6c24e6")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        // TODO Auto-generated method stub
        return false;
    }

    @objid ("bff0e42e-4101-4aef-9daf-f8182ce34912")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic originNode, final LinkRouterKind routerType, final ILinkPath path, final Point point) {
        // TODO implement the IfThenConstraintTool handler. 
        MessageDialog.openInformation(Display.getDefault().getActiveShell(), "IfThenConstraintTool", "Tool not implemented!");
    }

    @objid ("3ad21b7c-2ec2-4586-8aeb-ed9c495fcd3e")
    @Override
    public void actionPerformedInDiagram(final IDiagramHandle diagramHandle, final Rectangle rect) {
        // TODO Auto-generated method stub
    }

}
