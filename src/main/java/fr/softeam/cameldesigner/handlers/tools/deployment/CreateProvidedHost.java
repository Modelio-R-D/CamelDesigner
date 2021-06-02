package fr.softeam.cameldesigner.handlers.tools.deployment;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramNode;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.PortOrientation;
import org.modelio.vcore.smkernel.mapi.MObject;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;

@objid ("e62b8c02-35d3-4191-8f5c-4f04228fde13")
public class CreateProvidedHost extends DefaultBoxTool {
    @objid ("7bd93943-fbfc-4213-ab4c-109a562cf838")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        return
                targetNode.getElement() instanceof org.modelio.metamodel.uml.statik.Class
                && ((org.modelio.metamodel.uml.statik.Class) targetNode.getElement())
                .isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponent.STEREOTYPE_NAME);
    }

    @objid ("a4cb81c0-a711-4d8b-b830-3ff972c1749f")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
        try( ITransaction transaction = session.createTransaction("Create Provided Host")){

            MObject element =  parent.getElement();

            if (element instanceof AbstractDiagram) {
                element = ((AbstractDiagram) element).getOrigin();
            }

            HostingPort hostPort = HostingPort.create();
            Port  port = hostPort.getElement();
            ((Classifier) element).getInternalStructure().add(port);
            port.setDirection(PortOrientation.OUT);

            List<IDiagramGraphic> graph = diagramHandle.unmask(port, rect.x, rect.y);

            if((graph != null) &&  (graph.size() > 0) && (graph.get(0) instanceof IDiagramNode))
                ((IDiagramNode)graph.get(0)).setBounds(rect);

            diagramHandle.save();
            diagramHandle.close();
            transaction.commit ();
        }
    }

}
