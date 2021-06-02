package fr.softeam.cameldesigner.handlers.tools.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;

@objid ("c1ff0464-415a-4898-9510-331217a2abdc")
public class ProviderRequirement extends DefaultBoxTool {
    @objid ("80293e00-eae3-494b-8f7b-a6dc2b3a57bf")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        // TODO Auto-generated method stub
        return false;
    }

    @objid ("f1982802-8341-4da9-ba3c-a8b39a80070e")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        // TODO implement the ProviderRequirement handler. 
        MessageDialog.openInformation(Display.getDefault().getActiveShell(), "ProviderRequirement", "Tool not implemented!");
    }

}
