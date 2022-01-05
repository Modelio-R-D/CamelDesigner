package fr.softeam.cameldesigner.handlers.tools.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.OrganisationModelDiagram;
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;

@objid ("ba54f307-5564-4d48-b411-d7936e4f9c1a")
public class CreateOrganisationModelTool extends CreateSubModelTool {
    @objid ("77d78ebd-a732-458b-8f18-ca00547ab7f7")
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        ClassDiagram diag = (ClassDiagram) parent.getElement();
        org.modelio.metamodel.uml.statik.Package packageOwner = (org.modelio.metamodel.uml.statik.Package) diag.getOrigin();
        
        IModuleContext moduleContext = CamelDesignerModule.getInstance().getModuleContext();
        IModelingSession session = moduleContext.getModelingSession();
        
        try( ITransaction transaction = session.createTransaction("Create Organisation Model")){
        
            OrganisationModel subModel = OrganisationModel.create();
            OrganisationModelDiagram diagram = OrganisationModelDiagram.create();
        
            packageOwner.getOwnedElement().add(subModel.getElement());
            subModel.getElement().getProduct().add(diagram.getElement());
            diagramHandle.unmask(subModel.getElement(), rect.x, rect.y);
            subModel.setDefaultName("Organisation Model");
            diagram.setDefaultName("Organisation Diagram");
            
            this.openDiagram(diagram, moduleContext.getModelioServices(), ICamelDesignerPeerModule.CAMEL_STYLE);
        
            transaction.commit();
            }
    }

    @objid ("18bddd92-d3c5-45fd-894f-fbe4d7d85350")
    @Override
    public boolean acceptElement(IDiagramHandle arg0, IDiagramGraphic arg1) {
        return super.acceptElement(arg1);
    }

}
