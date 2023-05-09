package fr.softeam.cameldesigner.handlers.tools.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.substitution.Precedes;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramLink.LinkRouterKind;
import org.modelio.api.modelio.diagram.ILinkPath;
import org.modelio.api.modelio.diagram.tools.DefaultLinkTool;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("a867dea3-5a28-4652-b836-e37cf6046c74")
public class CreatePrecedes extends DefaultLinkTool {
    @objid ("362722a1-c0b5-4f43-9613-ced64e8cb8f3")
    private SoftwareComponent sof1 = null;

    @objid ("2bf0976c-881d-4ee4-be66-71a6461d0ae8")
    private SoftwareComponent sof2 = null;

    @objid ("18f78fdc-a524-489c-a2fb-ecefa6e22d37")
    @Override
    public boolean acceptFirstElement(IDiagramHandle arg0, IDiagramGraphic sourceNode) {
        MObject element = sourceNode.getElement();
        
        if (SoftwareComponent.canInstantiate(element)){
            this.sof1 = SoftwareComponent.instantiate((org.modelio.metamodel.uml.statik.Component)element);
            return true;
        }
        return false;
    }

    @objid ("daec5dc3-788f-4e14-8728-023ed99d69ba")
    @Override
    public boolean acceptSecondElement(IDiagramHandle arg0, IDiagramGraphic arg1, IDiagramGraphic targetNode) {
        MObject element = targetNode.getElement();
        
        if (SoftwareComponent.canInstantiate(element)){
            this.sof2 = SoftwareComponent.instantiate((org.modelio.metamodel.uml.statik.Component)element);
            return true;
        }
        return false;
    }

    @objid ("4974ad49-5e68-402c-8dc7-0263607687d9")
    @Override
    public void actionPerformed(IDiagramHandle diagramHandle, IDiagramGraphic arg1, IDiagramGraphic arg2, LinkRouterKind arg3, ILinkPath linkPath) {
        // TODO Auto-generated method stub
        // create element subsitition , sterotype precedes
        // arg1 sof1 arg2 sof2
        
        
        IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
        try( ITransaction transaction = session.createTransaction(" Precedes Relation")){
        
        
            Precedes camelElt = Precedes.create();
            camelElt.addPrecededComponents(this.sof1);
            camelElt.setComponent(this.sof2);
        
            diagramHandle.unmask(camelElt.getElement(),linkPath.getPoints().get(0).x,linkPath.getPoints().get(1).x);
        
        
            diagramHandle.save();
            diagramHandle.close();
            transaction.commit ();
            }
    }

}
