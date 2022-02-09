package fr.softeam.cameldesigner.handlers.tools.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;

@objid ("597a821b-64c4-4e64-b98b-e7e3c35cba0f")
public class ImageRequirementTool extends DefaultBoxTool {
    @objid ("19fd7d8a-5fce-4531-a60b-f0d19bd2e407")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        // TODO Auto-generated method stub
        return false;
    }

    @objid ("a6ddcce9-e144-4b6b-80ec-0a909dc38a0b")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        // TODO implement the CreateImageRequirementTool handler. 
        MessageDialog.openInformation(Display.getDefault().getActiveShell(), "CreateImageRequirementTool", "Tool not implemented!");
    }

}
