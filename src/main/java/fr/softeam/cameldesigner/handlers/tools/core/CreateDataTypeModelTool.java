package fr.softeam.cameldesigner.handlers.tools.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataModelDiagram;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;

@objid ("5516cf21-9c77-4539-a3f4-bd3d0f20a64a")
public class CreateDataTypeModelTool extends CreateSubModelTool {
    @objid ("3db81e91-48e9-49bb-89e1-d129f33dbf15")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        ClassDiagram diag = (ClassDiagram) parent.getElement();
        org.modelio.metamodel.uml.statik.Package packageOwner = (org.modelio.metamodel.uml.statik.Package) diag.getOrigin();
        
        IModuleContext moduleContext = CamelDesignerModule.getInstance().getModuleContext();
        IModelingSession session = moduleContext.getModelingSession();
        
        try( ITransaction transaction = session.createTransaction("Create Data Type Model")){
        
            DataTypeModel subModel = DataTypeModel.create();
            DataModelDiagram diagram = DataModelDiagram.create();
        
            packageOwner.getOwnedElement().add(subModel.getElement());
            subModel.getElement().getProduct().add(diagram.getElement());
            diagramHandle.unmask(subModel.getElement(), rect.x, rect.y);
            subModel.setDefaultName("Data Type Model");
            diagram.setDefaultName("Data Type Diagram");
        
        
            transaction.commit();
        }
    }

    @objid ("024715f1-0c62-4763-9f3d-8fdf1a852ef7")
    @Override
    public boolean acceptElement(IDiagramHandle arg0, IDiagramGraphic arg1) {
        return super.acceptElement(arg1);
    }

}
