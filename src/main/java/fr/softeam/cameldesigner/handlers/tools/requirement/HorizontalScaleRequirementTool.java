package fr.softeam.cameldesigner.handlers.tools.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;

@objid ("8b3ff840-5ea7-4a20-b72a-62b2da8608c8")
public class HorizontalScaleRequirementTool extends DefaultBoxTool {
    @objid ("c0f0debf-c5d2-4c26-87c1-312ea7eede69")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        // TODO Auto-generated method stub
        return false;
    }

    @objid ("ede9f8ad-781b-4c82-93f5-72da55e77c20")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        // TODO implement the CreateHorizontalScaleRequirementTool handler. 
        MessageDialog.openInformation(Display.getDefault().getActiveShell(), "CreateHorizontalScaleRequirementTool", "Tool not implemented!");
    }

}
