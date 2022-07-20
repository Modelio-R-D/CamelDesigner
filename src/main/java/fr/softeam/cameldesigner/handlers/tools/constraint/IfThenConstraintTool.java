package fr.softeam.cameldesigner.handlers.tools.constraint;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CamelConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.IfThenConstraint;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
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

@objid ("774c1663-d665-4621-9d32-97321d5e8082")
public class IfThenConstraintTool extends DefaultMultiLinkTool {
    @objid ("d849ecd1-d61e-4ca7-b0fc-4d73270cec7c")
    private CamelConstraint _if = null;

    @objid ("5711956a-6630-4c64-95d2-d3e8d9cf8b8f")
    private CamelConstraint _then = null;

    @objid ("d5addffe-faa5-4cff-b560-74707f363fa0")
    private CamelConstraint _else = null;

    @objid ("5c18db68-1980-42c2-ac90-ced4102ea070")
    @Override
    public boolean acceptFirstElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        MObject element = targetNode.getElement();
        
        if (CamelConstraint.canInstantiate(element)){
            this._if = CamelConstraint.instantiate((Constraint)element);
            return true;
        }
        return false;
    }

    @objid ("7a9a3c9a-45ab-4466-9e8d-fc7a0010148c")
    @Override
    public boolean acceptAdditionalElement(final IDiagramHandle diagramHandle, final List<IDiagramGraphic> previousNodes, final IDiagramGraphic targetNode) {
        MObject element = targetNode.getElement();
        
        if (CamelConstraint.canInstantiate(element)){
            if (this._then == null) {
                this._then = CamelConstraint.instantiate((Constraint)element);
                return true;
            }else if (this._else == null) {
                this._else = CamelConstraint.instantiate((Constraint)element);
                return true;
            }
        }
        return false;
    }

    @objid ("e69e8d72-d9a2-4ee9-a477-693fe7e1ad47")
    @Override
    public boolean acceptLastElement(final IDiagramHandle diagramHandle, final List<IDiagramGraphic> otherNodes, final IDiagramGraphic targetNode) {
        MObject element = targetNode.getElement();
        return (!(CamelConstraint.canInstantiate(element)))
                || ((this._if != null)
                        && (this._else != null)
                        && (this._then != null));
    }

    @objid ("4230c420-00d1-4882-bb99-653b4bc5bd66")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic lastNode, final List<IDiagramGraphic> otherNodes, final List<LinkRouterKind> routerKinds, final List<ILinkPath> paths, final Rectangle rectangle) {
        IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
        try( ITransaction transaction = session.createTransaction(" If Then Constraint")){
        
        
            IfThenConstraint camelElt = IfThenConstraint.create();
            camelElt.setIf(this._if);
            camelElt.setThen(this._then);
            if (this._else != null)
                camelElt.setElse(this._else);
        
            List<IDiagramGraphic> graph = diagramHandle.unmask(camelElt.getElement(), rectangle.x, rectangle.y);
        
            if((graph != null) &&  (graph.size() > 0) && (graph.get(0) instanceof IDiagramNode))
                ((IDiagramNode)graph.get(0)).setBounds(rectangle);
        
            diagramHandle.save();
            diagramHandle.close();
            transaction.commit ();
        }
    }

}
