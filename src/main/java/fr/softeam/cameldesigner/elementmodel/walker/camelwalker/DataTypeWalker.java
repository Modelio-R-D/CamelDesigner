package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import camel.data.Data;
import camel.data.DataSource;
import camel.data.DataTypeModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;

@objid ("59e1722c-6ddf-4b0e-b914-e7ad7e99436a")
public class DataTypeWalker extends AbstractCamelWalker {
    @objid ("a9d945d7-e323-4703-88a6-41292a8a1c4e")
    public DataTypeWalker(AbstractReverseProcess reverseProcess) {
        this.reverseProcess = reverseProcess;
    }

    @objid ("7e1ae873-b460-42ac-bb54-097971c1220f")
    @Override
    protected void walkChildren(Object processedElement, CamelElement resultedElement) {
        if(processedElement instanceof DataTypeModel) {
            
            DataTypeModel dataTypeModel = (DataTypeModel) processedElement;
        
            for( DataSource dataSource: dataTypeModel.getDataSources()) {
                this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                walk(dataSource);
        
            }
            for( Data data: dataTypeModel.getData()) {
                this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                walk(data);
            }
        }
    }

}
