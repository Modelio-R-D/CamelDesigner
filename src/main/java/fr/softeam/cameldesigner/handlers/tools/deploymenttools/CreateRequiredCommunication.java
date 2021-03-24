package fr.softeam.cameldesigner.handlers.tools.deploymenttools;

import java.util.List;
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
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;

public class CreateRequiredCommunication extends DefaultBoxTool {
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        return
                targetNode.getElement() instanceof org.modelio.metamodel.uml.statik.Class
                && ((org.modelio.metamodel.uml.statik.Class) targetNode.getElement())
                .isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponent.STEREOTYPE_NAME);
    }

    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {

        IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
        try( ITransaction transaction = session.createTransaction(" Create Required Communications")){

            MObject element =  parent.getElement();

            if (element instanceof AbstractDiagram) {
                element = ((AbstractDiagram) element).getOrigin();
            }

            CommunicationPort comPort = CommunicationPort.create();
            Port  port = comPort.getElement();
            ((Classifier) element).getInternalStructure().add(port);
            port.setDirection(PortOrientation.IN);

            List<IDiagramGraphic> graph = diagramHandle.unmask(port, rect.x, rect.y);

            if((graph != null) &&  (graph.size() > 0) && (graph.get(0) instanceof IDiagramNode))
                ((IDiagramNode)graph.get(0)).setBounds(rect);

            diagramHandle.save();
            diagramHandle.close();
            transaction.commit ();
        }
    }

}
