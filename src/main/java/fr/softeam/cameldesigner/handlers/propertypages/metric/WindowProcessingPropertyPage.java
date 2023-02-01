package fr.softeam.cameldesigner.handlers.propertypages.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.WindowProcessing;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("cc93c712-d93f-4c6f-96de-30a658f4083a")
public class WindowProcessingPropertyPage<T extends WindowProcessing> extends FeaturePropertyPage<T> {
    @objid ("389e8f30-9af5-45e0-9edb-1711c5d5853a")
    public WindowProcessingPropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("2164317d-984b-422c-8593-c2efa2143478")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            this._element.setProcessingType(value);
        }
           
        this._currentRow -= 1;
    }

    @objid ("e12a75d9-08a7-48b5-9a6e-cb2155a42f5f")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Processing type
        table.addProperty("Processing type", getNotNull(this._element.getProcessingType()));
    }

}
