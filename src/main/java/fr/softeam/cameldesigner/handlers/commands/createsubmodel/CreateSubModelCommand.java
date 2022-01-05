package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.infrastructure.abstractdiagram.AbstractCamelDiagram;
import org.modelio.api.modelio.IModelioServices;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramService;
import org.modelio.api.modelio.diagram.dg.IDiagramDG;
import org.modelio.api.modelio.diagram.style.IStyleHandle;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.diagrams.AbstractDiagram;

@objid ("1d668fba-8879-4021-a656-78f1dba542b1")
public abstract class CreateSubModelCommand extends DefaultModuleCommandHandler {
    @objid ("0d76d8b8-2f41-4d56-9b8b-b5fe8bcfa7ca")
    protected void openDiagram(AbstractCamelDiagram diag, IModelioServices modelioServices, final String styleName) {
        AbstractDiagram diagram = diag.getElement();
        IDiagramService ds = modelioServices.getDiagramService();
        
        try(  IDiagramHandle handler = ds.getDiagramHandle(diagram);){
            IDiagramDG dg = handler.getDiagramNode();
        
            for (IStyleHandle style : ds.listStyles()){
                if (style.getName().equals(styleName)){
                    dg.setStyle(style);
                    break;
                }
            }
        
            handler.save();
            handler.close();
        
            modelioServices.getEditionService().openEditor(diagram);
        }
    }

}
