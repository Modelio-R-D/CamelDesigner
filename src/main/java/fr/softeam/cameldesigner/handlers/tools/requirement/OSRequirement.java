package fr.softeam.cameldesigner.handlers.tools.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;

@objid ("e12f23f6-a33a-4bc1-a067-9dd63e6a585d")
public class OSRequirement extends DefaultBoxTool {
    @objid ("33efed14-e528-4b4b-9f0b-f051a70c88b1")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        // TODO Auto-generated method stub
        return false;
    }

    @objid ("99b604b5-4048-4e72-9df2-00140ecf97c7")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        // TODO implement the OSRequirement handler. 
        MessageDialog.openInformation(Display.getDefault().getActiveShell(), "OSRequirement", "Tool not implemented!");
    }

}
