package fr.softeam.cameldesigner.handlers.tools.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.model.ITransaction;
import fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;


@objid ("d55fbc99-67a6-48d4-8f38-e928d620d567")
public class CreateExecutionModel extends CreateSubModelTool {
    @objid ("607e14ef-828a-4f7a-bee8-40bbdd893a7a")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        try( ITransaction transaction = CamelDesignerModule.getInstance().getModuleContext().getModelingSession().createTransaction(" Create Execution Model")){

        	ExecutionModel.create();

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

    @objid ("ba437630-306a-484d-9469-cc3ba4a52b62")
    @Override
    public boolean acceptElement(IDiagramHandle arg0, IDiagramGraphic arg1) {
        return super.acceptElement(arg1);
    }

}
