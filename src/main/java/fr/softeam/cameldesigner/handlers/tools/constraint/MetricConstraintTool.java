package fr.softeam.cameldesigner.handlers.tools.constraint;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricConstraint;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramLink.LinkRouterKind;
import org.modelio.api.modelio.diagram.ILinkPath;
import org.modelio.api.modelio.diagram.tools.DefaultAttachedBoxTool;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.uml.statik.Class;

@objid ("7b7efe89-1d57-4957-aae9-fb815fc621bb")
public class MetricConstraintTool extends DefaultAttachedBoxTool {
    @objid ("cb74075c-6c57-41ae-b28c-e7848e12f30c")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        return (MetricContext.canInstantiate(targetNode.getElement()));
    }

    @objid ("8d400ba4-dfeb-4edf-bded-0884ecb7545e")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic originNode, final LinkRouterKind routerType, final ILinkPath path, final Point point) {
        IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
        try( ITransaction transaction = session.createTransaction("Metric Constraint")){
        
            MetricConstraint camelElt = MetricConstraint.create();
            MetricContext context = MetricContext.instantiate((Class) originNode.getElement());
            camelElt.setMetricContext(context);
        
            diagramHandle.unmask(camelElt.getElement(), point.x, point.y);
        
            diagramHandle.save();
            diagramHandle.close();
            transaction.commit ();
        }
    }

    @objid ("eeba4994-5bec-4d9e-891b-09c0c14996b8")
    @Override
    public void actionPerformedInDiagram(final IDiagramHandle diagramHandle, final Rectangle rect) {
        IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
        try( ITransaction transaction = session.createTransaction("Metric Constraint")){
        
            MetricConstraint camelElt = MetricConstraint.create();
        
            diagramHandle.unmask(camelElt.getElement(), rect.x, rect.y);
        
            diagramHandle.save();
            diagramHandle.close();
            transaction.commit ();
        }
    }

}
