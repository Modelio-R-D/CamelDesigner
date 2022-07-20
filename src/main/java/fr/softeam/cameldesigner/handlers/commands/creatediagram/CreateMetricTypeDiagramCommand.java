package fr.softeam.cameldesigner.handlers.commands.creatediagram;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetricTypeModelDiagram;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
import fr.softeam.cameldesigner.handlers.commands.createsubmodel.CreateSubModelCommand;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("17cc7ff9-694c-4565-b6b2-f7bdf2ca6772")
public class CreateMetricTypeDiagramCommand extends CreateSubModelCommand {
    @objid ("e959e3fa-482d-4022-a417-5fd9aa369fa2")
    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        MetricTypeModel subModel = (MetricTypeModel) selectedElements.get(0);
        
        IModuleContext moduleContext = module.getModuleContext();
        IModelingSession session = moduleContext.getModelingSession();
        
        try( ITransaction transaction = session.createTransaction("Create Metric Type Diagram")){
        
            MetricTypeModelDiagram diagram = MetricTypeModelDiagram.create();
        
            subModel.getElement().getProduct().add(diagram.getElement());
        
            diagram.setDefaultName(subModel.getName() + " diagram");
            this.openDiagram(diagram.getElement());
        
            transaction.commit();
        }
    }

}
