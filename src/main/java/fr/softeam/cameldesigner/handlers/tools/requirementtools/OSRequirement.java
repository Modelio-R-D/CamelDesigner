package fr.softeam.cameldesigner.handlers.tools.requirementtools;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;

public class OSRequirement extends DefaultBoxTool {
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        // TODO implement the OSRequirement handler. 
        MessageDialog.openInformation(Display.getDefault().getActiveShell(), "OSRequirement", "Tool not implemented!");
    }

}
