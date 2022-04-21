package fr.softeam.cameldesigner.handlers.tools;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;

@objid ("803efa81-617c-469c-b48e-94dcde82d373")
public class CreateMeasurableAttributeTool extends DefaultBoxTool {
    @objid ("c1fb65c3-d0aa-47a5-843d-54652038ecd0")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        // TODO Auto-generated method stub
        return false;
    }

    @objid ("3e453fa0-b415-42e8-8c98-72cb73026a22")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        // TODO implement the CreateMeasurableAttributeTool handler. 
        MessageDialog.openInformation(Display.getDefault().getActiveShell(), "CreateMeasurableAttributeTool", "Tool not implemented!");
    }

}
