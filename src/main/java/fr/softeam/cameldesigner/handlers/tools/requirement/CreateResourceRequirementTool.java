package fr.softeam.cameldesigner.handlers.tools.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;

@objid ("a5d43dcf-2849-446c-b522-1fbd710cb6c7")
public class CreateResourceRequirementTool extends DefaultBoxTool {
    @objid ("b37286bb-8840-4815-a3c8-bcd4fc910cdb")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        // TODO Auto-generated method stub
        return false;
    }

    @objid ("d4dc9a2d-71ef-4f74-a899-fd4e3151e6bc")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        // TODO implement the CreateResourceRequirementTool handler. 
        MessageDialog.openInformation(Display.getDefault().getActiveShell(), "CreateResourceRequirementTool", "Tool not implemented!");
    }

}
