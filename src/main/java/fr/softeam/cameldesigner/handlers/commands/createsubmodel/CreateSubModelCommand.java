package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import org.modelio.api.modelio.IModelioServices;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramService;
import org.modelio.api.modelio.diagram.dg.IDiagramDG;
import org.modelio.api.modelio.diagram.style.IStyleHandle;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.AbstractCamelDiagram;

public abstract class CreateSubModelCommand extends DefaultModuleCommandHandler{


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
