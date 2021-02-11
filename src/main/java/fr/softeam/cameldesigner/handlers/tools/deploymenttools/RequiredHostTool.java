package fr.softeam.cameldesigner.handlers.tools.deploymenttools;

import java.util.List;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
import fr.softeam.cameldesigner.elementmodel.umlmodel.UmlDeploymentService;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramNode;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.PortOrientation;
import org.modelio.vcore.smkernel.mapi.MObject;

public class RequiredHostTool extends DefaultBoxTool {
    private UmlDeploymentService umlDeploymentService = new UmlDeploymentService();

    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        MObject element = targetNode.getElement();
        return (element instanceof Component) ;
    }

    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
        try( ITransaction transaction = session.createTransaction ("Create provided Communication")){
            Component element = (Component) parent.getElement();
        
            Port port = session.getModel().createPort("", element);
            port.setDirection(PortOrientation.IN);
            port.getExtension().add(HostingPort.MdaTypes.STEREOTYPE_ELT);
            List<IDiagramGraphic> graph = diagramHandle.unmask(port, rect.x, rect.y);
        
            if((graph != null) &&  (graph.size() > 0) && (graph.get(0) instanceof IDiagramNode))
                ((IDiagramNode)graph.get(0)).setBounds(rect);
        
            diagramHandle.save();
            diagramHandle.close();
            transaction.commit ();
        }
    }

}
