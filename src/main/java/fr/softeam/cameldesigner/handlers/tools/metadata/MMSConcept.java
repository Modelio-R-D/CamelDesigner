package fr.softeam.cameldesigner.handlers.tools.metadata;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;

@objid ("b2e14c3c-7f3c-4a5a-8b34-c8c8ec608160")
public class MMSConcept extends DefaultBoxTool {
    @objid ("dfa1d0f1-b271-4014-969c-4e0ece5c0fd1")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        return false;
    }

    @objid ("f5dd22a8-401f-4a1d-9ca8-881b62e1e531")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        // TODO implement the MMSConcept handler.
        MessageDialog.openInformation(Display.getDefault().getActiveShell(), "MMSConcept", "Tool not implemented!");
    }

}
