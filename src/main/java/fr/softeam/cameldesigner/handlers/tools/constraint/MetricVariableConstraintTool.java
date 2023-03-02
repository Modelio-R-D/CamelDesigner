package fr.softeam.cameldesigner.handlers.tools.constraint;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricVariableConstraint;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable;
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

@objid ("542becab-4637-4324-b50a-ac6d2ffcbca1")
public class MetricVariableConstraintTool extends DefaultAttachedBoxTool {
    @objid ("780dbd64-3bd3-4f12-8921-03a708422486")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        return (MetricVariable.canInstantiate(targetNode.getElement()));
    }

    @objid ("2d9919c0-1ec8-4aa7-825f-ffb4a16c6fe6")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic originNode, final LinkRouterKind routerType, final ILinkPath path, final Point point) {
        IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
        try( ITransaction transaction = session.createTransaction("Metric Variable Constraint")){
        
            MetricVariableConstraint camelElt = MetricVariableConstraint.create();
            MetricVariable var = MetricVariable.instantiate((Class) originNode.getElement());
            camelElt.setMetricVariable(var);
        
            diagramHandle.unmask(camelElt.getElement(), point.x, point.y);
        
            diagramHandle.save();
            diagramHandle.close();
            transaction.commit ();
        }
    }

    @objid ("94ddbfba-3e29-4e7e-b920-072154c70fea")
    @Override
    public void actionPerformedInDiagram(final IDiagramHandle diagramHandle, final Rectangle rect) {
        IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
        try( ITransaction transaction = session.createTransaction("Metric Variable Constraint")){
        
            MetricVariableConstraint camelElt = MetricVariableConstraint.create();
            diagramHandle.unmask(camelElt.getElement(), rect.x, rect.y);
        
            diagramHandle.save();
            diagramHandle.close();
            transaction.commit ();
        }
    }

}
