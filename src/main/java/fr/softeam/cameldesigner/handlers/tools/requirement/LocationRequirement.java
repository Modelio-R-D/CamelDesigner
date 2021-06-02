package fr.softeam.cameldesigner.handlers.tools.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;

@objid ("7eea7177-b5fc-4acc-aa5c-b84e0bad4ac4")
public class LocationRequirement extends DefaultBoxTool {
    @objid ("3273e78d-6bab-4abe-ada3-5abbd51eb9ff")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        // TODO Auto-generated method stub
        return false;
    }

    @objid ("cc08e20b-77ce-4e5b-af67-d1f0048c5121")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        // TODO implement the LocationRequirement handler. 
        MessageDialog.openInformation(Display.getDefault().getActiveShell(), "LocationRequirement", "Tool not implemented!");
    }

}
