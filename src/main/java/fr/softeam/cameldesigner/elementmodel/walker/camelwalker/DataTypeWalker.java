package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import camel.data.Data;
import camel.data.DataSource;
import camel.data.DataTypeModel;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;

public class DataTypeWalker extends AbstractCamelWalker {
    public DataTypeWalker(AbstractReverseProcess reverseProcess) {
        this.reverseProcess = reverseProcess;
    }

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
