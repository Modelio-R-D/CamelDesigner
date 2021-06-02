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

@objid ("11b81048-71a1-48c2-8f02-825139b20fd9")
public class ConstraintTool extends DefaultAttachedBoxTool {
    @objid ("b69c48a8-797b-4cba-8629-cf59dd8f2df1")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        // TODO Auto-generated method stub
        return false;
    }

    @objid ("42e42e49-38c7-4c2a-906c-50a3389a5dd3")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic originNode, final LinkRouterKind routerType, final ILinkPath path, final Point point) {
        // TODO implement the ConstraintTool handler. 
        MessageDialog.openInformation(Display.getDefault().getActiveShell(), "ConstraintTool", "Tool not implemented!");
    }

    @objid ("873334cc-7356-4965-8d17-fc4850afc0f2")
    @Override
    public void actionPerformedInDiagram(final IDiagramHandle diagramHandle, final Rectangle rect) {
        // TODO Auto-generated method stub
    }

}
