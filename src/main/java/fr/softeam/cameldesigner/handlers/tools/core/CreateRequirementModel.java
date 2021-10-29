package fr.softeam.cameldesigner.handlers.tools.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.model.ITransaction;

@objid ("9ebc4125-3a2e-4fff-905c-9a2e29f51559")
public class CreateRequirementModel extends CreateSubModelTool {
    @objid ("a942f142-dfb7-470f-8a87-bbf0a216055b")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        try( ITransaction transaction = CamelDesignerModule.getInstance().getModuleContext().getModelingSession().createTransaction(" Create Deployment Type Model")){
        
        //            MObject element =  parent.getElement();
        //
        //            if (element instanceof AbstractDiagram) {
        //                element = ((AbstractDiagram) element).getOrigin();
        //            }
        //
        //
        //
        //            if((graph != null) &&  (graph.size() > 0) && (graph.get(0) instanceof IDiagramNode))
        //                ((IDiagramNode)graph.get(0)).setBounds(rect);
        //
        //            diagramHandle.save();
        //            diagramHandle.close();
        //            transaction.commit ();
        }
    }

    @objid ("92af5116-7b1e-4a14-bf03-ee8ad5581218")
    @Override
    public boolean acceptElement(IDiagramHandle arg0, IDiagramGraphic arg1) {
        return super.acceptElement(arg1);
    }

}
