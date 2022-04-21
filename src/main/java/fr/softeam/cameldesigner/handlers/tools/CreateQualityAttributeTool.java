package fr.softeam.cameldesigner.handlers.tools;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;

@objid ("33aacf72-e60c-466d-aeb8-186c4e993a46")
public class CreateQualityAttributeTool extends DefaultBoxTool {
    @objid ("77f9f0c7-5bab-42c7-91f4-c13014b7d7a9")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        // TODO Auto-generated method stub
        return false;
    }

    @objid ("bd6667e7-18c3-46a2-acf1-951d2549b122")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        // TODO implement the CreateQualityAttributeTool handler. 
        MessageDialog.openInformation(Display.getDefault().getActiveShell(), "CreateQualityAttributeTool", "Tool not implemented!");
    }

}
