package fr.softeam.cameldesigner.handlers.tools.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.model.ITransaction;

@objid ("5bd7bf23-4070-4e06-a901-566028ce708d")
public class CreateMetricTypeModel extends CreateSubModelTool {
    @objid ("6715dbd9-8ddb-42dd-9822-66ba38100a9a")
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

    @objid ("cb694b69-7b58-4837-aac3-97c6724481d6")
    @Override
    public boolean acceptElement(IDiagramHandle arg0, IDiagramGraphic arg1) {
        return super.acceptElement(arg1);
    }

}
