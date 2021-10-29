package fr.softeam.cameldesigner.handlers.tools.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.model.ITransaction;

/**
 * @author kchaabouni
 */
@objid ("3a4b14ed-fb6c-4c30-97df-f67e1b86e375")
public class CreateDeploymentTypeModel extends CreateSubModelTool {
    @objid ("f5535515-77b8-4985-9adc-9736c0b1844e")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        try( ITransaction transaction = CamelDesignerModule.getInstance().getModuleContext().getModelingSession().createTransaction(" Create Deployment Type Model")){
        
            DeploymentTypeModel.create();
        
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

    @objid ("2cfe3496-b7fe-422a-b419-f3286ed3a1a9")
    @Override
    public boolean acceptElement(IDiagramHandle arg0, IDiagramGraphic arg1) {
        return super.acceptElement(arg1);
    }

}
