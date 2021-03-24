package fr.softeam.cameldesigner.handlers.tools.coretools;

import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.model.ITransaction;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;

public class CreateMetricTypeModel extends CreateSubModelTool {

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

    @Override
    public boolean acceptElement(IDiagramHandle arg0, IDiagramGraphic arg1) {
        return super.acceptElement(arg1);
    }
}
