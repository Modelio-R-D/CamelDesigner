package fr.softeam.cameldesigner.handlers.tools.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;

@objid ("3bcb901d-5b82-4f97-8dd6-76e4f3678895")
public class ServiceLevelObjective extends DefaultBoxTool {
    @objid ("6899aab8-8321-48d4-a231-9362cb535088")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        // TODO Auto-generated method stub
        return true;
    }

    @objid ("1c5d14ec-f1e8-40a8-9fc7-9452324190bd")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        // TODO implement the ServiceLevelObjective handler.
        MessageDialog.openInformation(Display.getDefault().getActiveShell(), "ServiceLevelObjective", "Tool not implemented!");
    }

}
