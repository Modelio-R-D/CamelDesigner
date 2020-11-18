package fr.softeam.cameldesigner.handlers.tools;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;

public class MMSProperty extends DefaultBoxTool {
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        return true;
    }

    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        // TODO implement the MMSProperty handler. 
        MessageDialog.openInformation(Display.getDefault().getActiveShell(), "MMSProperty", "Tool not implemented!");
    }

}
