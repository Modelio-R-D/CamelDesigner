package fr.softeam.cameldesigner.handlers.tools.constraint;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramLink.LinkRouterKind;
import org.modelio.api.modelio.diagram.IDiagramNode;
import org.modelio.api.modelio.diagram.ILinkPath;
import org.modelio.api.modelio.diagram.tools.DefaultMultiLinkTool;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.vcore.smkernel.mapi.MObject;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CamelConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.LogicalConstraint;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;

@objid ("7616b101-4de1-40cd-9a7e-6aaf488e8be6")
public class LogicalConstraintTool extends DefaultMultiLinkTool {
    @objid ("cadfeb64-774a-419f-bc47-d5945c19d12f")
    @Override
    public boolean acceptFirstElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        MObject element = targetNode.getElement();
        return CamelConstraint.canInstantiate(element);
    }

    @objid ("99b35cf8-7f90-4ea6-85f6-ba8fa80b1f3c")
    @Override
    public boolean acceptAdditionalElement(final IDiagramHandle diagramHandle, final List<IDiagramGraphic> previousNodes, final IDiagramGraphic targetNode) {
        MObject element = targetNode.getElement();
        return CamelConstraint.canInstantiate(element);
    }

    @objid ("8d8b5d76-7ff7-41dd-9f64-6aab4e2c4ddc")
    @Override
    public boolean acceptLastElement(final IDiagramHandle diagramHandle, final List<IDiagramGraphic> otherNodes, final IDiagramGraphic targetNode) {
        MObject element = targetNode.getElement();
        return (!(CamelConstraint.canInstantiate(element)));
    }

    @objid ("64c10f0a-98ee-4f6f-a115-6824c25abd7a")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic lastNode, final List<IDiagramGraphic> otherNodes, final List<LinkRouterKind> routerKinds, final List<ILinkPath> paths, final Rectangle rectangle) {
        IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();

        try( ITransaction transaction = session.createTransaction("Logical Constraint")){

            LogicalConstraint camelElt = LogicalConstraint.create();

            for(IDiagramGraphic otherNode : otherNodes) {
                camelElt.addConstrained(CamelConstraint.instantiate((Constraint) otherNode.getElement()));
            }

            List<IDiagramGraphic> graph = diagramHandle.unmask(camelElt.getElement(), rectangle.x, rectangle.y);

            if((graph != null) &&  (graph.size() > 0) && (graph.get(0) instanceof IDiagramNode))
                ((IDiagramNode)graph.get(0)).setBounds(rectangle);

            diagramHandle.save();
            diagramHandle.close();
            transaction.commit ();
        }
    }

}
