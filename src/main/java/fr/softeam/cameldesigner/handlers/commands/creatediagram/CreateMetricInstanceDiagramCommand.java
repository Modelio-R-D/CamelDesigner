package fr.softeam.cameldesigner.handlers.commands.creatediagram;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetricInstanceModelDiagram;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel;
import fr.softeam.cameldesigner.handlers.commands.createsubmodel.CreateSubModelCommand;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("450f0e91-c35a-4379-9249-5bd15799f2bc")
public class CreateMetricInstanceDiagramCommand extends CreateSubModelCommand {
    @objid ("45548d34-5b86-42b3-b880-0eea5f0ae919")
    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        MetricInstanceModel subModel = (MetricInstanceModel) selectedElements.get(0);
        
        IModuleContext moduleContext = module.getModuleContext();
        IModelingSession session = moduleContext.getModelingSession();
        
        try( ITransaction transaction = session.createTransaction("Create Metric Instance Diagram")){
        
            MetricInstanceModelDiagram diagram = MetricInstanceModelDiagram.create();
        
            subModel.getElement().getProduct().add(diagram.getElement());
        
            diagram.setDefaultName(subModel.getName() + " diagram");
            this.openDiagram(diagram.getElement());
        
            transaction.commit();
        }
    }

}
