package fr.softeam.cameldesigner.handlers.tools.metadata;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;

@objid ("b82c6687-0c1d-4c00-9ff6-a99ac40d6188")
public class MMSProperty extends DefaultBoxTool {
    @objid ("42dab16c-9d84-4615-8a41-28e2e4ad01d7")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        return true;
    }

    @objid ("d558e555-6338-4cea-b4f4-98f9699a1308")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        // TODO implement the MMSProperty handler. 
        MessageDialog.openInformation(Display.getDefault().getActiveShell(), "MMSProperty", "Tool not implemented!");
    }

}
